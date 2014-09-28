package dto.summoner;

/**
 * Created by adam on 8/24/14.
 */
public class RuneSlot {

    private int runeId;
    private int runeSlotid;

    /**
     * Rune ID associated with the rune slot, for static information correlating to rune IDs, refer to the static
     * data API
     */
    public int getRuneId() {
        return runeId;
    }

    public int getRuneSlotid() {
        return runeSlotid;
    }
}
