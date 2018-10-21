package com.redcompany.red.start;


import com.redcompany.red.builder.BusBuilder;
import com.redcompany.red.builder.VehicleBuilder;
import com.redcompany.red.director.Director;
import com.redcompany.red.selectionmenu.Menu;
import com.redcompany.red.transport.typesoftransport.automobile.Bus;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        VehicleBuilder busBuilder= new BusBuilder();
        director.setBusBuilder((BusBuilder) busBuilder);
        director.constructNewBus();

        Bus bus;

        bus = director.getBus();
        System.out.println(bus);

        System.out.println(bus);







//
//        Menu menu = new Menu();
//        menu.startMainMenu();


//        Director director = new Director();
//        VehicleBuilder busBuilder = new BusBuilder();
//
//        director.setVehicleBuilder(busBuilder);
//
//        director.constructnewBus();
//
//
//        director.getVehicle();
//        System.out.println();
//
//        System.out.println();









//
//        Repo repo = new Repo();
//
//
//        Vehicle plane = new Plane(1001.2, 806);
//        repo.addTransportToList(plane);
//
//        Vehicle plane2 = new Plane();
//        plane2.setTicketPrice(1200);
//        repo.addTransportToList(plane2);
//
//        Vehicle bus = new Bus(1100);
//        repo.addTransportToList(bus);
//
//        repo.showTransportList();
//        repo.sortedDearestTransport();
//        repo.showTransportList();
//
//
//        repo.sortedSpeedTransport();
//        repo.showTransportList();
    }
}
