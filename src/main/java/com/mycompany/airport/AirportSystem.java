package com.mycompany.airport;

import java.util.Scanner;

public class AirportSystem {
    public static void main(String[] args) {
        Airport a1=new Airport();
        Scanner inp=new Scanner(System.in);
        Airplane A1=new Airplane();
        System.out.print("Enter the airline of the airplane: ");
        String airline = inp.nextLine();
        A1.setAirline(airline);
        System.out.print("Enter the model of the airplane: ");
        String model = inp.nextLine();
        A1.setModel(model);
        System.out.println(A1);
        Airplane A2=new Airplane();
        System.out.print("Enter the airline of the airplane: ");
        airline = inp.nextLine();
        A2.setAirline(airline);
        System.out.print("Enter the model of the airplane: ");
        model = inp.nextLine();
        A2.setModel(model);
        System.out.println(A1);
        a1.addAirPlane(A1);
        a1.addAirPlane(A2);
        System.out.println("Airplane "+a1);
        a1.Airplane_List();
        Passenger p1=new Passenger("","");
        System.out.print("Enter passenger name: ");
        String name = inp.nextLine();
        p1.setPassenger_Name(name);
        System.out.print("Enter passenger ID: ");
        String ID=inp.nextLine();
        p1.setPassenger_ID(ID);
        System.out.println(p1);
        CrewMember c1=new CrewMember("","","");
        System.out.print("Enter crew member name: ");
        name = inp.nextLine();
        c1.setMember_Name(name);
        System.out.print("Enter crew member ID: ");
        ID=inp.nextLine();
        c1.setMember_ID(ID);
        System.out.print("Enter crew member role: ");
        String role=inp.nextLine();
        c1.setMember_Role(role);
        System.out.println(c1);
        Flight f1=new Flight();
        System.out.print("Enter flight time of departure: ");
        String time=inp.nextLine();
        f1.setFlight_Time(time);
        System.out.print("Enter flight destination: ");
        String destination=inp.nextLine();
        f1.setFlight_destination(destination);
        System.out.print("Enter flight ID: ");
        ID = inp.nextLine();
        f1.setFlight_id(ID);
        f1.addPassenger(p1);
        f1.addCrewMembers(c1);
        System.out.println(f1);
    }
}
