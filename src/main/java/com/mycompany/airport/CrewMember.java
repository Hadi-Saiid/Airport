package com.mycompany.airport;

public class CrewMember extends Person{
    private String role;
    public CrewMember(String name,String id_card,String role){        
        super(name , id_card);
        this.role=role;
    }
    public void setMember_Name(String name){
        setName(this.name=name);
    }
    public void Name(){
        getName();
    }
    public void setMember_ID(String ID){
        setId_Card(this.id_card=ID);
    }
    public void ID(){
        getId_Card();
    }
    public void setMember_Role(String role){
        this.role=role;
    }
    public String getRole(){
        return role;
    }
    @Override
    public String toString() {
        return "CrewMember [name: " + name + " , role: " + role +" , id : "+id_card+"]";
    }
}
