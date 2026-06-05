package ar.edu.info.unlp.refactoring.ejercicio1;

import java.time.LocalDate;

public class Product {

	private TimePeriod timePeriod;
	private double quote;
	
	public Product(TimePeriod timePeriod, double cost) {
		this.timePeriod = timePeriod;
		this.quote      = cost;
	}
	
	public LocalDate startDate() {
	    return this.timePeriod.start();
	}

	public LocalDate endDate() {
	    return this.timePeriod.end();
	}
	
	public TimePeriod  getTimePeriod() {
		return this.timePeriod;
	}
	
	public double  getCost() {
		return this.quote;
	}
}
