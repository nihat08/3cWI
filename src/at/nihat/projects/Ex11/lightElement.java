package at.nihat.projects.Ex11;

public class lightElement {
    private String name;
    private String color;
    private double powerConsumption;
    private boolean status;


    public lightElement(String name, String color, double powerConsumption) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.status = false;
    }


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

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Methode zum Einschalten
    public void turnOn() {
        if (status) {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet.");
        } else {
            status = true;
            powerConsumption += 5; // Stromverbrauch steigt bei jedem Einschalten um 5
        }
    }
}


