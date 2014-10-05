package dto.staticdata;

import java.util.Map;

public class SummonerSpellList {

    private Map<String, SummonerSpell> data;
    private String type;
    private String version;

    public Map<String, SummonerSpell> getData() {
        return data;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}
