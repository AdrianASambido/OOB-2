package ar.edu.unlp.objetos.uno.ejercicio6._Peliculas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula {
	private double costo;
	LocalDate fechaEstreno;
	
	// ...
	
	public double getCosto() {
		return this.costo;
	}
	
	// Este metodo se extrajo del metodo "calcularCostoPelicula()" 
		// la clase SubscripcionBasica
	public double calcularCostoPorCargoExtra() {
		return this.getCosto() + this.calcularCargoExtraPorEstreno();
	}
	
	public double calcularCargoExtraPorEstreno(){
	// Si la Película se estrenó 30 días antes de la fecha actual, retorna un cargo de 0$, caso contrario, retorna un cargo extra de 300$
		return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
	}
	
	// No se si eliminar el comentario del metodo "calcularCargoExtraPorEstreno" 
	// por que viendo el código puede deducirse que es lo que hace ????
	
}
