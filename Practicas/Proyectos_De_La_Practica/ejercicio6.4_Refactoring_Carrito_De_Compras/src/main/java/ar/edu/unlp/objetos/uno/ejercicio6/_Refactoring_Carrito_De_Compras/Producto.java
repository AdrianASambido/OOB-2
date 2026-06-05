package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring_Carrito_De_Compras;

public class Producto {
	
	private String nombre;
	private double precio;
	
	public Producto(String unNombre, double unPrecio) {
		this.nombre = unNombre;
		this.precio = unPrecio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	public String getNombre() {
		return this.nombre;
	}
}
