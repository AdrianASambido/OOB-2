package ar.edu.unlp.objetos.uno.ejercicio6_Patrones_SubteWay_2026;

public abstract class SandwichBuilder {
	
	private Sandwich sandwich;
	
	public SandwichBuilder() {
		sandwich = new Sandwich();
	}
	
	public abstract void agregarPan();
	
	public abstract void agregarAderezo();
	
	public abstract void agregarPrincipal();
	
	public abstract void agregarExtra();
	 
	public Sandwich getSandwich() {
		return this.sandwich;
	}
}
