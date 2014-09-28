package dto.summoner;

public class Summoner {

    private long id;
    private String name;
    private int profileIconId;
    private long revisionDate;
    private long summonerLevel;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    /**
     * Date the summoner was last modified specified as epoch milliseconds
     * @return
     */
    public long getRevisionDate() {
        return revisionDate;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }
}
