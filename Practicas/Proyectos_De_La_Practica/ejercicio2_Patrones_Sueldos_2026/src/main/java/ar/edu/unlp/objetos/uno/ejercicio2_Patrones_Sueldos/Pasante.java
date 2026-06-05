package ar.edu.unlp.objetos.uno.ejercicio2_Patrones_Sueldos;

public class Pasante extends Empleado{
	private int cantidadDeExamenes;
	
	public Pasante(double unSueldo, int cantExamenes) {
		super(20000.00, false, 0);
		this.cantidadDeExamenes = cantExamenes;
	}

	@Override
	public double sueldoAdicional() {
		return this.cantidadDeExamenes*2000.00;
	}
	@Override
	public double sueldoBasico() {
		return this.getSueldo();	
	}

}
