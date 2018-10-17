package com.redcompany.red.transport;

import com.redcompany.red.transport.behavior.flybehavior.IFlyBehavior;
import com.redcompany.red.transport.behavior.ridebehavior.IRideBehavior;
import com.redcompany.red.transport.behavior.swimbehavior.ISwimBehavior;

public abstract class Vehicle {

    IFlyBehavior iFlyVehicle;
    IRideBehavior iRideBehavior;
    ISwimBehavior iSwimBehavior;


    private boolean personalTransport;




    public void performFly(){
        iFlyVehicle.fly();
    }
    public void performRide(){
        iRideBehavior.ride();
    }
    public void performSwim(){
       iSwimBehavior.swim();
    }


    public void go(){
        System.out.println("Vehicle picking up speed");
    }
    public void stop(){
        System.out.println("Vehicle brakes");
    }


}
