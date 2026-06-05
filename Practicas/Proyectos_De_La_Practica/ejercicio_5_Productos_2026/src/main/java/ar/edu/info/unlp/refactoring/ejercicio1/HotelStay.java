package ar.edu.info.unlp.refactoring.ejercicio1;

import java.time.LocalDate;

public class HotelStay extends Product {
    private Hotel hotel;

    public HotelStay(double cost, TimePeriod timePeriod, Hotel hotel) {
    	super(timePeriod,cost);
        this.hotel = hotel;
    }

    public double priceFactor() {
        return this.getCost() / this.price(); // punto 2) llamar a cost "quote"
    }							//deberé modificar los test

    public double price() {
        return this.getTimePeriod().duration() * this.hotel.calculateFinalPrice();
    }
}
