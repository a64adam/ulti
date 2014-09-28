package dto.match;

public class Player {

    private String matchHistoryUri;
    private int profileIcon;
    private long summonerId;
    private String summonerName;

    public String getMatchHistoryUri() {
        return matchHistoryUri;
    }

    public int getProfileIcon() {
        return profileIcon;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public String getSummonerName() {
        return summonerName;
    }
}
