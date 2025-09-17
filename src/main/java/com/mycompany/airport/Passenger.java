package com.mycompany.airport;

public class Passenger extends Person{
    String travelClass;
    String disabilityType;
    boolean isDisabled;
    public Passenger(String name,String ID,String nationality,String gender,String travelClass,boolean isDisabled,String disabilityType){
        super(name,ID,nationality,gender);
        this.travelClass=travelClass;
        this.disabilityType=disabilityType;
        this.isDisabled=isDisabled;
    }
    public  void setEmergencyState(){
        System.out.println("Please MS"+super.name+" stay calm and get access to the oxygen mask");
    }

    @Override
    public String toString() {
        return "Passenger [name: "+ name +" id : "+id_card+"]";
    }
}
