package dto.status;


import java.util.List;

public class ShardStatus {

    private String hostname;
    private List<String> locales;
    private String name;
    private String regionTag;
    private List<Service> services;
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

    public List<Service> getServices() {
        return services;
    }

    public String getSlug() {
        return slug;
    }
}
