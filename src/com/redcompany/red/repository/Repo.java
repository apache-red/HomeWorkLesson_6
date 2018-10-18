package com.redcompany.red.repository;


import com.redcompany.red.transport.typesoftransport.Plane;
import com.redcompany.red.transport.typesoftransport.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Repo {

    private ArrayList<Vehicle> transportList = new <Vehicle>ArrayList();


    public void addTransportToList(Vehicle vehicle) {
        transportList.add(vehicle);
    }


    public void showTransportList() {
        System.out.println("Quantity objects= " + transportList.size());
        for (int i = 0; i < transportList.size(); i++) {
            System.out.println("Vechicle №" + (i + 1) + " : " + transportList.get(i)
                    + ", ticket price=" + transportList.get(i).getTicketPrice()
                    + ", speed="+ transportList.get(i).getSpeed());
        }
    }

    public void sortedDearestTransport() {
        Collections.sort(transportList, new CompareVehicleDearest());
    }

    class CompareVehicleDearest implements Comparator<Vehicle> {
        @Override
        public int compare(Vehicle v1, Vehicle v2) {
            return (int) (v2.getTicketPrice() - v1.getTicketPrice());
        }
    }

    public void sortedSpeedTransport() {
        Collections.sort(transportList, new CompareVehicleSpeed());
    }

    class CompareVehicleSpeed implements Comparator<Vehicle> {
        @Override
        public int compare(Vehicle v1, Vehicle v2) {
            return (int) (v2.getSpeed() - v1.getSpeed());
        }
    }


}
