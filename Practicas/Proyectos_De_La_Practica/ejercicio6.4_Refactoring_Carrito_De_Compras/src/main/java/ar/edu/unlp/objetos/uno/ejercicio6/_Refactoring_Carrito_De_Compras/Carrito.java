package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring_Carrito_De_Compras;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private List<ItemCarrito> items;
	
	public Carrito() {
		this.items = new ArrayList<ItemCarrito>();
	}
	// Al parecer la clase carrito tiene envidia de las características "Feature Envy" 
	// de la clase Item-carritos quien tiene los datos para los cálculos, es esa clase 
	// quien debería hacerlos.
	// Aplicaremos "Extract Method" y crearemos un  método en la clase ItemCarrito "calcularCosto()"
	// Y haremos una invocación del mismo en el método total.
	
	// Otro "code smell" es el nombre del metodo total no ejemplifica bien lo que hace, aquí el 
	// el refactoring a utilizar es: Rename Method por "montoTotalDeLaCompra".
	public double MontoTotalDeLaCompra() {
		return this.items.stream().mapToDouble(item ->item.calcularCosto()).sum();
	}
	
	public void agregarItemDeProductos(ItemCarrito unItem) {
		this.items.add(unItem);
	}
}
