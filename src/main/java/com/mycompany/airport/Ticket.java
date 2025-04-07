package com.mycompany.airport;

public class Ticket {
    int price;
    int ticketNumber;
    
    Flight flight;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }
    
   
    public int getPrice(){
        return price;
    }
    public Flight getFlight() {
        return flight;
    }
    
    @Override
    public String toString() {
        return "Ticket Price: "+price+" for this "+flight.toString();
    }
}
