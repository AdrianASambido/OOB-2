package io.github.unlp_oo.ejercicio2_Sueldos_PatronesDD;

public class Pasante extends Empleado{

	private int examenRendido;
	
	public Pasante(String unNombre, Double unSueldo, int examenRend) {
		super(unNombre, 20000.00, 0, false);
		this.examenRendido = examenRend;
	}

	@Override
	public double sueldoBasico() {
		return this.getBasico();
	}

	@Override
	public double sueldoAdicional() {
		return this.getExamenRendido()*2000;
	}

	public int getExamenRendido() {
		return examenRendido;
	}

	public void setExamenrendido(int examenRendido) {
		this.examenRendido = examenRendido;
	}
	
	

}
