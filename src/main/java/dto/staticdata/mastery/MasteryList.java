package dto.staticdata.mastery;

import java.util.Map;

public class MasteryList {

    private Map<String, Mastery> data;
    private MasteryTree tree;
    private String type;
    private String version;

    public Map<String, Mastery> getData() {
        return data;
    }

    public MasteryTree getTree() {
        return tree;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}
