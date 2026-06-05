package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring_Supermercado;
			////////////CODIGO ORIGINAL /////////////
public class Supermercado {
	
	/* A primera vista parece que la clase cliente hace "Feature envy" de la clase
	 * Direccion, ya que invoca todos sus atributo para formatearla. 
	 * Este trabajo lo debería hacer Dirección, o sea formatearse a si misma.
	 * Aplicaremos "Extract Method" en la clase cliente y llevaremos el metodo a Direccion
	*/
		public void notificarPedido(long nroPedido, Cliente cliente) {
			String notificacion = MessageFormat.format(“Estimado cliente, se le informa 
								  que hemos recibido su pedido con número {0}, el cual 
								  será enviado a la dirección {1}”, new Object[] 
								  { nroPedido, cliente.getDireccionFormateada() });
			// lo imprimimos en pantalla, podría ser un mail, SMS, etc..
			System.out.println(notificacion);
			}
		}
		public class Cliente {
			public String getDireccionFormateada() {
				return
						this.direccion.getLocalidad() + “, ” +
						this.direccion.getCalle() + “, ” +
						this.direccion.getNumero() + “, ” +
						this.direccion.getDepartamento();
		}
	
	//////////// ESTO NO ESTABA EN EL CÓDIGO //////////////
		public class Direccion {
			public String localidad;
			public String calle;
			public String numero;
			public String departamento;
			
			// todos los getters
		}
		
		
				//////////// REFACTORIZACIÓN EXTRACT METHOD ////////////
		
		public void notificarPedido(long nroPedido, Cliente cliente) {
			String notificacion = MessageFormat.format(“Estimado cliente, se le informa 
								  que hemos recibido su pedido con número {0}, el cual 
								  será enviado a la dirección {1}”, new Object[] 
								  { nroPedido, cliente.getDireccion() });
			// lo imprimimos en pantalla, podría ser un mail, SMS, etc..
			System.out.println(notificacion);
			}
		  // En la clase Supermercado se cambió el nombre del llamado al método del cliente,
		  // Se re nombro el nombre del método.
		}
		public class Cliente {
			private Direccion direccion;
			
			public String getDireccion() {
				return this.direccion.toString();
				// En cliente se cambio el nombre por			
		} 
	
		public class Direccion {
			public String localidad;
			public String calle;
			public String numero;
			public String departamento;
			
			@Override
		    public String toString() {
		        return this.localidad + ", " + this.calle  + ", " + this.numero + ", " + this.departamento;
		    }

	// TAMBIÉN SE PUEDE VER QUE LAS VARIABLES DE DIRECCION ROMPEN EL ENCAPSULAMIENTO 
	// AL SER PUBLICAS, YA QUE LAS DEMÁS CLASES TIENEN ACCESO A ELLAS.
	// REFACTORIZAMOS HACIENDO "ENCAPSULATE FIELD" encapsular campos
		}
		
		//////////// REFACTORIZACIÓN "ENCAPSULATE FIELD" ////////////
		
		public void notificarPedido(long nroPedido, Cliente cliente) {
			String notificacion = MessageFormat.format(“Estimado cliente, se le informa 
								  que hemos recibido su pedido con número {0}, el cual 
								  será enviado a la dirección {1}”, new Object[] 
								  { nroPedido, cliente.getDireccion() });
			// lo imprimimos en pantalla, podría ser un mail, SMS, etc..
			System.out.println(notificacion);
			}
		} // En la clase Supermercado se camio el nombre del llamado al metodo del cliente
		
		public class Cliente {
			private Direccion direccion;
			
			public String getDireccion() {
				return this.direccion.toString();
						
		} // En cliente se cambio el nombre por direccion
	
		public class Direccion {
			private String localidad;
			private String calle;
			private String numero;
			private String departamento;
			
		
			public String getLocalidad() {
				return localidad;
			}
			public void setLocalidad(String localidad) {
				this.localidad = localidad;
			}
			public String getCalle() {
				return calle;
			}
			public void setCalle(String calle) {
				this.calle = calle;
			}
			public String getNumero() {
				return numero;
			}
			public void setNumero(String numero) {
				this.numero = numero;
			}
			public String getDepartamento() {
				return departamento;
			}
			public void setDepartamento(String departamento) {
				this.departamento = departamento;
			}
			@Override
		    public String toString() {
		        return this.localidad + ", " + this.calle  + ", " + this.numero + ", " + this.departamento;
		    }
			
			/* POR ULTIMO VEMOS QUE LA CLASE CLIENTE HACE DE INTERMEDIARIO ENTRE LA CLASE
			 * SUPERMERCADO Y DITECCION MIDDLE MAN. REFACTOEIZAMOS ELIMINANDO EL MIDDLE MAN
			 * */
		
			////////////REFACTORIZACIÓN "MIDDLE MAN" ////////////
			
		public void notificarPedido(long nroPedido, Direccion direccion) {
			String notificacion = MessageFormat.format(“Estimado cliente, se le informa 
								  que hemos recibido su pedido con número {0}, el cual 
								  será enviado a la dirección {1}”, new Object[] 
								  { nroPedido, direccion.toString() });// <-----------------
			// lo imprimimos en pantalla, podría ser un mail, SMS, etc..
			System.out.println(notificacion);
			}
		} // En la clase Supermercado se cambio el nombre del llamado al método del cliente
		
		
	
		public class Direccion {
			private String localidad;
			private String calle;
			private String numero;
			private String departamento;
			
		
			public String getLocalidad() {
				return localidad;
			}
			public void setLocalidad(String localidad) {
				this.localidad = localidad;
			}
			public String getCalle() {
				return calle;
			}
			public void setCalle(String calle) {
				this.calle = calle;
			}
			public String getNumero() {
				return numero;
			}
			public void setNumero(String numero) {
				this.numero = numero;
			}
			public String getDepartamento() {
				return departamento;
			}
			public void setDepartamento(String departamento) {
				this.departamento = departamento;
			}
			@Override
		    public String toString() {
		        return this.localidad + ", " + this.calle  + ", " + this.numero + ", " + this.departamento;
		    }
			
	
}
