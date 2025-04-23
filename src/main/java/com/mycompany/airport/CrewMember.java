package com.mycompany.airport;

public class CrewMember extends Person{
    private String role;
    public CrewMember(String role,String name,String nationality,String id_card,String gender){        
        super(name,id_card,nationality,gender);
        this.role=role;
    }
    
    @Override
    public String toString() {
        return "CrewMember [name: " + name + " , role: " + role +" , id : "+id_card+"]";
    }
}
