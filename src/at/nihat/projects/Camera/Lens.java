package at.nihat.projects.Camera;

public class Lens {
    private String manufacturer;
    private String focal_lenght;

    public Lens(String manufacturer, String focal_lenght) {
        this.manufacturer = manufacturer;
        this.focal_lenght = focal_lenght;
    }

    @Override
    public String toString() {
        return "Lens{" +
                "manufacturer='" + manufacturer + '\'' +
                ", focal_lenght='" + focal_lenght + '\'' +
                '}';
    }
}
