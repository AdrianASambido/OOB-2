package ar.edu.unlp.objetos.uno.ejercicio2_Patrones_Sueldos;

public abstract class Empleado {
	private double sueldo;
	private boolean casado;
	private int cantidadHijos;
	
	public Empleado(double unSueldo, boolean casado, int cantHijos) {
		this.sueldo       = unSueldo;
		this.casado       = casado;
		this.cantidadHijos= cantHijos;
	}	

	public double calcularDescuento() {
		return (this.getSueldo()*0.13)+(this.sueldoAdicional()* 0.5);
	}
	
	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.calcularDescuento();
	}
	
	public boolean getCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	abstract double sueldoAdicional();
	
	abstract double sueldoBasico();

}
