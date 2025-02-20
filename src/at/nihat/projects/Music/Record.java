package at.nihat.projects.Music;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private List<Title> titles = new ArrayList<>();
    private String planTitle;
    private int id;

    public void addTitle(Title title){
        titles.add(title);

    }
}