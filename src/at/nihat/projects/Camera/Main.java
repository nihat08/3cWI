package at.nihat.projects.Camera;

public class Main {
    public static void main(String[] args) {
        CamManufacturer cm1 = new CamManufacturer("Canon", "Japan");
        Lens l1 = new Lens("Tamron", "30mm");
        SDcard sd1 = new SDcard("16GB");
        Picture p1 = new Picture("Pic1", 2);

        Camera c1 = new Camera("24MP", 500, "black", p1, cm1, l1, sd1);
        System.out.println(c1);

        c1.takePicture("First", 2);
        System.out.println();

    }
}
