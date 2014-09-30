package dto.status;

import java.util.List;

public class Shard {

    private String hostname;
    private List<String> locales;
    private String name;
    private String regionTag;
    private String slug;

    public String getHostname() {
        return hostname;
    }

    public List<String> getLocales() {
        return locales;
    }

    public String getName() {
        return name;
    }

    public String getRegionTag() {
        return regionTag;
    }

    public String getSlug() {
        return slug;
    }
}
