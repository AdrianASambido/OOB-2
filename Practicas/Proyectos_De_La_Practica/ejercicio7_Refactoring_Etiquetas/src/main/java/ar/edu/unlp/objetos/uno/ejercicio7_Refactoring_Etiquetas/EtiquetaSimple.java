package ar.edu.unlp.objetos.uno.ejercicio7_Refactoring_Etiquetas;

public class EtiquetaSimple extends Etiqueta {
	
	
	public EtiquetaSimple(String nombre, double precio) {
		super(nombre, precio);
	}
	/// CREAMOS METODOS EN LAS SUBCLASES CON LOS CAMPOS DIFERENTES ///	
	public void imprimirEtiqueta() { //  
		System.out.println("--- ETIQUETA BÁSICA ---");
	}
	public void imprimirDetalleDePrecio() {
		System.out.println("Precio: $" + this.getPrecio());
	}
	
	
	/*
	 public void generar() {
		System.out.println("--- ETIQUETA BÁSICA ---");
		System.out.println("Producto: " + nombreProducto);
		System.out.println("Precio: $" + precio);
		System.out.println("-----------------------");
	}
	*/
}
