package dto.match;

import java.util.List;

public class Team {

    private List<BannedChampion> bans;
    private int baronKills;
    private long dominionVictoryScore;
    private int dragonKills;
    private boolean firstBaron;
    private boolean firstBlood;
    private boolean firstDragon;
    private boolean firstInhibitor;
    private boolean firstTower;
    private int inhibitorKills;
    private int teamId;
    private int towerKills;
    private int vilemawKills;
    private boolean winner;

    /**
     * If game was draft mode, contains banned champion data, otherwise null.
     */
    public List<BannedChampion> getBans() {
        return bans;
    }

    public int getBaronKills() {
        return baronKills;
    }

    /**
     * If game was a dominion game, specifies the points the team had at the game end, otherwise null
     */
    public long getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public int getDragonKills() {
        return dragonKills;
    }

    public boolean isFirstBaron() {
        return firstBaron;
    }

    public boolean isFirstBlood() {
        return firstBlood;
    }

    public boolean isFirstDragon() {
        return firstDragon;
    }

    public boolean isFirstInhibitor() {
        return firstInhibitor;
    }

    public boolean isFirstTower() {
        return firstTower;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getTowerKills() {
        return towerKills;
    }

    public int getVilemawKills() {
        return vilemawKills;
    }

    public boolean isWinner() {
        return winner;
    }
}
