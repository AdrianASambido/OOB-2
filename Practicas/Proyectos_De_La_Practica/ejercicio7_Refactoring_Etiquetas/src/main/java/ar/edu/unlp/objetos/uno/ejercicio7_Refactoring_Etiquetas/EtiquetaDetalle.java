package ar.edu.unlp.objetos.uno.ejercicio7_Refactoring_Etiquetas;

public class EtiquetaDetalle extends Etiqueta {
	
		public EtiquetaDetalle(String nombre, double precio) {
			super(nombre, precio);
		}
	/// CREAMOS METODOS EN LAS SUBCLASES CON LOS CAMPOS DIFERENTES ///	
		public void imprimirEtiqueta() {
			System.out.println("--- ETIQUETA DETALLE ---");
		}
		public void imprimirDetalleDePrecio() {
			System.out.println("Precio sin imp.: $" + (this.getPrecio() * 0.79));
			System.out.println("Precio final: $" + this.getPrecio());	
		}

		/*
		public void generar() {
			System.out.println("--- ETIQUETA DETALLE ---");
			System.out.println("Producto: " + nombreProducto);
			System.out.println("Precio sin imp.: $" + (precio * 0.79));
			System.out.println("Precio final: $" + precio);
			System.out.println("-----------------------");
		}
	    */
}
