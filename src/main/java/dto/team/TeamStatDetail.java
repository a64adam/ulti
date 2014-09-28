package dto.team;

public class TeamStatDetail {
    private int averageGamesPlayed;
    private int losses;
    private String teamStatType;
    private int wins;


    public int getAverageGamesPlayed() {
        return averageGamesPlayed;
    }

    public int getLosses() {
        return losses;
    }

    public int getWins() {
        return wins;
    }

    public String getTeamStatType() {
        return teamStatType;
    }
}
