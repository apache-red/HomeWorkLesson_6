package com.redcompany.red.selectionmenu;

public class ShowMenu implements IShow{

    @Override
    public void showMainMenu(){
        System.out.println("Select an action. Enter the number 1....");
        System.out.println("1. Select to create a vehicle. (WORKS!!!)");
        System.out.println("4. Change speed unit KM/H & MILES/H (WORKS!!!)");
        System.out.println("5. Sort vehicle lists. (WORKS!!!)");
        System.out.println("6. Show All Array. (WORKS!!!)");
        System.out.println("0. Stop program. (WORKS!!!)");
        System.out.println("------------------------------");
    }

    @Override
    public void showSelect1(){
        System.out.println("Select an action. Enter the number 1....");
        System.out.println("1. Create a new BOAT.");
        System.out.println("2. Create a new BUS. (WORKS!!!)");
        System.out.println("3. Create a new CAR.");
        System.out.println("4. Create a new PLANE.");
        System.out.println("5. Create a new SUBWAY_TRAIN.");
        System.out.println("6. Create a new TRAIN.");
        System.out.println("0. Previous menu. (WORKS!!!)");
        System.out.println("------------------------------");

    }
    @Override
    public void showSelect1_2(){
        System.out.println("Select an action. Enter the number 1....");
        System.out.println("1. Create standard BUS. (WORKS!!!)");
        System.out.println("2. Create custom BUS. (WORKS!!!)");
        System.out.println("0. Previous menu. (WORKS!!!)");
        System.out.println("------------------------------");

    }


    public void showSelect5() {
        System.out.println("Select an action. Enter the number 1....");
        System.out.println("1. Sorting by speed");
        System.out.println("2. Sorting by price");
        System.out.println("3. Show Array");
        System.out.println("0. Previous menu");
        System.out.println("------------------------------");

    }


}
