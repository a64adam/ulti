package dto.match;

import java.util.List;

public class MatchDetail {

    private int mapId;
    private long matchCreation;
    private long matchDuration;
    private long matchId;
    private String matchMode;
    private String matchType;
    private String matchVersion;
    private List<ParticipantIdentity> participantIdentities;
    private List<Participant> participants;
    private String queueType;
    private String region;
    private String season;
    private List<Team> teams;
    private Timeline timeline;

    public int getMapId() {
        return mapId;
    }

    /**
     * Designates when the team select lobby is created and/or the match is made through match making, not when
     * the game actually starts.
     */
    public long getMatchCreation() {
        return matchCreation;
    }

    public long getMatchDuration() {
        return matchDuration;
    }

    public long getMatchId() {
        return matchId;
    }

    /**
     * Legal values: CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, ASCENSION, FIRSTBLOOD
     *
     * @return  a {@link java.lang.String} representing the match mode
     */
    public String getMatchMode() {
        return matchMode;
    }

    /**
     * Legal values: CUSTOM_GAME, MATCHED_GAME, TUTORAL_GAME
     *
     * @return  a {@link java.lang.String} representing the match type
     */
    public String getMatchType() {
        return matchType;
    }

    public String getMatchVersion() {
        return matchVersion;
    }

    public List<ParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    /**
     * Legal values:  CUSTOM, NORMAL_5x5_BLIND, RANKED_SOLO_5x5, RANKED_PREMADE_5x5, BOT_5x5, NORMAL_3x3,
     * RANKED_PREMADE_3x3, NORMAL_5x5_DRAFT, ODIN_5x5_BLIND, ODIN_5x5_DRAFT, BOT_ODIN_5x5, BOT_5x5_INTRO,
     * BOT_5x5_BEGINNER, BOT_5x5_INTERMEDIATE, RANKED_TEAM_3x3, RANKED_TEAM_5x5, BOT_TT_3x3, GROUP_FINDER_5x5,
     * ARAM_5x5, ONEFORALL_5x5, FIRSTBLOOD_1x1, FIRSTBLOOD_2x2, SR_6x6, URF_5x5, BOT_URF_5x5, NIGHTMARE_BOT_5x5_RANK1,
     * NIGHTMARE_BOT_5x5_RANK2, NIGHTMARE_BOT_5x5_RANK5, ASCENSION_5x5
     *
     * @return  a {@link java.lang.String} representing the queue type
     */
    public String getQueueType() {
        return queueType;
    }

    /**
     * @return region where the match was played
     */
    public String getRegion() {
        return region;
    }

    /**
     * Legal values: PRESEASON3, SEASON3, PRESEASON2014, SEASON2014
     *
     * @return  a {@link java.lang.String} representing the season
     */
    public String getSeason() {
        return season;
    }

    public List<Team> getTeams() {
        return teams;
    }

    /**
     * Match timeline data. Not included by default.
     */
    public Timeline getTimeline() {
        return timeline;
    }
}
