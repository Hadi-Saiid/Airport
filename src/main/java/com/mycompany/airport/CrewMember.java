package com.mycompany.airport;

public class CrewMember extends Person{
    private String role;
    public CrewMember(String role,String name,String nationality,String id_card,String gender){        
        super(name,id_card,nationality,gender);
        this.role=role;
    }
    @Override
    public void setEmergencyState(){
        if(this.role.equals("Pilot")){
            System.out.println("please make sure to land safely");
        }
        else{
            System.out.println("Pleae provide safe mask to passengers");
        }
    }
    
    @Override
    public String toString() {
        return "CrewMember [name: " + name + " , role: " + role +" , id : "+id_card+"]";
    }
}
