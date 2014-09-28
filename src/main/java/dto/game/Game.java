package dto.game;

import java.util.List;

public class Game {

    private int championId;
    private long createDate;
    private List<Player> fellowPlayers;
    private long gameId;
    private String gameMode;
    private String gameType;
    private boolean invalid;
    private int ipEarned;
    private int level;
    private int mapId;
    private int spell1;
    private int spell2;
    private RawStats stats;
    private String subType;
    private int teamId;


    /**
     * @return  champion ID associated with the game
     */
    public int getChampionId() {
        return championId;
    }

    /**
     * @return date that the game data was recorded, specified as epoch milliseconds
     */
    public long getCreateDate() {
        return createDate;
    }

    /**
     * @return  a {@link java.util.List} of {@link dto.game.Player} representing the other players associated
     *          with the game
     */
    public List<Player> getFellowPlayers() {
        return fellowPlayers;
    }

    public long getGameId() {
        return gameId;
    }

    /**
     * @return  a {@link java.lang.String} representing the game mode, legal values are:
     *          CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, FIRSTBLOOD
     */
    public String getGameMode() {
        return gameMode;
    }

    /**
     * @return  a {@link java.lang.String} representing the game type, legal values are:
     *          CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME
     */
    public String getGameType() {
        return gameType;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public int getIpEarned() {
        return ipEarned;
    }

    public int getLevel() {
        return level;
    }

    public int getMapId() {
        return mapId;
    }

    /**
     * @return the ID of the first summoner spell
     */
    public int getSpell1() {
        return spell1;
    }

    /**
     * @return the ID of the second summoner spell
     */
    public int getSpell2() {
        return spell2;
    }

    /**
     * @return  a {@link dto.game.RawStats} objects representing statistics for the summoner in this game
     */
    public RawStats getStats() {
        return stats;
    }

    /**
     * @return  a {@link java.lang.String} representing the game sub-type, legal values are:
     *          NONE, NORMAL, BOT, RANKED_SOLO_5x5, RANKED_PREMADE_3x3, RANKED_PREMADE_5x5, ODIN_UNRANKED,
     *          RANKED_TEAM_3x3, RANKED_TEAM_5x5, NORMAL_3x3, BOT_3x3, CAP_5x5, ARAM_UNRANKED_5x5, ONEFORALL_5x5,
     *          FIRSTBLOOD_1x1, FIRSTBLOOD_2x2, SR_6x6, URF, URF_BOT, NIGHTMARE_BOT
     */
    public String getSubType() {
        return subType;
    }

    public int getTeamId() {
        return teamId;
    }

}
