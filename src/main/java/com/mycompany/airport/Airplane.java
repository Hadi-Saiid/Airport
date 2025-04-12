package com.mycompany.airport;

public class Airplane {
    private String model;
    private final int seats;
    private String airline;
// yousef
// 2nd change


//Test
    public Airplane(){
        seats=120;
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
