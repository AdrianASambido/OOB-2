package ar.edu.unlp.objetos.uno.ejercicio7_Refactoring_Etiquetas;

/* Inspeccionamos los métodos para asegurarnos de que sean idénticos.
 * Si realizan la misma función, pero no son idénticos, refactorizamos hasta que tengan
 * cuerpos idénticos.
 * Verificamos que todas las llamadas a métodos y referencias a campos dentro del cuerpo 
 * del método apunten a características que se pueden llamar desde la superclase.
 * Si los métodos tienen firmas diferentes, usamos la instrucción Cambiar declaración de 
 * función (nombre) para que coincidan con la que se desea usar en la superclase.
 * Creamos un nuevo método en la superclase. Copiamos el cuerpo de uno de los métodos en él.
 * Ejecutamos comprobaciones estáticas.
 * Eliminamos un método de la subclase.
 * Probamos.
 * Seguimos eliminando métodos de la subclase hasta que no quede ninguno.*/

///////////// CÓDIGO ORIGINAL ///////////////////////
/*
public abstract class Etiqueta {
		protected String nombreProducto;
		protected double precio; // ENCAPSULATE FIELD
		
		public Etiqueta(String nombre, double precio) {
			this.nombreProducto = nombre;
			this.precio = precio;
		}
	}
	class EtiquetaSimple extends Etiqueta {
		public EtiquetaSimple(String nombre, double precio) {
		super(nombre, precio);
		}
		
		public void generar() {
			System.out.println("--- ETIQUETA BÁSICA ---");
			System.out.println("Producto: " + nombreProducto);
			System.out.println("Precio: $" + precio);
			System.out.println("-----------------------");
		}
	}
	class EtiquetaDetalle extends Etiqueta {
		public EtiquetaDetalle(String nombre, double precio) {
			super(nombre, precio);
		}
		
		public void generar() {
			System.out.println("--- ETIQUETA DETALLE ---");
			System.out.println("Producto: " + nombreProducto);
			System.out.println("Precio sin imp.: $" + (precio * 0.79));
			System.out.println("Precio final: $" + precio);
			System.out.println("-----------------------");
		}
	}
	/*	Tareas:
		1. ¿Hay código duplicado? Indique claramente en qué líneas se encuentra.
		2. Se quiere aplicar el refactoring Pull Up Method para subir el método generar() 
		  a la superclase Etiqueta. ¿Es posible hacerlo en el código anterior? Justifique
		   su respuesta basándose en las precondiciones del refactoring vistas en
		    la teoría y en el libro de Refactoring de Martin Fowler.
		3. Mencione los refactorings previos necesarios para que sea posible aplicar
		   Pull Up Method.
		4. Aplique Pull Up Method para subir el método generar() a la superclase Etiqueta.
    
    *
    */
	
	////////////////// REFACTIRIZAMOS CREAMOS UN METODO EN LA SUPERCLASE ///////////////
	/////// Y PONEMOS LOS ATRIBUTOS EN PRIVADO PARA NO ROMPER EL ENCAPSULAMIENTO ////////
	
	public abstract class Etiqueta {
		private String nombreProducto;
		private double precio;        // ENCAPSULATE FIELD
		
		public Etiqueta(String nombre, double precio) {
			this.nombreProducto = nombre;
			this.precio = precio;
		}		
	//// CREAMOS EL METODO NUEVO Y COPIAMOS LOS CAMPOS EN COMÚN ////	
		public void generar() {
			imprimirEtiqueta();		// HACER LLAMADO
			System.out.println("Producto: " + nombreProducto);
			imprimirDetalleDePrecio();		// HACER LLAMADO
			System.out.println("-----------------------");
		}	  
		public abstract void imprimirEtiqueta(); //Para obligar a las hijas a declarar estos metodos 
		public abstract void imprimirDetalleDePrecio();
		public String getNombreProducto() {
			return nombreProducto;
		}
		public void setNombreProducto(String nombreProducto) {
			this.nombreProducto = nombreProducto;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
}		
	/*
	//---------------------------------------------------	
	class EtiquetaSimple extends Etiqueta {
		public EtiquetaSimple(String nombre, double precio) {
		super(nombre, precio);
		}
	/// CREAMOS METODOS EN LAS SUBCLASES CON LOS CAMPOS DIFERENTES ///	
		public void imprimirEtiqueta() { //  
			System.out.println("--- ETIQUETA BÁSICA ---");
		}
		public void imprimirDetalleDePrecio() {
			System.out.println("Precio: $" + precio);
		}
	}
	//---------------------------------------------------
	class EtiquetaDetalle extends Etiqueta {
		public EtiquetaDetalle(String nombre, double precio) {
			super(nombre, precio);
		}
	/// CREAMOS METODOS EN LAS SUBCLASES CON LOS CAMPOS DIFERENTES ///	
		public void imprimirEtiqueta() {
			System.out.println("--- ETIQUETA DETALLE ---");
		}
		public void imprimirDetalleDePrecio() {
			System.out.println("Precio sin imp.: $" + (precio * 0.79));
			System.out.println("Precio final: $" + precio);	
		}
	}
	
	*/

