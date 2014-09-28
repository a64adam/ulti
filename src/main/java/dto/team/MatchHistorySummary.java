package dto.team;

public class MatchHistorySummary {

    private int assists;
    private long date;
    private int deaths;
    private long gameId;
    private String gameMode;
    private boolean invalid;
    private int kills;
    private int mapId;
    private int opposingTeamKills;
    private String opposingTeamName;
    private boolean win;


    public long getGameId() {
        return gameId;
    }

    public int getAssists() {
        return assists;
    }

    /**
     * Date that the match was completed specified as epoch milliseconds
     */
    public long getDate() {
        return date;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getMapId() {
        return mapId;
    }

    public int getOpposingTeamKills() {
        return opposingTeamKills;
    }

    public String getGameMode() {
        return gameMode;
    }

    public String getOpposingTeamName() {
        return opposingTeamName;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public boolean isWin() {
        return win;
    }

    public int getKills() {
        return kills;
    }
}
