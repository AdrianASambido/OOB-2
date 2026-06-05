package ar.edu.info.unlp.refactoring.ejercicio1;
import java.time.LocalDate;
public class CarRental extends Product {
    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
        super(timePeriod,cost);
        this.company = company;
    }

    
    public LocalDate startDate() {
        return this.getTimePeriod().start();
    }

    public LocalDate endDate() {
        return this.getTimePeriod().end();
    }

    public double price() {
        return  this.company.calculateFinalPrice(); //se hace una llamada al nuevo metodo
    }

}
