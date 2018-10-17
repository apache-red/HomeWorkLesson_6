package com.redcompany.red.transport.behavior.swimbehavior;

public class SwimNoWay implements ISwimBehavior{

    @Override
    public void swim() {
        System.out.println("I can NOT swim!");
    }
}
