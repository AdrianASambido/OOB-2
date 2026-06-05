package ar.edu.unlp.objetos.uno.ejercicio4_Patrones_Topografia_2026;

public class Pantano implements Topografia{

	@Override
	public double calcularProporcionDeAgua() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean soyIgualAMixta(Mixta unaMixta) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(Object unaTopografia) {
		return ((Topografia)unaTopografia).calcularProporcionDeAgua() == this.calcularProporcionDeAgua();
	}	
}
