package com.redcompany.red.builder;


import com.redcompany.red.transport.typesoftransport.general.Vehicle;

public abstract class VehicleBuilder {

    protected Vehicle vehicle;

    protected VehicleBuilder() {
    }

    public abstract Vehicle getVehicle();


    public abstract void buildPersonalTransport();

    public abstract void buildSpeed();

    public abstract void buildTicketPrice();

    public abstract void createNewVehicle();

    public abstract void buildBrand();

    public abstract void buildBusNumber();

    public abstract void buildRouteNumber();

    public abstract void buildStartYearOfUse();

    public abstract void buildMileage();
}
