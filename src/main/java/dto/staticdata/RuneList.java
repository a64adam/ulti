package dto.staticdata;

import java.util.Map;

public class RuneList {

    private BasicData basic;
    private Map<String, Rune> data;
    private String type;
    private String version;

    public BasicData getBasic() {
        return basic;
    }

    public Map<String, Rune> getData() {
        return data;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}
