package com.company;

public class Train extends Transport implements GroundTransport {
    @Override
    public void drive() {
        System.out.println("You can drive on a Train on reels.");
    }
}
