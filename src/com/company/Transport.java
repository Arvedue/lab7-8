package com.company;

public class Transport {
    private double speed;
    private int numberOfSeats;
    private double mass;
    private String model;
    private String firm;

    public Transport(double speed, int numberOfSeats, double mass, String model, String firm) {
        this.speed = speed;
        this.numberOfSeats = numberOfSeats;
        this.mass = mass;
        this.model = model;
        this.firm = firm;
    }

    public Transport() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
}
