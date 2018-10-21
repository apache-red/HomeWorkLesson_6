package com.redcompany.red.selectionmenu;


import com.redcompany.red.repository.Repo;
import com.redcompany.red.transport.typesoftransport.automobile.Bus;
import com.redcompany.red.transport.typesoftransport.air.Plane;
import com.redcompany.red.transport.typesoftransport.general.Vehicle;

public class Menu {

//    IShow ishowMenu ;
//    IListenerInput iListenerInput;
//    Repo repo =new Repo();
//
//
//
//
//    public Menu() {
//       ishowMenu = new ShowMenu();
//       iListenerInput = new ListenerInput();
//
//
//    }
//
//
//    public void startMainMenu(){
//    ishowMenu.showMainMenu();
//    choseActionMainMenu(iListenerInput.writeAction());
//
//
//
//    }
//
//
//
//
//
//
//
//
//    private void choseActionMainMenu(int number) {
//        switch (number) {
//            case 1:
//    ishowMenu.showSelect1();
//                choseActionSelect1(iListenerInput.writeAction());
//
//                break;
//
//
//            case 5:
//        ishowMenu.showSelect5();
//        choseActionSelect5(iListenerInput.writeAction());
//                break;
//
//            case 0:
//                System.out.println("Program was stopped");
//                System.exit(0);
//        }
//       startMainMenu();
//    }
//
//    private void choseActionSelect1(int number) {
//        switch (number) {
//            case 1:
//
//
//                break;
//        }
//        choseActionSelect1(iListenerInput.writeAction());
//        startMainMenu();
//
//    }
//
//
//
//
//    private void choseActionSelect5(int number) {
//        switch (number) {
//            case 1:
//
//                Vehicle plane = new Plane();
//                repo.addTransportToList(plane);
//
//                Vehicle plane2 = new Plane();
//                plane2.setTicketPrice();
//                repo.addTransportToList(plane2);
//
//                Vehicle bus = new Bus();
//                repo.addTransportToList(bus);
//
//
//                repo.sortedSpeedTransport();
//                break;
//            case 2:
//                repo.sortedDearestTransport();
//                break;
//            case 3:
//                repo.showTransportList();
//                break;
//            case 0 :
//                startMainMenu();
//        }
//        ishowMenu.showSelect5();
//        choseActionSelect5(iListenerInput.writeAction());
//    }



}
