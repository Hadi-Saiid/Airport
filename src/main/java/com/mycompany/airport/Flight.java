package com.mycompany.airport;

import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
    private String flight_id;
    private String departure_time;
    private String destination;
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private ArrayList<CrewMember> crewmembers = new ArrayList<>();
    private Airplane airplane;
    private Airport airport;

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
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
    public void Pick_Airplane(Airplane air){
        for(int i=0 ;i<airport.getAirplanes();i++){
            if(air.equals(airplane.getAirplaneNumber())){
                this.airplane=air;
            }
        }
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
