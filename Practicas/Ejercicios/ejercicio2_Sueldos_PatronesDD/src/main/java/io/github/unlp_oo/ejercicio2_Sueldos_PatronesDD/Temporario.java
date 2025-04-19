package io.github.unlp_oo.ejercicio2_Sueldos_PatronesDD;

public class Temporario extends Empleado{
	
	private int catidadHorasTrabajadas;	

	public Temporario(String unNombre, int cantHijos, boolean casado, int cantidadDeHoras) {
		super(unNombre, 20000.00, cantHijos, casado);
		this.catidadHorasTrabajadas = cantidadDeHoras;
		
	}

	@Override
	public double sueldoBasico() {
		return (this.getBasico() + (this.catidadHorasTrabajadas*300));
	}

	@Override
	public double sueldoAdicional() {
		double valor;
		
		if (this.isCasado()) {
			valor = this.valorHijos() + 5000;
		}
		else {
			valor = this.valorHijos();
		}
		return valor;
	}

	public int getCatidadHorasTrabajadas() {
		return catidadHorasTrabajadas;
	}

	public void setCatidadHorasTrabajadas(int catidadHorasTrabajadas) {
		this.catidadHorasTrabajadas = catidadHorasTrabajadas;
	}

	public  double valorHijos() {
		return this.getCantidadDeHijos()*2000;
	}
}
