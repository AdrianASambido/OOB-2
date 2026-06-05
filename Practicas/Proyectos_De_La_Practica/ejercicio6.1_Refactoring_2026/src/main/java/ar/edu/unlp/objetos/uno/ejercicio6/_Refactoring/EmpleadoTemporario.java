package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring;

public class EmpleadoTemporario extends Personal{

		
		public double horasTrabajadas = 0;
		
		public EmpleadoTemporario(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
			super(nombre,apellido,sueldoBasico, cantidadHijos);
		}
		
		public double sueldo() {
			return this.calcularSueldo() + (this.horasTrabajadas * 500) + (this.getCantidadHijos() * 1000);		
		}
		

}
