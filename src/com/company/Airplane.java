package com.company;

public class Airplane extends Transport implements SkyTransport {
    @Override
    public void fly() {
        System.out.println("You can fly on a plain in the sky.");
    }
}
