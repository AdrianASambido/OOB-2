package ar.edu.unlp.objetos.uno.ejercicio4_Patrones_Topografia_2026;

public class Agua_O_Tierra implements Topografia{
	
	private double proporcionAgua;
	
	public Agua_O_Tierra(double unaProporcion) {// porque puede recibir 0 o 1. Ya sea de tierra o agua. 	
		this.proporcionAgua = unaProporcion;
	}

	@Override
	public double calcularProporcionDeAgua() {
		return this.proporcionAgua;
	}

	@Override
	public boolean soyIgualAMixta(Mixta unaMixta) {
		return false;
	}
	
	@Override
	public boolean equals(Object unaTopografia) {
		return ((Topografia)unaTopografia).calcularProporcionDeAgua() == this.calcularProporcionDeAgua();  //Acádebo compararme con la topografia que recibo 
	}  //transformamos el Object en una Topografia, para que pueda acceder a los metodos, "Casting".
	
}
	