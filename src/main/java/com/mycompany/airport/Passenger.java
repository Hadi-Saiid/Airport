package com.mycompany.airport;

public class Passenger extends Person{
    //name  id
    public Passenger(String name,String id_card){
        super(name , id_card);
    }
    public void setPassenger_Name(String name){
        setName(this.name=name);
    }
    public void Name(){
        getName();
    }
    public void setPassenger_ID(String ID){
        setId_Card(this.id_card=ID);
    }
    public void ID(){
        getId_Card();
    }
    @Override
    public String toString() {
        return "Passenger [name: "+ name +" id : "+id_card+"]";
    }
}
