package com.redcompany.red.transport.typesoftransport.automobile;

import com.redcompany.red.transport.behavior.ridebehavior.RidePossibly;
import com.redcompany.red.transport.typesoftransport.general.Vehicle;

public class Bus extends Vehicle {


    private String busNumber;
    private int routeNumber;
    private String brand;
    private int startYearOfUse;
    private  int mileage;

    @Override
    public void go() {
        System.out.println("Bus picking up speed");
    }
    @Override
    public void  stop(){
        System.out.println("Bus brakes");
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStartYearOfUse() {
        return startYearOfUse;
    }

    public void setStartYearOfUse(int startYearOfUse) {
        this.startYearOfUse = startYearOfUse;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber='" + busNumber + '\'' +
                ", routeNumber=" + routeNumber +
                ", brand='" + brand + '\'' +
                ", startYearOfUse=" + startYearOfUse +
                ", mileage=" + mileage +
                ", personalTransport=" + isPersonalTransport() +
                ", speed=" + getSpeed() +
                ", ticketPrice=" + getTicketPrice() +
                '}';
    }

}
