package ar.edu.unlp.objetos.uno.ejercicio6_Patrones_SubteWay_2026;

public class SandwichSinTacc extends SandwichBuilder{

	public SandwichSinTacc() {		
	}

	@Override
	public void agregarPan() {
		this.getSandwich().setPan("Pan de harina");
		this.getSandwich().setPrecioPan(1500);		
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo("Pasta de Harina");
		this.getSandwich().setPrecioAderezo(1500);		
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().setPrincipal("Más harina");
		this.getSandwich().setPrecioPrincipal(1500);		
	}

	@Override
	public void agregarExtra() {
		this.getSandwich().setExtra("Harina de maiz");
		this.getSandwich().setPrecioExtra(1500);	
	}
}
	