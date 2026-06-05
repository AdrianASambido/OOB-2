package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring;

public class EmpleadoPasante extends Personal{
	
	public EmpleadoPasante(String nombre, String apellido, double sueldoBasico) {
		super(nombre,apellido,sueldoBasico);
	}
	
	public double sueldo() {
		return this.calcularSueldo();
	}
	
}