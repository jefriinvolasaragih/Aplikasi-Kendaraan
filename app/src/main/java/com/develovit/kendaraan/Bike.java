package com.develovit.kendaraan;
// Bike.java
public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String name, int speed, boolean hasCarrier) {
        super(name, speed);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike Name: " + getName() + ", Speed: " + getSpeed() + " km/h, Has Carrier: " + hasCarrier);
    }
}
