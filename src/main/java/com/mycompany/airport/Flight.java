package com.mycompany.airport;

import java.util.ArrayList;

public class Flight {
    private String flight_id;
    private String departure_time;
    private String destination;
    private Airplane airplane;
    
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private int current_passengers=0;
    
    private ArrayList<CrewMember> crewmembers = new ArrayList<>();
    private int current_attendants=0;
    private int current_pilots=0;
    final int max_pilots=2;
    
    public Flight(String flight_id, String departure_time, String destination, Airplane airplane) {
        this.flight_id = flight_id;
        this.departure_time = departure_time;
        this.destination = destination;
        this.airplane =airplane;
    }

    
    public String getFlight_id() {
        return flight_id;
    }
    
    
    public int CalculateCurrentPassengers(){
        return current_passengers++;
    }
    public int getCurrent_passengers() {
        return current_passengers;
    }
    public void setCurrent_passengers(int current_passengers) {
        this.current_passengers = current_passengers;
    }
    
    public int CalculateCurrentPilots(){
        return current_pilots++;
    }
    public int getCurrent_pilots() {
        return current_pilots;
    }
    public void setCurrent_pilots(int current_pilots) {
        this.current_pilots = current_pilots;
    }
    
    
    public int CalculateCurrentAttendants(){
        return current_attendants++;
    }
    public int getCurrent_attendants() {
        return current_attendants;
    }
    public void setCurrent_attendants(int current_attendants) {
        this.current_attendants = current_attendants;
    }
    public int Calculate_MaxAttendants(){
        if(airplane.getSeats()>=50){
            return (airplane.getSeats()/50)*2;
        }
        return 2;
    }


    public Airplane getAirplane() {
        return airplane;
    }
    
    
    public void addCrewMembers(CrewMember crewmember){
        crewmembers.add(crewmember);
    }
    public void removeCrewMember(CrewMember crewmember) {
        crewmembers.remove(crewmember);
    }
    public void removeCrewMember_index(int index) {
        crewmembers.remove(index);
    }
    public void clearCrewMembers() {
        crewmembers.clear();
    }
    public CrewMember Crewmember_By_ID(String passport_id){
        for(int i=0;i<crewmembers.size();i++){
            if(passport_id.equals(this.flight_id)){
                return crewmembers.get(i);
            }
        }
        return null;
    }
    public boolean TestDuplicateCrewmemberID(String passport_id){
        for (int i = 0; i < crewmembers.size(); i++) {
            if(passport_id.equals(crewmembers.get(i).getId_Card())) {
                return true;
            }
        }
        return false;
    }
    
    

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }
    public void removePassenger(Passenger passenger){
        passengers.remove(passenger);
    }
    public void removePassenger_index(int passenger){
        passengers.remove(passenger);
    }
    public void clearPassengers() {
        passengers.clear();
    }
    public Passenger Passenger_By_ID(String flight_id){
        for(int i=0;i<passengers.size();i++){
            if(flight_id.equals(this.flight_id)){
                return passengers.get(i);
            }
        }
        return null;
    }
    public boolean TestDuplicatePassengerID(String passport_id){
        for (int i = 0; i < passengers.size(); i++) {
            if(passport_id.equals(passengers.get(i).getId_Card())) {
                return true;
            }
        }
        return false;
    }
    
    
    
    @Override
    public String toString(){
        return "Flight:\nAirplane: "+airplane+"\nDestination: "+destination+"\nDeparture Time: "+departure_time+"\nID: "+flight_id+"\nnumber passengers: "+passengers.size()+"\nnumber crew members: "+crewmembers.size();
    }
}
