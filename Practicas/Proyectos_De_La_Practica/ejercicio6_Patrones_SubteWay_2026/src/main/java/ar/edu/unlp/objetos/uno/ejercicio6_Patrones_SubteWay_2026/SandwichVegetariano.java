package ar.edu.unlp.objetos.uno.ejercicio6_Patrones_SubteWay_2026;

public class SandwichVegetariano extends SandwichBuilder{

	
	public SandwichVegetariano() {
		
	}

	@Override
	public void agregarPan() {
		this.getSandwich().setPan("Miga");
		this.getSandwich().setPrecioPan(500);
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo("Mostaza");
		this.getSandwich().setPrecioAderezo(150);
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().setPrincipal("Lechuga");
		this.getSandwich().setPrecioPrincipal(400);
	}

	@Override
	public void agregarExtra() {
		this.getSandwich().setExtra("Tomate");
		this.getSandwich().setPrecioExtra(400);
	}

}
