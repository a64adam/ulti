/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Adam Alyyan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 *  including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 * is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package dto.currentgame;

import java.util.List;

public class CurrentGameInfo {
    private List<BannedChampion> bannedChampions;
    private long gameId;
    private long gameLength;
    private String gameMode;
    private long gameQueueConfigId;
    private long gameStartTime;
    private String gameType;
    private long mapId;
    private Observer observers;
    private List<Participant> participants;
    private String platformId;

    /**
     * @return  A list of the banned champions
     */
    public List<BannedChampion> getBannedChampions() {
        return bannedChampions;
    }

    /**
     * @return  The ID of the game
     */
    public long getGameId() {
        return gameId;
    }

    /**
     * @return  The amount of time in seconds that has passed since the game started
     */
    public long getGameLength() {
        return gameLength;
    }

    /**
     * @return  The game mode: {Legal values: CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, ASCENSION, FIRSTBLOOD, KINGPORO}
     */
    public String getGameMode() {
        return gameMode;
    }

    /**
     * @return  The queue type of the game
     */
    public long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    /**
     * @return  The game start time represented in epoch time
     */
    public long getGameStartTime() {
        return gameStartTime;
    }

    /**
     * @return  The game type: {Legal values: CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME}
     */
    public String getGameType() {
        return gameType;
    }

    /**
     * @return  The ID of the map
     */
    public long getMapId() {
        return mapId;
    }

    /**
     * @return  The participant information
     */
    public List<Participant> getParticipants() {
        return participants;
    }

    /**
     * @return  The observer information
     */
    public Observer getObservers() {
        return observers;
    }

    /**
     * @return  The ID of the platform that the game is being played on
     */
    public String getPlatformId() {
        return platformId;
    }
}
