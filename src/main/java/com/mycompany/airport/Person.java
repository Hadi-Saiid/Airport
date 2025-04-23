package com.mycompany.airport;

public abstract class Person {
    String name;
    String id_card;
    String nationality;
    String gender;
    public Person(String name,String id_card,String nationality,String gender){
        this.name=name;
        this.id_card=id_card;
        this.nationality=nationality;
        this.gender=gender;
    }
    
    public String getId_Card(){
        return id_card;
    }
}
