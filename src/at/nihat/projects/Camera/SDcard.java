package at.nihat.projects.Camera;

public class SDcard {
    private String capacity;

    public SDcard(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "SDcard{" +
                "capacity='" + capacity + '\'' +
                '}';
    }
}
