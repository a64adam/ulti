package dto.champion;


public class Champion {


    private boolean active;
    private boolean botEnabled;
    private boolean botMmEnabled;
    private boolean freeToPlay;
    private long id;
    private boolean rankedPlayEnabled;


    /**
     * @return true if the champion is currently active (available to play), false otherwise
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @return true if the bot enabled flag is enabled (only applies for custom games), false otherwise
     */
    public boolean isBotEnabled() {
        return botEnabled;
    }

    /**
     * @return true if the bot match made flag is enabled (only applies to Co-op vs. AI games), false otherwise
     */
    public boolean isBotMmEnabled() {
        return botMmEnabled;
    }

    /**
     * @return  the champion ID. This ID can be used with the static data API to get more information about
     *          the champion
     */
    public long getId() {
        return id;
    }

    /**
     * @return  true if the champion is free to play, false otherwise. Free to play champions rotate so this will
     *          not always return the same value
     */
    public boolean isFreeToPlay() {
        return freeToPlay;
    }

    /**
     * @return  true if the champion is enabled in ranked, false otherwise
     */
    public boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }
}
