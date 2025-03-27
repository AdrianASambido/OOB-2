package ar.edu.unlp.objetos.uno.Refactoring_ejercicio2;

public class Temporario extends Empleado{
	
	private Double cantidadHorasTrabajadas;

	public Temporario(String unNombre, String unApellido, Double unsueldo,int cantidadHijos) {
		super(unNombre, unApellido, unsueldo, 1000.00, cantidadHijos);
	}
	
	public Double sueldo() {
		return getSueldoBasico() + (this.getCantidadHorasTrabajadas() * 500);
	}

	public Double getCantidadHorasTrabajadas() {
		return this.cantidadHorasTrabajadas;
	}

	public void setCantidadHorasTrabajadas(Double cantidadHorasTrabajadas) {
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
	}	
}
