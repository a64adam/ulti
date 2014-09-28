package dto.league;

public class MiniSeries {

    private int losses;
    private String progress;
    private int target;
    private int wins;

    public int getLosses() {
        return losses;
    }

    /**
     * @return  String showing the current, sequential mini series progress where 'W' represents a win, 'L' represents
     *          a loss, 'N' represents a game that hasn't been played yet.
     */
    public String getProgress() {
        return progress;
    }

    public int getTarget() {
        return target;
    }

    public int getWins() {
        return wins;
    }
}
