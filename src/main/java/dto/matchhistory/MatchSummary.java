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

package dto.matchhistory;

import dto.match.Participant;
import dto.match.ParticipantIdentity;

import java.util.List;

public class MatchSummary {

    private int mapId;

    private long matchCreation;
    private long matchDuration;
    private long matchId;
    private String matchMode;
    private String matchType;
    private String matchVersion;
    private List<ParticipantIdentity> participantIdentities;
    private List<Participant> participants;
    private String queueType;
    private String region;
    private String season;

    public int getMapId() {
        return mapId;
    }

    /**
     * Designates when the team select lobby is created and/or the match is made through match making, not when the game
     * actually starts.
     */
    public long getMatchCreation() {
        return matchCreation;
    }

    public long getMatchDuration() {
        return matchDuration;
    }

    public long getMatchId() {
        return matchId;
    }

    /**
     * Legal values: CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, ASCENSION, FIRSTBLOOD
     *
     * @return  a {@link java.lang.String} representing the match mode
     */
    public String getMatchMode() {
        return matchMode;
    }

    /**
     * Legal values: CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME
     *
     * @return  a {@link java.lang.String} representing the match type
     */
    public String getMatchType() {
        return matchType;
    }

    public String getMatchVersion() {
        return matchVersion;
    }

    public List<ParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    /**
     * Legal values: CUSTOM, NORMAL_5x5_BLIND, RANKED_SOLO_5x5, RANKED_PREMADE_5x5, BOT_5x5, NORMAL_3x3,
     * RANKED_PREMADE_3x3, NORMAL_5x5_DRAFT, ODIN_5x5_BLIND, ODIN_5x5_DRAFT, BOT_ODIN_5x5, BOT_5x5_INTRO,
     * BOT_5x5_BEGINNER, BOT_5x5_INTERMEDIATE, RANKED_TEAM_3x3, RANKED_TEAM_5x5, BOT_TT_3x3, GROUP_FINDER_5x5,
     * ARAM_5x5, ONEFORALL_5x5, FIRSTBLOOD_1x1, FIRSTBLOOD_2x2, SR_6x6, URF_5x5, BOT_URF_5x5, NIGHTMARE_BOT_5x5_RANK1,
     * NIGHTMARE_BOT_5x5_RANK2, NIGHTMARE_BOT_5x5_RANK5, ASCENSION_5x5
     *
     * @return  a {@link java.lang.String} representing the match queue type
     */
    public String getQueueType() {
        return queueType;
    }

    public String getRegion() {
        return region;
    }

    /**
     * Legal values: PRESEASON3, SEASON3, PRESEASON2014, SEASON2014
     *
     * @return  a {@link java.lang.String} representing the season the match was played in
     */
    public String getSeason() {
        return season;
    }
}
