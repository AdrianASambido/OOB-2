package ar.edu.unlp.objetos.uno.ejercicio9_Refactoring_Pedidos_2026;

import java.util.List;
import java.time.Period;
import java.time.LocalDate;

/*Tareas:
1. Dado e l código anterior, aplique únicamente los siguientes refactoring:
 ● Replace Loop with Pipeline (líneas 16 a 19)
 ● Replace Conditional with Polymorphism (líneas 21 a 27)
 ● Extract method y move method (línea 28)
 ● Extract method y replace temp with query (líneas 28 a 33)
2. Realice el diagrama de clases del código refactorizado.
 * */

public class Pedido {                                                       	//01 
	private Cliente cliente; 													//02
	private List<Producto> productos; 											//03
	private FormaDePago formaPago; 
	
	public Pedido(Cliente cliente, List<Producto> productos, FormaDePago formaPago) { 
		if (!"efectivo".equals(formaPago) 
			&& !"6 cuotas".equals(formaPago) 
			&& !"12 cuotas".equals(formaPago)) { 
				throw new Error("Forma de pago incorrecta"); 
		} 
		this.cliente  = cliente; 
		this.productos = productos; 
		this.formaPago = formaPago; 
		} 
		public double getCostoTotal() { 
			double costoProductos = 0;											//16
			for (Producto producto : this.productos) { 							//17
				costoProductos += producto.getPrecio(); 						//18
			} 																	//19
		double extraFormaPago = 0; 
		if ("efectivo".equals(this.formaPago)) { 								//21
			extraFormaPago = 0; 												//22
		}   else if ("6 cuotas".equals(this.formaPago)) {						//23
				extraFormaPago = costoProductos * 0.2; 							//24
		}   else if ("12 cuotas".equals(this.formaPago)) { 						//25
				extraFormaPago = costoProductos * 0.5; 							//26
		} 																		//27
		int añosDesdeFechaAlta = Period.between(this.cliente.getFechaAlta(), LocalDate.now().getYears(); //28
	// Aplicar descuento del 10% si el cliente tiene más de 5 años de antiguedad//29
		if (añosDesdeFechaAlta > 5) { 											//30
			return (costoProductos + extraFormaPago) * 0.9; 					//31
		} 																		//32
		return costoProductos + extraFormaPago; 								//33
	} 
	//----------------------------------------------------------------------------------
		public class Cliente { 
			private LocalDate fechaAlta; 
			public LocalDate getFechaAlta() { 
				return this.fechaAlta; 
			}
		//  Move meethod Linea 28
			public int antiguedad() {
				return Period.between(this.getFechaAlta().LocalDate.now()).getYears();
			}
	//---------------------------------------------------------------------------------				
		} 
		public class Producto { 
			private double precio; 
			public double getPrecio() { 
				return this.precio; 
			} 
		}
	}
	///////////////  CÓDIGO REFACTIRIZADO  ///////////////
	
public class Pedido {	
	private Cliente cliente; 													//02
	private List<Producto> productos; 											//03
	private String formaPago; 
	
	public Pedido(Cliente cliente, List<Producto> productos, String formaPago) { 
		this.cliente = cliente; 
		this.productos = productos; 
		this.formaPago = formaPago; 
	} 	
	//Replace Loop with Pipeline (líneas 16 a 19)
	public double getCostoTotal() { 
		double costoProductos = this.productos.stream().mapToInt(producto->producto.getPrecio()).sum(); 		//16  
		double extraFormaPago = this.formaPago.pagoExtra(costoProducto);
		return aplicarDescuento(costoProductos, extraFormaPago);
		
	return costoProductos + extraFormaPago;	
		
	// Aplicar descuento del 10% si el cliente tiene más de 5 años de antiguedad//29
		
	public double aplicarDescuento(double costoProductos, double extraFormaPago) {
		if (añosDesdeFechaAlta > 5) { 											//30
			return (costoProductos + extraFormaPago) * 0.9; 
		return 0;	
	}
}			
		
	
	
	
	
	
	
	