package com.redcompany.red.director;


import com.redcompany.red.builder.BusBuilder;
import com.redcompany.red.builder.VehicleBuilder;
import com.redcompany.red.transport.typesoftransport.automobile.Bus;
import com.redcompany.red.transport.typesoftransport.general.Vehicle;
import com.redcompany.red.selectionmenu.Menu;

public class Director {

       protected VehicleBuilder vehicleBuilder;
       protected BusBuilder busBuilder;

    public Director() {
    }

    public void setVehicleBuilder(VehicleBuilder vb) { vehicleBuilder = vb; }

    public Vehicle getVehicle() { return vehicleBuilder.getVehicle(); }


    public void setBusBuilder(BusBuilder bb) { busBuilder = bb; }

    public Bus getBus() { return busBuilder.getVehicle(); }

    public void constructNewBus() {
        busBuilder.createNewVehicle();
        busBuilder.buildPersonalTransport();
        busBuilder.buildBrand();
        busBuilder.buildBusNumber();
        busBuilder.buildRouteNumber();
        busBuilder.buildSpeed();
        busBuilder.buildStartYearOfUse();
        busBuilder.buildMileage();
        busBuilder.buildTicketPrice();
    }


    public Director createNewDirector(){
        Director director = new Director();
        return director;
    }








}
