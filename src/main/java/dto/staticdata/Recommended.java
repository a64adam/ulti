package dto.staticdata;

import java.util.List;

public class Recommended {
    private List<String> blocks;
    private String champion;
    private String map;
    private String mode;
    private boolean priority;
    private String title;
    private String type;

    public List<String> getBlocks() {
        return blocks;
    }

    public String getChampion() {
        return champion;
    }

    public String getMap() {
        return map;
    }

    public String getMode() {
        return mode;
    }

    public boolean isPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }
}
