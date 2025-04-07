package com.mycompany.airport;

public abstract class Person {
    String name;
    String id_card;
    public Person(String name,String id_card){
        this.name=name;
        this.id_card=id_card;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId_Card(String id_card){
        this.id_card=id_card;
    }
    public String getId_Card(){
        return id_card;
    }
}
