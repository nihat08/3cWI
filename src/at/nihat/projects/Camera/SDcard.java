package at.nihat.projects.Camera;

import java.util.ArrayList;

public class SDcard {
    private String capacity;
    private ArrayList<Picture> pictures = new ArrayList<>();


    public SDcard(String capacity) {
        this.capacity = capacity;
    }

    public void savePicture(Picture picture) {
        pictures.add(picture);
        System.out.println("Saved: " + picture);
    }


    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "SDcard{" +
                "capacity='" + capacity + '\'' +
                '}';
    }
}
