package dto.stats;

public class PlayerStatsSummary {

    private AggregatedStats aggregatedStats;
    private int losses;
    private long modifyDate;
    private String playerStatSummaryType;
    private int wins;

    public AggregatedStats getAggregatedStats() {
        return aggregatedStats;
    }

    /**
     * Number of losses for this queue type. Returned for ranked queue types only.
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Number of wins for this queue type.
     */
    public int getWins() {
        return wins;
    }

    /**
     * @return  date stats were last modified as epoch milliseconds
     */
    public long getModifyDate() {
        return modifyDate;
    }

    /**
     * Legal values: AramUnranked5x5, CoopVsAI, CoopVsAI3x3, OdinUnranked, RankedPremade3x3, RankedPremade5x5,
     * RankedSolo5x5, RankedTeam3x3, RankedTeam5x5, Unranked, Unranked3x3, OneForAll5x5, FirstBlood1x1, FirstBlood2x2,
     * SummonersRift6x6, CAP5x5, URF, URFBots, NightmareBot
     *
     * @return  a {@link java.lang.String} representing the player stats summary
     */
    public String getPlayerStatSummaryType() {
        return playerStatSummaryType;
    }
}
