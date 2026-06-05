package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring;

public abstract class Personal {
	
	public String nombre;
	public String apellido;
	public double sueldoBasico;
	public int cantidadHijos;
	
	protected Personal(String nombre, String apellido, double sueldoBasico,  int cantidadHijos) {
		this.apellido= apellido;
		this.nombre  = nombre;
		this.sueldoBasico = sueldoBasico;
		this.cantidadHijos = cantidadHijos;
	}
	
	protected Personal(String nombre, String apellido, double sueldoBasico) {
		this.apellido= apellido;
		this.nombre  = nombre;
		this.sueldoBasico = sueldoBasico;
	}
	public double descuento() {
		return this.getSueldoBasico() * 0.13;
	}
	
	public double calcularSueldo() {
		return this.getSueldoBasico() - this.descuento();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	public int getCantidadHijos() {
		return cantidadHijos;
	}
	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	
	
	
}
