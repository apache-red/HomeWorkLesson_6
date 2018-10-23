package com.redcompany.red.builder;

import com.redcompany.red.transport.typesoftransport.automobile.Bus;

public class BusBuilder extends  VehicleBuilder{

    private Bus bus;

    public BusBuilder() {
    }

    public void createNewVehicle() {
        this.bus = new Bus();
    }

    public void buildBusNumber() {
        bus.setBusNumber("7-PH 0001");
    }
    public void buildRouteNumber() {
        bus.setRouteNumber(100);
    }
    public void buildBrand() {
        bus.setBrand("MAZzz...");
    }

    public void buildStartYearOfUse() {
        bus.setStartYearOfUse(2018);
    }

    public void buildMileage() {
        bus.setMileage(0);
    }
    @Override
    public void buildPersonalTransport() {
        this.bus.setPersonalTransport(false);
    }
    @Override
    public void buildSpeed() {
        bus.setSpeed(180);
    }
    @Override
    public void buildTicketPrice() {
        bus.setTicketPrice(0.65);
    }

    public Bus getVehicle() {
        return bus;
    }





}
