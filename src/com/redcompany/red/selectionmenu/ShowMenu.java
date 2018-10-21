package com.redcompany.red.selectionmenu;

public class ShowMenu implements IShow{

    @Override
    public void showMainMenu(){
        System.out.println("Select an action. Enter the number 1....");
        System.out.println("1. Select to create a vehicle.");

//        System.out.println("2. Select the type of rational fraction: A/(x-a)^n .");
//        System.out.println("3. Select the type of rational fraction: M*x+N/x^2+px+q .");
//        System.out.println("4. Select the type of rational fraction: M*x+N/(x^2+px+q)^n .");
        System.out.println("5. Sort vehicle lists");
//        System.out.println("6. Get data on added circles");
        System.out.println("0. Stop program");
        System.out.println("------------------------------");
    }

    @Override
    public void showSelect1(){
        System.out.println("Select an action. Enter the number 1....");
        System.out.println("1. Create a new BOAT.");
        System.out.println("2. Create a new BUS.");
        System.out.println("3. Create a new CAR.");
        System.out.println("4. Create a new PLANE.");
        System.out.println("5. Create a new SUBWAY_TRAIN.");
        System.out.println("6. Create a new TRAIN.");
        System.out.println("0. Previous menu");
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
