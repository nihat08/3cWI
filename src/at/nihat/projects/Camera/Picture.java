package at.nihat.projects.Camera;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Picture {
    private String name;
    private String date;
    private double size; // in MB

    public Picture(String name, double size) {
        this.name = name;
        this.size = size;
        this.date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
    }

    @Override
    public String toString() {
        return "Picture{name='" + name + "', date='" + date + "', size=" + size + "MB}";
    }
}

