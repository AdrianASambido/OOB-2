package ar.edu.unlp.objetos.uno.ejercicio9_Refactoring_Pedidos_2026;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	private LocalDate fechaAlta;
	
	public LocalDate getFechaAlta() { 
		return this.fechaAlta; 
	}
	public int antiguedad() {
		return Period.between(this.getFechaAlta(),LocalDate.now()).getYears();
				
		//		.LocalDate.now()).getYears();
	}
	
}
