package at.nihat.projects.Camera;

public class CamManufacturer {
    private String name;
    private String country;

    public CamManufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "CamManufacturer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
