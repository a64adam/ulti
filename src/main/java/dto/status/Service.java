package dto.status;

import java.util.List;

public class Service {

    private List<Incident> incidents;
    private String name;
    private String slug;
    private String status;

    public List<Incident> getIncidents() {
        return incidents;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getStatus() {
        return status;
    }
}
