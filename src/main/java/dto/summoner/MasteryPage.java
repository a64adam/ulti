package dto.summoner;


import java.util.List;

public class MasteryPage {

    private boolean current;
    private long id;
    private List<Mastery> masteries;
    private String name;

    public boolean isCurrent() {
        return current;
    }

    public long getId() {
        return id;
    }

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public String getName() {
        return name;
    }
}
