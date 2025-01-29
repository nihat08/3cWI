package at.nihat.projects.Camera;

public class Camera {
    private String pixel;
    private int weight;
    private String color;
    private CamManufacturer camManufacturer;
    private Lens lens;
    private SDcard SDcard;

    public Camera(String pixel, int weight, String color, CamManufacturer camManufacturer,
                  Lens lens, at.nihat.projects.Camera.SDcard SDcard) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.camManufacturer = camManufacturer;
        this.lens = lens;
        this.SDcard = SDcard;
    }
    @Override
    public String toString() {
        return "Camera:\n" +
                "Resolution: " + pixel + "\n" +
                "Weight: " + weight + "g\n" +
                "Color: " + color + "\n" +
                "Camera Manufacturer: " + camManufacturer + "\n" +
                "Lens: " + lens + "\n" +
                "SD Card: " + SDcard;
    }
}
