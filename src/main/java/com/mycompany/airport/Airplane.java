package com.mycompany.airport;

public class Airplane {
    private String model;
    private int seats;
    private String airline;
    private String airplaneCode;
    private boolean available;
// yousef
// 2nd change

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

    public void setAirplaneCode(String airplaneCode) {
        this.airplaneCode = airplaneCode;
    }
    public Airplane(){
        seats=120;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setAirline(String airline){
        this.airline=airline;
    }
    public String getAirline(){
        return airline;
    }
    @Override
    public String toString(){
        return" has Model: "+model+" , Airline: "+airline+" , Seats: "+seats; 
    }
}
