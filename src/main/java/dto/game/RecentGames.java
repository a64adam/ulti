package dto.game;

import java.util.Set;

public class RecentGames {

    private Set<Game> games;
    private long summonerId;

    /**
     * Only the most recent 10 games with be returned. For a larger set of history, please use the Match and
     * MatchHistory APIs.
     *
     * @return  a {@link java.util.Set} of {@link dto.game.Game} containing the most recent games played
     *          by the summoner
     *
     */
    public Set<Game> getGames() {
        return games;
    }

    public long getSummonerId() {
        return summonerId;
    }
}
