package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring;

public class EmpleadoPlanta extends Personal{

	public EmpleadoPlanta(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
		super(nombre,apellido,sueldoBasico, cantidadHijos);
	}
	
	public double sueldo() {
		return this.calcularSueldo() + (this.getCantidadHijos() * 2000);
	}
}
