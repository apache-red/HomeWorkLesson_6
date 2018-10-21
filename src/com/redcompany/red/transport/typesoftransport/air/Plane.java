package com.redcompany.red.transport.typesoftransport.air;


import com.redcompany.red.transport.behavior.flybehavior.FlyPossibly;
import com.redcompany.red.transport.behavior.ridebehavior.RidePossibly;
import com.redcompany.red.transport.typesoftransport.general.Vehicle;

public class Plane extends Vehicle {

    private double ticketPrice =1000;
    private int speed = 800;



    public Plane() {
       iFlyVehicle = new FlyPossibly();
       iRideBehavior = new RidePossibly();

    }

    public Plane(double ticketPrice) {
        this.ticketPrice = ticketPrice;
        iFlyVehicle = new FlyPossibly();
        iRideBehavior = new RidePossibly();
    }

    public Plane(double ticketPrice, int speed) {
        this.ticketPrice = ticketPrice;
        this.speed = speed;
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
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Plane";
    }
}
