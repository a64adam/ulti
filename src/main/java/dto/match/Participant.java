package dto.match;

import java.util.List;

public class Participant {

    private int championId;
    private List<Mastery> masteries;
    private int participantId;
    private List<Rune> runes;
    private int spell1Id;
    private int spell2Id;
    private ParticipantStats stats;
    private int teamId;
    private ParticipantTimeline timeline;

    public int getChampionId() {
        return championId;
    }

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public int getParticipantId() {
        return participantId;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public int getSpell1Id() {
        return spell1Id;
    }

    public int getSpell2Id() {
        return spell2Id;
    }

    public ParticipantStats getStats() {
        return stats;
    }

    public int getTeamId() {
        return teamId;
    }

    public ParticipantTimeline getTimeline() {
        return timeline;
    }
}
