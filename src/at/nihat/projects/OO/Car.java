package at.nihat.projects.OO;

import java.util.ArrayList;
import java.util.List;

public class Car {
    //Instanz/Gedächnis
    //dont do that later
    private List<RearMirror> mirrors = new ArrayList<>();
    private int fuelMaxAmount;
    private int fuelAmount;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private int speed;
    private int BreakSpeed;
    private String color;

    public Car(int fuelConsumption, String brand, String serialNumber) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelMaxAmount = 100;
        this.fuelConsumption = 7;
        this.mirrors = new ArrayList<>();

    }

    public Car() {

    }

    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    //Methode


    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void setMirrors(List<RearMirror> mirrors) {
        this.mirrors = mirrors;
    }

    public void getDrive() {
        int speed;
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");
    }

    public void getBreakk() {
        System.out.println("Ich bremse");
    }

    public void getTurboBoost() {
        if (fuelAmount > fuelMaxAmount * 0.10) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void getHonk(int amountOfRepetitions) {

        System.out.println("Tuuut");
    }

    public void getRemainingRange() {
        int getRemainingRange = fuelAmount / fuelConsumption * 100;
        System.out.println("remaining range = " + getRemainingRange);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount > 100) {
            this.fuelAmount = 100;
        } else {
            this.fuelAmount = fuelAmount;
        }
        this.fuelAmount = fuelAmount;
    }

    public void setBreakSpeed(int breakSpeed) {
        BreakSpeed = breakSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelMaxAmount(int fuelMaxAmount) {
        this.fuelMaxAmount = fuelMaxAmount;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFuelMaxAmount() {
        return fuelMaxAmount;
    }

    public String getBrand() {
        return brand;
    }

    public int getBreakSpeed() {
        return BreakSpeed;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
}
