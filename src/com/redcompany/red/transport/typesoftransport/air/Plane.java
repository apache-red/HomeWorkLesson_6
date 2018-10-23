package com.redcompany.red.transport.typesoftransport.air;


import com.redcompany.red.selectionmenu.Menu;
import com.redcompany.red.transport.behavior.flybehavior.FlyPossibly;
import com.redcompany.red.transport.behavior.ridebehavior.RidePossibly;
import com.redcompany.red.transport.typesoftransport.general.Vehicle;

public class Plane extends Vehicle {

    private double ticketPrice;
    private double speed;
    private String crutch;



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
    public double getSpeed() {
// костыль
        if(Menu.KmOrMiles == true){
            crutch = "/KM, ";
            return speed  ;
        }else {
            crutch = "/MILES, ";
            return speed * 1.60934;
        }

    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "ID Transport="+getIdTransport()+'\''+
                ", speed=" + getSpeed() +crutch+
               ", ticketPrice=" + getTicketPrice() +
                '}';

    }

}
