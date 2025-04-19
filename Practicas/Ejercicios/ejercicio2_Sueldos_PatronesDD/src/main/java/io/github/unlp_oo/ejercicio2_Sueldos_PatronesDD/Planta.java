package io.github.unlp_oo.ejercicio2_Sueldos_PatronesDD;

public class Planta extends Empleado{
	
	private int antiguedad;	

	public Planta(String unNombre, int cantH, boolean casado, int unaAntiguedad) {
		super(unNombre, 50000.00, cantH, casado);
		this.antiguedad = unaAntiguedad;
		
	}

	@Override
	public double sueldoBasico() {
		return this.getBasico();
	}

	@Override
	public double sueldoAdicional() {
		double valor;
		
		if (this.isCasado()) {
			valor = 5000 + this.valorAntiguedad() + this.valorHijos();
		}
			else {
				valor = this.valorAntiguedad() + this.valorHijos();
			}
		return valor;
	}

	
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public double valorAntiguedad() {
		return (this.getAntiguedad()*2000);
	}
	
	public double valorHijos() {
		return (this.getCantidadDeHijos()*2000);
	}
	
}
