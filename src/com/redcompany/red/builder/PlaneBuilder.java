package com.redcompany.red.builder;

import com.redcompany.red.transport.typesoftransport.air.Plane;
import com.redcompany.red.transport.typesoftransport.general.Vehicle;

public class PlaneBuilder extends VehicleBuilder {

    private Plane plane;

    public PlaneBuilder() {
    }

    @Override
    public Vehicle getVehicle() {
        return null;
    }

    @Override
    public void buildPersonalTransport() {

    }

    @Override
    public void buildSpeed() {

    }

    @Override
    public void buildTicketPrice() {

    }
}
