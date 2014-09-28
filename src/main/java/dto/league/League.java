package dto.league;

import java.util.List;

public class League {

    private List<LeagueEntry> entries;
    private String name;
    private String participantId;
    private String queue;
    private String tier;

    public List<LeagueEntry> getEntries() {
        return entries;
    }

    /**
     * Specifies the participant that is a member of this league (i.e., a requested summoner ID, a requested team
     * ID, or the ID of a team to which one of the requested summoners belongs). Only present when full league is
     * requested so that participant's entry can be identified. Not present when individual entry is requested.
     */
    public String getParticipantId() {
        return participantId;
    }

    /**
     * This name is an internal place-holder name only. Display and localization of names in the game client are
     * handled client-side.
     */
    public String getName() {
        return name;
    }

    /**
     * Legal values: RANKED_SOLO_5x5, RANKED_TEAM_3x3, RANKED_TEAM_5x5
     *
     * @return  a {@link java.lang.String} representing the queue type
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Legal values: CHALLENGER, MASTER, DIAMOND, PLATINUM, GOLD, SILVER, BRONZE
     *
     * @return  a {@link java.lang.String} representing the tier
     */
    public String getTier() {
        return tier;
    }
}
