package com.redcompany.red.transport.typesoftransport;


import com.redcompany.red.transport.behavior.flybehavior.FlyPossibly;
import com.redcompany.red.transport.behavior.ridebehavior.RidePossibly;

public class Plane extends Vehicle {

    private double ticketPrice =1000;



    public Plane() {
       iFlyVehicle = new FlyPossibly();
       iRideBehavior = new RidePossibly();

    }

    public Plane(double ticketPrice) {
        this.ticketPrice = ticketPrice;
        iFlyVehicle = new FlyPossibly();
        iRideBehavior = new RidePossibly();
    }

    @Override
    public void go() {
        System.out.println("Plane picking up speed");
    }
    @Override
    public void  stop(){
        System.out.println("Plane brakes");
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }


    @Override
    public String toString() {
        return "Plane";
    }
}
