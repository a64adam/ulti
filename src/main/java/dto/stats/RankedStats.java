package dto.stats;

import java.util.List;

public class RankedStats {

    public List<ChampionStats> champions;
    private long modifyDate;
    private long summonerId;

    public List<ChampionStats> getChampions() {
        return champions;
    }

    /**
     * Date the stats were last modified specified as epoch milliseconds
     */
    public long getModifyDate() {
        return modifyDate;
    }

    public long getSummonerId() {
        return summonerId;
    }
}
