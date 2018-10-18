package com.redcompany.red.start;


import com.redcompany.red.transport.typesoftransport.Bus;
import com.redcompany.red.transport.typesoftransport.Plane;
import com.redcompany.red.transport.typesoftransport.Vehicle;
import com.redcompany.red.repository.Repo;

public class Main {

    public static void main(String[] args) {

        Repo repo = new Repo();


        Vehicle plane = new Plane(1001.2, 806);
        repo.addTransportToList(plane);

        Vehicle plane2 = new Plane();
        plane2.setTicketPrice(1200);
        repo.addTransportToList(plane2);

        Vehicle bus = new Bus(1100);
        repo.addTransportToList(bus);

        repo.showTransportList();
        repo.sortedDearestTransport();
        repo.showTransportList();


        repo.sortedSpeedTransport();
        repo.showTransportList();
    }
}
