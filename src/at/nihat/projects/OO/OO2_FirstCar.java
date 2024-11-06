package at.nihat.projects.OO;

public class OO2_FirstCar {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.fuelAmount = 70;
        c1.fuelMaxAmount = 100;
        c1.speed = 50;
        c1.BreakSpeed = 5;

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.fuelConsumption = 5;
        c2.serialNumber = "B1234";
        c2.fuelAmount = 20;
        c2.fuelMaxAmount = 100;
        c2.speed = 45;
        c2.BreakSpeed = 5;

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);

        c1.turboBoost();
        c2.turboBoost();

        c1.getRemainingRange();
        c2.getRemainingRange();

        c1.breakk();
        System.out.println(c1.speed);
        c2.breakk();
    }

    }

