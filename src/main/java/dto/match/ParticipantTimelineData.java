package dto.match;

public class ParticipantTimelineData {

    private double zeroToTen;
    private double tenToTwenty;
    private double thirtyToEnd;
    private double twentyToThirty;

    /**
     * Value per minute from the beginning of the game to 10 min
     */
    public double getZeroToTen() {
        return zeroToTen;
    }

    /**
     * Value per minute from 10 min to 20 min
     */
    public double getTenToTwenty() {
        return tenToTwenty;
    }

    /**
     * Value per minute from 20 min to 30 min
     */
    public double getTwentyToThirty() {
        return twentyToThirty;
    }

    /**
     * Value per minute from 30 min to the end of the game
     */
    public double getThirtyToEnd() {
        return thirtyToEnd;
    }
}
