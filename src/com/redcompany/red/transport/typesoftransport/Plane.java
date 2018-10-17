package com.redcompany.red.transport.typesoftransport;

import com.redcompany.red.transport.behavior.flybehavior.FlyPossibly;
import com.redcompany.red.transport.behavior.ridebehavior.RidePossibly;

public class Plane extends Vehicle {




    public Plane() {
       iFlyVehicle = new FlyPossibly();
       iRideBehavior = new RidePossibly();

    }

    @Override
    public void go() {
        System.out.println("Plane picking up speed");
    }
    @Override
    public void  stop(){
        System.out.println("Plane brakes");
    }



}
