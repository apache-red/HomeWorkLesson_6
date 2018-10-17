package com.redcompany.red.start;

import com.redcompany.red.transport.typesoftransport.Plane;
import com.redcompany.red.transport.typesoftransport.Vehicle;

public class Main {

    public static void main(String[] args) {
	// write your code here

      Vehicle plane = new Plane();
      plane.performFly();
      plane.performRide();

    }
}
