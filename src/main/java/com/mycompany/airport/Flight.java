package com.mycompany.airport;

import java.util.ArrayList;

public class Flight {
    private String flight_id;
    private String departure_time;
    private String destination;
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private ArrayList<CrewMember> crewmembers = new ArrayList<>();
    private Airplane airplane;

    public Flight(String flight_id, String departure_time, String destination, Airplane airplane) {
        this.flight_id = flight_id;
        this.departure_time = departure_time;
        this.destination = destination;
        this.airplane =airplane;
    }
   
    public Flight(){
        passengers=new ArrayList<>();
        crewmembers=new ArrayList<>();
        
    }    
    public void setFlight_id(String ID){
        this.flight_id=ID;
    }
    public void setFlight_Time(String time){
        this.departure_time=time;
    }
    public void setFlight_destination(String destination){
        this.destination=destination;
    }

    public String getFlight_id() {
        return flight_id;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }
    public void addCrewMembers(CrewMember crewmember){
        crewmembers.add(crewmember);
    }
    @Override
    public String toString(){
        return "Flight:\nAirplane: "+airplane+"\nDestination: "+destination+"\nDeparture Time: "+departure_time+"\nID: "+flight_id+"\nnumber passengers: "+passengers.size()+"\nnumber crew members: "+crewmembers.size();
    }
}
