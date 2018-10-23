package com.redcompany.red.repository;


import com.redcompany.red.selectionmenu.Menu;
import com.redcompany.red.transport.typesoftransport.air.Plane;
import com.redcompany.red.transport.typesoftransport.general.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Repo {
    private Plane plane;
    private ArrayList<Vehicle> transportList = new <Vehicle>ArrayList();


    public void addTransportToList(Vehicle vehicle) {
        transportList.add(vehicle);
    }


    public void showTransportList() {
        System.out.println("Quantity objects= " + transportList.size());
        for (int i = 0; i < transportList.size(); i++) {
            // костыль, так как не хочется создатьвать билдер для Plane
            if (transportList.get(i) instanceof Plane){
                System.out.println("Vechicle №" + (i + 1) + " : " + transportList.get(i)
                        + ", ticket price=" + transportList.get(i).getTicketPrice());
            }
            else if(Menu.KmOrMiles == true ){
                System.out.println("Vechicle №" + (i + 1) + " : " + transportList.get(i)
                        + ", ticket price=" + transportList.get(i).getTicketPrice()
                        + ", speed="+ transportList.get(i).getSpeed()+"/KM, ");
            }else {
                System.out.println("Vechicle №" + (i + 1) + " : " + transportList.get(i)
                        + ", ticket price=" + transportList.get(i).getTicketPrice()
                        + ", speed="+ transportList.get(i).convertSpeedFromMilesToKm()+"/MILES, ");
            }

        }
    }

    public void sortedDearestTransport() {
        System.out.println("----------------------------------");
        System.out.println("Sorting by price:");
        Collections.sort(transportList, new CompareVehicleDearest());
        System.out.println("Array was sorted");
        System.out.println("----------------------------------");

    }

    class CompareVehicleDearest implements Comparator<Vehicle> {
        @Override
        public int compare(Vehicle v1, Vehicle v2) {
            return (int) (v2.getTicketPrice() - v1.getTicketPrice());
        }
    }

    public void sortedSpeedTransport() {
        System.out.println("----------------------------------");
        System.out.println("Sorting by speed");
        Collections.sort(transportList, new CompareVehicleSpeed());
        System.out.println("Array was sorted");
        System.out.println("----------------------------------");

    }

    class CompareVehicleSpeed implements Comparator<Vehicle> {
        @Override
        public int compare(Vehicle v1, Vehicle v2) {
            return (int) (v2.getSpeed() - v1.getSpeed());
        }
    }


}
