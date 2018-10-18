package com.redcompany.red.transport.typesoftransport;

import com.redcompany.red.transport.behavior.ridebehavior.RidePossibly;

public class Bus extends Vehicle {

    private double ticketPrice =50;
    private  int speed =60;




    public Bus() {
        iRideBehavior = new RidePossibly();

    }

    public Bus(double ticketPrice) {
        this.ticketPrice = ticketPrice;
        iRideBehavior = new RidePossibly();
    }

    public Bus(double ticketPrice, int speed) {
        this.ticketPrice = ticketPrice;
        this.speed = speed;
        iRideBehavior = new RidePossibly();
    }

    @Override
    public void go() {
        System.out.println("Bus picking up speed");
    }
    @Override
    public void  stop(){
        System.out.println("Bus brakes");
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
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Bus";
    }
}
