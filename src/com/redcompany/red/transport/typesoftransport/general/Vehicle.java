package com.redcompany.red.transport.typesoftransport.general;

import com.redcompany.red.transport.behavior.flybehavior.IFlyBehavior;
import com.redcompany.red.transport.behavior.ridebehavior.IRideBehavior;
import com.redcompany.red.transport.behavior.swimbehavior.ISwimBehavior;

public abstract class Vehicle {

    protected IFlyBehavior iFlyVehicle;
    protected IRideBehavior iRideBehavior;
    protected ISwimBehavior iSwimBehavior;

    public double fuel;
    public static int countTransport;

    private final double KM_PER_MILE = 1.60934;
    private boolean personalTransport;
    private double speed;
    private double ticketPrice;
    private int idTransport;

protected Vehicle (){
    countTransport++;
    this.idTransport = countTransport;

}


    public  Vehicle getVehicle(){
        return Vehicle.this;
    }


    public void performFly(){
        iFlyVehicle.fly();
    }
    public void performRide(){
        iRideBehavior.ride();
    }
    public void performSwim(){
       iSwimBehavior.swim();
    }


    public void go(){
        System.out.println("Vehicle picking up speed");
    }
    public void stop(){
        System.out.println("Vehicle brakes");
    }



    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public IFlyBehavior getiFlyVehicle() {
        return iFlyVehicle;
    }

    public void setiFlyVehicle(IFlyBehavior iFlyVehicle) {
        this.iFlyVehicle = iFlyVehicle;
    }

    public IRideBehavior getiRideBehavior() {
        return iRideBehavior;
    }

    public void setiRideBehavior(IRideBehavior iRideBehavior) {
        this.iRideBehavior = iRideBehavior;
    }

    public ISwimBehavior getiSwimBehavior() {
        return iSwimBehavior;
    }

    public void setiSwimBehavior(ISwimBehavior iSwimBehavior) {
        this.iSwimBehavior = iSwimBehavior;
    }

    public boolean isPersonalTransport() {
        return personalTransport;
    }

    public void setPersonalTransport(boolean personalTransport) {
        this.personalTransport = personalTransport;
    }

    public int getIdTransport() {
        return idTransport;
    }

    public  double convertSpeedFromMilesToKm(){

        return  speed * KM_PER_MILE ;
    }

//    public  double convertSpeedFromKmToMiles(){
//        return speed = speed * KM_PER_MILE;
//
//    }

//    public  String convertFuelFromLitersToGallons(){
//
//    return "Fuel = "+ (fuel = fuel / LITERS_PER_GALLONS) + "/gal";
//    }
//
//    public  String convertFuelFromGallonsToLiters(){
//        return "Fuel = "+ (fuel = fuel * LITERS_PER_GALLONS) + "/lit";
//
//    }



}
