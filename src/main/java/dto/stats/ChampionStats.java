package dto.stats;

public class ChampionStats {
    private int id;
    private AggregatedStats stats;

    /**
     * Note that champion ID 0 represents the combined stats for all champions. For static information correlating to
     * champion IDs, please refer to the static data API.
     */
    public int getId() {
        return id;
    }

    public AggregatedStats getStats() {
        return stats;
    }
}
