package com.company;

public class Auto extends Transport implements GroundTransport {
    @Override
    public void drive() {
        System.out.println("You can drive an Auto on a road.");
    }
}
