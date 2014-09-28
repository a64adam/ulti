package dto.team;


import java.util.List;

public class Team {

    private long createDate;
    private String fullId;
    private long lastGameDate;
    private long lastJoinDate;
    private long lastJoinedRankedTeamQueueDate;
    private List<MatchHistorySummary> matchHistory;
    private long modifyDate;
    private String name;
    private Roster roster;
    private long secondLastJoinDate;
    private String status;
    private String tag;
    private List<TeamStatDetail> teamStatDetails;
    private long thirdLastJoinDate;

    /**
     * Date that the team was created specified as epoch milliseconds
     */
    public long getCreateDate() {
        return createDate;
    }

    public String getFullId() {
        return fullId;
    }

    /**
     * Date that the last game played by the team ended specified as epoch milliseconds
     */
    public long getLastGameDate() {
        return lastGameDate;
    }

    /**
     * Date that the last memeber joined specified as epoch milliseconds
     */
    public long getLastJoinDate() {
        return lastJoinDate;
    }

    /**
     * Date that the team last joined the ranked team queue specified as epoch milliseconds
     */
    public long getLastJoinedRankedTeamQueueDate() {
        return lastJoinedRankedTeamQueueDate;
    }

    public List<MatchHistorySummary> getMatchHistory() {
        return matchHistory;
    }

    /**
     * Date that the team was last modified specified as epoch milliseconds
     */
    public long getModifyDate() {
        return modifyDate;
    }

    public String getName() {
        return name;
    }

    public Roster getRoster() {
        return roster;
    }

    /**
     * Date that the second to last member joined specified as epoch milliseconds
     */
    public long getSecondLastJoinDate() {
        return secondLastJoinDate;
    }

    public String getStatus() {
        return status;
    }

    public String getTag() {
        return tag;
    }

    public List<TeamStatDetail> getTeamStatDetails() {
        return teamStatDetails;
    }

    /**
     * Date that the third to last member joined specified as epoch milliseconds
     */
    public long getThirdLastJoinDate() {
        return thirdLastJoinDate;
    }
}
