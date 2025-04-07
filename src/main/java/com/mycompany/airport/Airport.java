package com.mycompany.airport;

import java.util.ArrayList;

public class Airport {
    String name_airport="BHY Airport";
    String country;
    private ArrayList<Airplane> airplanes = new ArrayList<>();
    public Airport(String country){
        this.country=country;
        airplanes = new ArrayList<>();
    }
    public void addAirPlane(Airplane airplane){
        airplanes.add(airplane);
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
    public int getAirplanes() {
        return airplanes.size();
    }
    @Override
    public String toString(){
        return name_airport+" has "+airplanes.size()+" airplanes in "+country+".";
    }
}