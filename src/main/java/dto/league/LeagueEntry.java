package dto.league;

public class LeagueEntry {

    private String division;
    private boolean isFreshBlood;
    private boolean isHotStreak;
    private boolean isInactive;
    private boolean isVeteran;
    private int leaguePoints;
    private MiniSeries miniSeries;
    private String playerOrTeamId;
    private String playerOrTeamName;
    private int wins;

    public String getDivision() {
        return division;
    }

    public boolean isFreshBlood() {
        return isFreshBlood;
    }

    public boolean isHotStreak() {
        return isHotStreak;
    }

    public boolean isInactive() {
        return isInactive;
    }

    public boolean isVeteran() {
        return isVeteran;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    /**
     * Mini series data for the participant. Only present if the participant is current in a mini series.
     */
    public MiniSeries getMiniSeries() {
        return miniSeries;
    }

    public String getPlayerOrTeamId() {
        return playerOrTeamId;
    }

    public String getPlayerOrTeamName() {
        return playerOrTeamName;
    }

    public int getWins() {
        return wins;
    }
}
