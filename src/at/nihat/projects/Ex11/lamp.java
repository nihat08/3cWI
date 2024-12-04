package at.nihat.projects.Ex11;

public class lamp {
    private String name;
    private String color;
    private double powerUsage;
    private boolean isOn; //true or false

    public lamp(String name, String color, int consumption, int status) {
        this.name = name;
        this.color = color;
        this.powerUsage = 0;
        this.isOn = false;
    }

    addLightElement(LightElement):void
    turnAllOn():void
    getOverallPowerUsage(): double
    printNamesOfLightElements():void

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(double powerUsage) {
        this.powerUsage = powerUsage;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        if (isOn) {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet.");
        } else {
            isOn = true;
            powerUsage += 5;
        }
    }
}

