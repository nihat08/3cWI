package at.nihat.projects.Camera;

public class Main {
    public static void main(String[] args) {
        CamManufacturer cm1 = new CamManufacturer("Canon", "Japan");
        Lens l1 = new Lens("Tamron", "30mm");
        SDcard sd1 = new SDcard("16GB");
        Camera c1 = new Camera("24MP", 500, "black", cm1, l1, sd1);

        System.out.println(c1);

    }
}
