package ar.edu.unlp.objetos.uno.ejercicio6_Patrones_SubteWay_2026;

public class SandwichVegano extends SandwichBuilder{
	
	public SandwichVegano() {
		
	}

	@Override
	public void agregarPan() {
		this.getSandwich().setPan("Sacramento");
		this.getSandwich().setPrecioPan(500);
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo("Mayonesa");
		this.getSandwich().setPrecioAderezo(500);
		
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().setPrincipal("Churrasco");
		this.getSandwich().setPrecioPrincipal(500);
		
	}

	@Override
	public void agregarExtra() {
		this.getSandwich().setExtra("Huevo una docena");
		this.getSandwich().setPrecioExtra(500);
		
	}
}
