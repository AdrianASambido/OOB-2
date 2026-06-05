package ar.edu.unlp.objetos.uno.ejercicio2_Patrones_Sueldos;

public class Planta extends Empleado{

	private int antiguedad;
	
	public Planta(double unSueldo, boolean isCasado, int cantHijos, int unaAntiguedad) {
		super(50000.00, isCasado, cantHijos);
		this.antiguedad = unaAntiguedad;
	}
	
	private double calcularAntiguedad() {
		return this.getAntiguedad() * 2000;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public double sueldoBasico() {
		return this.getSueldo();
	}
	@Override
	public double sueldoAdicional() {
		return 5000.00 + (this.getCantidadHijos()*2000.00) + this.calcularAntiguedad();
	}
	
}
