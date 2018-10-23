package com.redcompany.red.selectionmenu;


import com.redcompany.red.builder.BusBuilder;
import com.redcompany.red.builder.VehicleBuilder;
import com.redcompany.red.director.Director;
import com.redcompany.red.repository.Repo;
import com.redcompany.red.transport.typesoftransport.air.Plane;
import com.redcompany.red.transport.typesoftransport.automobile.Bus;
import com.redcompany.red.transport.typesoftransport.general.Vehicle;

public class Menu {

    private Director director;
    private BusBuilder busBuilder;
    private VehicleBuilder vehicleBuilder;
    private IShow ishowMenu;
    private IListenerInput iListenerInput;
    private Repo repo;
    private Bus bus;

    public static boolean KmOrMiles = true;

    public Menu() {
        this.director = new Director();
        this.repo = new Repo();
        dataForExample();
        ishowMenu = new ShowMenu();
        iListenerInput = new ListenerInput();
    }

    public void startMainMenu() {
        ishowMenu.showMainMenu();
        choseActionMainMenu(iListenerInput.writeAction());
    }

    private void choseActionMainMenu(int number) {
        switch (number) {
            case 1:
                ishowMenu.showSelect1();
                choseActionSelect1(iListenerInput.writeAction());
                break;
            case 4:
                changeKMOrMiles();
                break;
            case 5:
                ishowMenu.showSelect5();
                choseActionSelect5(iListenerInput.writeAction());
                break;
            case 6:
                repo.showTransportList();
                break;

            case 0:
                System.out.println("Program was stopped");
                System.exit(0);
        }
        startMainMenu();
    }

    private void choseActionSelect1(int number) {
        switch (number) {
            case 2:
                ishowMenu.showSelect1_2();
                choseActionSelect1_2(iListenerInput.writeAction());
                break;
            case 0:
                startMainMenu();
        }
        ishowMenu.showSelect1();
        choseActionSelect1(iListenerInput.writeAction());

    }

    private void choseActionSelect1_2(int number) {
        switch (number) {
            case 1:
                ishowMenu.showSelect1_2();
                this.vehicleBuilder = new BusBuilder();
                director.setBusBuilder((BusBuilder) vehicleBuilder);
                director.constructNewBus();
                repo.addTransportToList(director.getBus());
                System.out.println("Bus was created and added to TransportList");
                System.out.println("----------------------------");
                break;
            case 2:
                this.vehicleBuilder = new BusBuilder();
                director.setBusBuilder((BusBuilder) vehicleBuilder);
                director.constructNewBus();
                bus = director.getBus();
                System.out.println("For example, change the route Number:");
                bus.setRouteNumber(iListenerInput.writeAction());
                repo.addTransportToList(bus);
                break;
            case 0:
                ishowMenu.showSelect1();
        }
        ishowMenu.showSelect1_2();
        choseActionSelect1(iListenerInput.writeAction());

    }


    private void choseActionSelect5(int number) {
        switch (number) {
            case 1:
                repo.sortedSpeedTransport();
                break;
            case 2:
                repo.sortedDearestTransport();
                break;
            case 3:
                repo.showTransportList();
                break;
            case 0:
                startMainMenu();
        }
        ishowMenu.showSelect5();
        choseActionSelect5(iListenerInput.writeAction());
    }


    private void dataForExample() {

        this.vehicleBuilder = new BusBuilder();
        director.setBusBuilder((BusBuilder) vehicleBuilder);
        director.constructNewBus();
        bus = director.getBus();
        bus.setTicketPrice(10);
        bus.setRouteNumber(25);
        bus.setMileage(20000);
        bus.setSpeed(220);
        repo.addTransportToList(bus);
        director.constructNewBus();
        bus = director.getBus();
        bus.setStartYearOfUse(10);
        bus.setMileage(999929);
        repo.addTransportToList(bus);
// no builder
        Vehicle plane = new Plane(1001.2, 806);
        repo.addTransportToList(plane);
        Vehicle plane2 = new Plane();
        plane2.setTicketPrice(1200);
        repo.addTransportToList(plane2);

    }

    public static void changeKMOrMiles(){
        System.out.println("Value changed");
       if(KmOrMiles == true){
           KmOrMiles= false;
       }else {
           KmOrMiles = true;
       }
    }


}
