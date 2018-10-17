package com.redcompany.red.transport.behavior.flybehavior;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
            System.out.println("I can NOT fly!");
    }
}
