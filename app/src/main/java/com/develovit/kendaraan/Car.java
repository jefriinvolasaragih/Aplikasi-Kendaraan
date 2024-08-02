package com.develovit.kendaraan;
// Car.java
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String name, int speed, int numberOfDoors) {
        super(name, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Name: " + getName() + ", Speed: " + getSpeed() + " km/h, Doors: " + numberOfDoors);
    }
}
