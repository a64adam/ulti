package dto.staticdata.mastery;

import dto.staticdata.Image;

import java.util.List;

public class Mastery {

    private List<String> description;
    private int id;
    private Image image;
    private String name;
    private String prereq;
    private int ranks;
    private List<String> sanitizedDescription;

    public List<String> getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public Image getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPrereq() {
        return prereq;
    }

    public int getRanks() {
        return ranks;
    }

    public List<String> getSanitizedDescription() {
        return sanitizedDescription;
    }
}
