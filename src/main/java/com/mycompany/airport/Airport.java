package com.mycompany.airport;

import java.util.ArrayList;
import java.util.HashSet;

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
    public void addFlight(Flight flight){
        flights.add(flight);
    }
    public ArrayList<Flight> getFlights() {
        return flights;
    }
    public boolean TestDuplicateAirplaneID(String airplane_id){
        for (int i = 0; i < airplanes.size(); i++) {
            if(airplane_id.equals(airplanes.get(i).getAirplaneCode())) {
                return true;
            }
        }
        return false;
    }
    public boolean TestDuplicateFlightID(String flight_id){
        for (int i = 0; i < flights.size(); i++) {
            if(flight_id.equals(flights.get(i).getFlight_id())) {
                return true;
            }
        }
        return false;
    }
    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
    public void RemoveAirPlane(int indexAirplane){
        airplanes.remove(indexAirplane);
    }
    public void RemoveFlight(int indexFlight){
        flights.remove(indexFlight);
    }
    public String getName_Airport(){
        return name_airport;
        
        //jihad
    }
    
    public String getCountry(){
        return country;
    }
    public void Airplane_List(){
        System.out.println("Available Airplanes:");
        for(int i=0;i<airplanes.size();i++){
            System.out.println("Airplane ["+(i+1)+"] "+airplanes.get(i));
        }
    }
    public Airplane getAirplaneIndex(int index) {
        return airplanes.get(index);
    }
    public Flight getFlightIndex(int index) {
        return flights.get(index);
    }
    @Override
    public String toString(){
        return name_airport+" has "+airplanes.size()+" airplanes in "+country+".";
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
}