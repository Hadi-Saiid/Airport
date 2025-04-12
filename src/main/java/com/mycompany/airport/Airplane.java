package com.mycompany.airport;

public class Airplane {
    private String model;
    private final int seats;
    private String airline;
    private int airplaneNumber; //1 2 3 4 5
// yousef
// 2nd change
    public int getAirplaneNumber() {
        return airplaneNumber;
    }

    public void setAirplaneNumber(int airplaneNumber) {
        this.airplaneNumber = airplaneNumber;
    }
    
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
