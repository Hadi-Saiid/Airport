package com.mycompany.airport;

import java.util.ArrayList;

public class Airport {
    
    String name_airport="BHY Airport";
    String country="Lebanon";
    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;
    
    
    public Airport(){
        airplanes = new ArrayList<>();
        flights=new ArrayList<>();
    }
    
    
    
    public void addAirPlane(Airplane airplane){
        airplanes.add(airplane);
    }  
    public void RemoveAirPlane(int indexAirplane){
        airplanes.remove(indexAirplane);
    }
    public Airplane getAirplaneIndex(int index){
        return airplanes.get(index);
    }
    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }
    public Airplane Airplane_By_ID(String airplane_id){
        for(int i=0;i<airplanes.size();i++){
            if(airplane_id.equals(airplanes.get(i).getAirplaneCode())){
                return airplanes.get(i);
            }
        }
        return null;
    }
    public boolean TestDuplicateAirplaneID(String airplane_id){
        for (int i = 0; i < airplanes.size(); i++) {
            if(airplane_id.equals(airplanes.get(i).getAirplaneCode())) {
                return true;
            }
        }
        return false;
    }
    
    
    
    public void addFlight(Flight flight){
        flights.add(flight);
    }
    public void RemoveFlight(int indexFlight){
        flights.remove(indexFlight);
    }
    public Flight getFlightIndex(int index){
        return flights.get(index);
    }
    public ArrayList<Flight> getFlights() {
        return flights;
    }
    public Flight Flight_By_ID(String flight_id){
        for(int i=0;i<flights.size();i++){
            if(flight_id.equals(flights.get(i).getFlight_id())){
                return flights.get(i);
            }
        }
        return null;
    }
    public boolean TestDuplicateFlightID(String flight_id){
        for (int i = 0; i < flights.size(); i++) {
            if(flight_id.equals(flights.get(i).getFlight_id())) {
                return true;
            }
        }
        return false;
    }
    

    
    public String getName_Airport(){
        return name_airport;
    }
    public String getCountry(){
        return country;
    }

    
    
    @Override
    public String toString(){
        return name_airport+" has "+airplanes.size()+" airplanes also has "+flights.size()+" flights in "+country+".";
    }
}
