package dto.summoner;

public class Mastery {
    private int id;
    private int rank;

    /**
     * Mastery ID, for static information correlating to masteries, refer to the static data API
     */
    public int getId() {
        return id;
    }

    /**
     * The number of points put into this mastery
     */
    public int getRank() {
        return rank;
    }
}
