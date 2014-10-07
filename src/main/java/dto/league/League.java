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

package dto.league;

import java.util.List;

public class League {

    private List<LeagueEntry> entries;
    private String name;
    private String participantId;
    private String queue;
    private String tier;

    public List<LeagueEntry> getEntries() {
        return entries;
    }

    /**
     * Specifies the participant that is a member of this league (i.e., a requested summoner ID, a requested team
     * ID, or the ID of a team to which one of the requested summoners belongs). Only present when full league is
     * requested so that participant's entry can be identified. Not present when individual entry is requested.
     */
    public String getParticipantId() {
        return participantId;
    }

    /**
     * This name is an internal place-holder name only. Display and localization of names in the game client are
     * handled client-side.
     */
    public String getName() {
        return name;
    }

    /**
     * Legal values: RANKED_SOLO_5x5, RANKED_TEAM_3x3, RANKED_TEAM_5x5
     *
     * @return  a {@link java.lang.String} representing the queue type
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Legal values: CHALLENGER, MASTER, DIAMOND, PLATINUM, GOLD, SILVER, BRONZE
     *
     * @return  a {@link java.lang.String} representing the tier
     */
    public String getTier() {
        return tier;
    }
}
