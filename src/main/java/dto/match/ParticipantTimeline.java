package dto.match;

public class ParticipantTimeline {

    private ParticipantTimelineData ancientGolemAssistsPerMinCounts;
    private ParticipantTimelineData ancientGolemKillsPerMinCounts;
    private ParticipantTimelineData assistedLaneDeathsPerMinDeltas;
    private ParticipantTimelineData assistedLaneKillsPerMinDeltas;
    private ParticipantTimelineData baronAssistsPerMinCounts;
    private ParticipantTimelineData baronKillsPerMinCounts;
    private ParticipantTimelineData creepsPerMinDeltas;
    private ParticipantTimelineData csDiffPerMinDeltas;
    private ParticipantTimelineData damageTakenDiffPerMinDeltas;
    private ParticipantTimelineData damageTakenPerMinDeltas;
    private ParticipantTimelineData dragonAssistsPerMinCounts;
    private ParticipantTimelineData dragonKillsPerMinCounts;
    private ParticipantTimelineData elderLizardAssistsPerMinCounts;
    private ParticipantTimelineData elderLizardKillsPerMinCounts;
    private ParticipantTimelineData goldPerMinDeltas;
    private ParticipantTimelineData inhibitorAssistsPerMinCounts;
    private ParticipantTimelineData inhibitorKillsPerMinCounts;
    private String lane;
    private String role;
    private ParticipantTimelineData towerAssistsPerMinCounts;
    private ParticipantTimelineData towerKillsPerMinCounts;
    private ParticipantTimelineData towerKillsPerMinDeltas;
    private ParticipantTimelineData vilemawAssistsPerMinCounts;
    private ParticipantTimelineData vilemawKillsPerMinCounts;
    private ParticipantTimelineData wardsPerMinDeltas;
    private ParticipantTimelineData xpDiffPerMinDeltas;
    private ParticipantTimelineData xpPerMinDeltas;

    /**
     * Legal values: MID, MIDDLE, TOP, JUNGLE, BOT, BOTTOM
     *
     * @return  a {@link java.lang.String} representing the participants lane
     */
    public String getLane() {
        return lane;
    }

    /**
     * Legal values: DUO, NONE, SOLO, DUO_CARRY, DUO_SUPPORT
     *
     * @return  a {@link java.lang.String} representing the participants role
     */
    public String getRole() {
        return role;
    }

    public ParticipantTimelineData getAncientGolemAssistsPerMinCounts() {
        return ancientGolemAssistsPerMinCounts;
    }

    public ParticipantTimelineData getAncientGolemKillsPerMinCounts() {
        return ancientGolemKillsPerMinCounts;
    }

    public ParticipantTimelineData getAssistedLaneDeathsPerMinDeltas() {
        return assistedLaneDeathsPerMinDeltas;
    }

    public ParticipantTimelineData getAssistedLaneKillsPerMinDeltas() {
        return assistedLaneKillsPerMinDeltas;
    }

    public ParticipantTimelineData getBaronAssistsPerMinCounts() {
        return baronAssistsPerMinCounts;
    }

    public ParticipantTimelineData getBaronKillsPerMinCounts() {
        return baronKillsPerMinCounts;
    }

    public ParticipantTimelineData getCreepsPerMinDeltas() {
        return creepsPerMinDeltas;
    }

    public ParticipantTimelineData getCsDiffPerMinDeltas() {
        return csDiffPerMinDeltas;
    }

    public ParticipantTimelineData getDamageTakenDiffPerMinDeltas() {
        return damageTakenDiffPerMinDeltas;
    }

    public ParticipantTimelineData getDamageTakenPerMinDeltas() {
        return damageTakenPerMinDeltas;
    }

    public ParticipantTimelineData getDragonAssistsPerMinCounts() {
        return dragonAssistsPerMinCounts;
    }

    public ParticipantTimelineData getDragonKillsPerMinCounts() {
        return dragonKillsPerMinCounts;
    }

    public ParticipantTimelineData getElderLizardAssistsPerMinCounts() {
        return elderLizardAssistsPerMinCounts;
    }

    public ParticipantTimelineData getElderLizardKillsPerMinCounts() {
        return elderLizardKillsPerMinCounts;
    }

    public ParticipantTimelineData getInhibitorAssistsPerMinCounts() {
        return inhibitorAssistsPerMinCounts;
    }

    public ParticipantTimelineData getGoldPerMinDeltas() {
        return goldPerMinDeltas;
    }

    public ParticipantTimelineData getInhibitorKillsPerMinCounts() {
        return inhibitorKillsPerMinCounts;
    }

    public ParticipantTimelineData getTowerAssistsPerMinCounts() {
        return towerAssistsPerMinCounts;
    }

    public ParticipantTimelineData getTowerKillsPerMinCounts() {
        return towerKillsPerMinCounts;
    }

    public ParticipantTimelineData getTowerKillsPerMinDeltas() {
        return towerKillsPerMinDeltas;
    }

    public ParticipantTimelineData getVilemawAssistsPerMinCounts() {
        return vilemawAssistsPerMinCounts;
    }

    public ParticipantTimelineData getVilemawKillsPerMinCounts() {
        return vilemawKillsPerMinCounts;
    }

    public ParticipantTimelineData getWardsPerMinDeltas() {
        return wardsPerMinDeltas;
    }

    public ParticipantTimelineData getXpDiffPerMinDeltas() {
        return xpDiffPerMinDeltas;
    }

    public ParticipantTimelineData getXpPerMinDeltas() {
        return xpPerMinDeltas;
    }
}
