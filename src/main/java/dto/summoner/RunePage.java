package dto.summoner;

import java.util.Set;

public class RunePage {

    private boolean current;
    private long id;
    private String name;
    private Set<RuneSlot> slots;

    public boolean isCurrent() {
        return current;
    }

    public Set<RuneSlot> getSlots() {
        return slots;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
