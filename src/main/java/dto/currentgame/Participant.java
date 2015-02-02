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

public class Participant {

    private boolean bot;
    private long championId;
    private List<Mastery> masteries;
    private long profileIconId;
    private List<Rune> runes;
    private long spell1Id;
    private long spell2Id;
    private long summonerId;
    private String summonerName;
    private long teamId;

    /**
     * @return  Flag indicating whether or not this participant is a bot
     */
    public boolean isBot() {
        return bot;
    }

    /**
     * @return  The ID of the champion played by this participant
     */
    public long getChampionId() {
        return championId;
    }

    /**
     * @return  The masteries used by this participant
     */
    public List<Mastery> getMasteries() {
        return masteries;
    }

    /**
     * @return  The runes used by this participant
     */
    public List<Rune> getRunes() {
        return runes;
    }

    /**
     * @return  The ID of the profile icon used by this participant
     */
    public long getProfileIconId() {
        return profileIconId;
    }

    /**
     * @return  The ID of the first summoner spell used by this participant
     */
    public long getSpell1Id() {
        return spell1Id;
    }

    /**
     * @return  The ID of the second summoner spell used by this participant
     */
    public long getSpell2Id() {
        return spell2Id;
    }

    /**
     * @return  The summoner ID of this participant
     */
    public long getSummonerId() {
        return summonerId;
    }

    /**
     * @return  The summoner name of this participant
     */
    public String getSummonerName() {
        return summonerName;
    }

    /**
     * @return  The team ID of this participant, indicating the participant's team
     */
    public long getTeamId() {
        return teamId;
    }
}
