package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring_Carrito_De_Compras;

public class ItemCarrito {
	
	private Producto producto;
	private int cantidad;
	
	public ItemCarrito(Producto unProducto, int unaCantidad) {
		this.producto = unProducto;
		this.cantidad = unaCantidad;
	}
	
	public Producto getProducto() {
		return this.producto;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}

	public double calcularCosto() {
		return this.getCantidad() * this.producto.getPrecio();
	}

}
