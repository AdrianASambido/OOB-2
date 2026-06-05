package ar.edu.unlp.objetos.uno.ejercicio6_Patrones_SubteWay_2026;

public class SandwichClasico extends SandwichBuilder{
		
	public SandwichClasico() {		
	}

	@Override
	public void agregarPan() {
		this.getSandwich().setPan("Frances");
		this.getSandwich().setPrecioPan(100);
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo("Mayonesa");
		this.getSandwich().setPrecioAderezo(200);
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().setPrincipal("Jamón");
		this.getSandwich().setPrecioPrincipal(300);
	}

	@Override
	public void agregarExtra() {
		this.getSandwich().setExtra("");	
		this.getSandwich().setPrecioExtra(0);
	}

}
