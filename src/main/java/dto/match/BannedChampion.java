package dto.match;

public class BannedChampion {

    private int championId;
    private int pickTurn;

    public int getChampionId() {
        return championId;
    }

    /**
     * @return turn during which the champion was banned
     */
    public int getPickTurn() {
        return pickTurn;
    }
}
