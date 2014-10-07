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

package dto.team;


import java.util.List;

public class Team {

    private long createDate;
    private String fullId;
    private long lastGameDate;
    private long lastJoinDate;
    private long lastJoinedRankedTeamQueueDate;
    private List<MatchHistorySummary> matchHistory;
    private long modifyDate;
    private String name;
    private Roster roster;
    private long secondLastJoinDate;
    private String status;
    private String tag;
    private List<TeamStatDetail> teamStatDetails;
    private long thirdLastJoinDate;

    /**
     * Date that the team was created specified as epoch milliseconds
     */
    public long getCreateDate() {
        return createDate;
    }

    public String getFullId() {
        return fullId;
    }

    /**
     * Date that the last game played by the team ended specified as epoch milliseconds
     */
    public long getLastGameDate() {
        return lastGameDate;
    }

    /**
     * Date that the last memeber joined specified as epoch milliseconds
     */
    public long getLastJoinDate() {
        return lastJoinDate;
    }

    /**
     * Date that the team last joined the ranked team queue specified as epoch milliseconds
     */
    public long getLastJoinedRankedTeamQueueDate() {
        return lastJoinedRankedTeamQueueDate;
    }

    public List<MatchHistorySummary> getMatchHistory() {
        return matchHistory;
    }

    /**
     * Date that the team was last modified specified as epoch milliseconds
     */
    public long getModifyDate() {
        return modifyDate;
    }

    public String getName() {
        return name;
    }

    public Roster getRoster() {
        return roster;
    }

    /**
     * Date that the second to last member joined specified as epoch milliseconds
     */
    public long getSecondLastJoinDate() {
        return secondLastJoinDate;
    }

    public String getStatus() {
        return status;
    }

    public String getTag() {
        return tag;
    }

    public List<TeamStatDetail> getTeamStatDetails() {
        return teamStatDetails;
    }

    /**
     * Date that the third to last member joined specified as epoch milliseconds
     */
    public long getThirdLastJoinDate() {
        return thirdLastJoinDate;
    }
}
