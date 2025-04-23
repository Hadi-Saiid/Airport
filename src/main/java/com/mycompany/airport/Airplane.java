package com.mycompany.airport;

public class Airplane {
    private String model;
    private int seats;
    private String airline;
    private String airplaneCode;
    private boolean available;

    public Airplane(String model, int seats, String airline,String Code,boolean available) {
        this.model = model;
        this.seats = seats;
        this.airline = airline;
        this.airplaneCode=Code;
        this.available = available;
    }
    
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getAirplaneCode() {
        return airplaneCode;
    }


    public int getSeats() {
        return seats;
    }

    @Override
    public String toString(){
        return" has Model: "+model+" , Airline: "+airline+" , Seats: "+seats; 
    }
}
