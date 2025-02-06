package at.nihat.projects.Camera;

public class Camera {
    private String pixel;
    private int weight;
    private String color;
    private Picture picture;
    private CamManufacturer camManufacturer;
    private Lens lens;
    private SDcard SDcard;

    public Camera(String pixel, int weight, String color, Picture picture, CamManufacturer camManufacturer,
                  Lens lens, at.nihat.projects.Camera.SDcard SDcard) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.camManufacturer = camManufacturer;
        this.lens = lens;
        this.SDcard = SDcard;
    }

    public void takePicture(String name, double size){
        Picture newPicture = new Picture(name, size);
        SDcard.savePicture(newPicture);
    }


    @Override
    public String toString() {
        return "Camera:\n" +
                "Resolution: " + pixel + "\n" +
                "Weight: " + weight + "g\n" +
                "Color: " + color + "\n" +
                "Picture: " + picture + "\n" +
                "Camera Manufacturer: " + camManufacturer + "\n" +
                "Lens: " + lens + "\n" +
                "SD Card: " + SDcard;
    }
}
