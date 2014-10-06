package dto.staticdata.mastery;

import java.util.List;

public class MasteryTree {

    private List<MasteryTreeList> defense;
    private List<MasteryTreeList> offense;
    private List<MasteryTreeList> utility;

    public List<MasteryTreeList> getDefense() {
        return defense;
    }

    public List<MasteryTreeList> getOffense() {
        return offense;
    }

    public List<MasteryTreeList> getUtility() {
        return utility;
    }
}
