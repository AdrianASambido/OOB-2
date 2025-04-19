package io.github.unlp_oo.ejercicio2_Sueldos_PatronesDD;

public abstract class Empleado {
	
	private String nombre;
	private double basico;
	private int cantidadDeHijos;
	private boolean casado;
	
	
	public Empleado (String unNombre, Double unBasico, int cantH, boolean casado) {
		this.nombre          = unNombre;
		this.cantidadDeHijos = cantH;
		this.basico          = unBasico; 
		this.casado		     = casado;
	}

	abstract public double sueldoBasico();
	abstract public double sueldoAdicional();
	
	public double descuento() {		
		return ((this.getBasico() *0.13) + (this.sueldoAdicional()*0.05));
	}
	
	public double sueldo() {
		return sueldoBasico() + sueldoAdicional() - descuento();
	}
	
	public double getBasico() {
		return basico;
	}


	public void setBasico(double unBasico) {
		this.basico = unBasico;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}


	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}


	public boolean isCasado() {
		return casado;
	}


	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
}	


