package ar.edu.unlp.objetos.uno.ejercicio2_Patrones_Sueldos;

public class Temporario extends Empleado{
	private int cantidadDeHorasTrabajadas;

	public Temporario(boolean casado, int cantHijos, int cantHoras) {
		super(20000.00, casado, cantHijos);
		this.cantidadDeHorasTrabajadas = cantHoras;
	}
	
	@Override
	public double sueldoBasico() {
		return this.getSueldo() + (this.cantidadDeHorasTrabajadas * 300);
	}
	
	@Override	
	public double sueldoAdicional() {
		double valor;
		valor = this.getCantidadHijos()*2000;
		if(this.getCasado()) {
			valor = 5000 + valor ; 
		}	
		return valor;
	}

}
