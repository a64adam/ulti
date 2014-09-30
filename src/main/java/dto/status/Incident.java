package dto.status;

import java.util.List;

public class Incident {

    private boolean active;
    private String createdAt;
    private long id;
    private List<Message> updates;

    public boolean isActive() {
        return active;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public long getId() {
        return id;
    }

    public List<Message> getUpdates() {
        return updates;
    }
}

