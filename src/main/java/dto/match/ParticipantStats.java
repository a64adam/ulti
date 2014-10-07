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

package dto.match;

public class ParticipantStats {

    private long assists;
    private long champLevel;
    private long combatPlayerScore;
    private long deaths;
    private long doubleKills;
    private boolean firstBloodAssist;
    private boolean firstBloodKill;
    private boolean firstInhibitorAssist;
    private boolean firstInhibitorKill;
    private boolean firstTowerAssist;
    private boolean firstTowerKill;
    private long goldEarned;
    private long goldSpent;
    private long inhibitorKills;
    private long item0;
    private long item1;
    private long item2;
    private long item3;
    private long item4;
    private long item5;
    private long item6;
    private long killingSprees;
    private long kills;
    private long largestCriticalStrike;
    private long largestKillingSpree;
    private long largestMultiKill;
    private long magicDamageDealt;
    private long magicDamageDealtToChampions;
    private long magicDamageTaken;
    private long minionsKilled;
    private long neutralMinionsKilled;
    private long neutralMinionsKilledEnemyJungle;
    private long neutralMinionsKilledTeamJungle;
    private long nodeCapture;
    private long nodeCaptureAssist;
    private long nodeNeutralize;
    private long nodeNeutralizeAssist;
    private long objectivePlayerScore;
    private long pentaKills;
    private long physicalDamageDealt;
    private long physicalDamageDealtToChampions;
    private long physicalDamageTaken;
    private long quadraKills;
    private long sightWardsBoughtInGame;
    private long teamObjective;
    private long totalDamageDealt;
    private long totalDamageDealtToChampions;
    private long totalDamageTaken;
    private long totalHeal;
    private long totalPlayerScore;
    private long totalScoreRank	;
    private long totalTimeCrowdControlDealt;
    private long totalUnitsHealed;
    private long towerKills;
    private long tripleKills;
    private long trueDamageDealt;
    private long trueDamageDealtToChampions;
    private long trueDamageTaken;
    private long visionWardsBoughtInGame;
    private long wardsKilled;
    private long wardsPlaced;
    private boolean winner;

    public long getAssists() {
        return assists;
    }

    public long getChampLevel() {
        return champLevel;
    }

    /**
     * @return if the game was a dominion game, player's combat score, otherwise 0
     */
    public long getCombatPlayerScore() {
        return combatPlayerScore;
    }

    public long getDeaths() {
        return deaths;
    }

    public long getDoubleKills() {
        return doubleKills;
    }

    public boolean isFirstBloodAssist() {
        return firstBloodAssist;
    }

    public boolean isFirstBloodKill() {
        return firstBloodKill;
    }

    public boolean isFirstInhibitorAssist() {
        return firstInhibitorAssist;
    }

    public boolean isFirstInhibitorKill() {
        return firstInhibitorKill;
    }

    public boolean isFirstTowerAssist() {
        return firstTowerAssist;
    }

    public boolean isFirstTowerKill() {
        return firstTowerKill;
    }

    public long getGoldEarned() {
        return goldEarned;
    }

    public long getGoldSpent() {
        return goldSpent;
    }

    public long getInhibitorKills() {
        return inhibitorKills;
    }

    public long getItem0() {
        return item0;
    }

    public long getItem1() {
        return item1;
    }

    public long getItem2() {
        return item2;
    }

    public long getItem3() {
        return item3;
    }

    public long getItem4() {
        return item4;
    }

    public long getItem5() {
        return item5;
    }

    public long getItem6() {
        return item6;
    }

    public long getKillingSprees() {
        return killingSprees;
    }

    public long getKills() {
        return kills;
    }

    public long getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public long getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public long getLargestMultiKill() {
        return largestMultiKill;
    }

    public long getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public long getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public long getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public long getMinionsKilled() {
        return minionsKilled;
    }

    public long getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public long getNeutralMinionsKilledEnemyJungle() {
        return neutralMinionsKilledEnemyJungle;
    }

    public long getNeutralMinionsKilledTeamJungle() {
        return neutralMinionsKilledTeamJungle;
    }

    /**
     * @return  if the game was a dominion game, number of node captures
     */
    public long getNodeCapture() {
        return nodeCapture;
    }

    /**
     * @return  if the game was a dominion game, number of node capture assists
     */
    public long getNodeCaptureAssist() {
        return nodeCaptureAssist;
    }

    /**
     * @return  if the game was a dominion game, number of node neutralizations
     */
    public long getNodeNeutralize() {
        return nodeNeutralize;
    }

    /**
     * @return  if the game was a dominion game, number of node neutralizations assists
     */
    public long getNodeNeutralizeAssist() {
        return nodeNeutralizeAssist;
    }

    /**
     * @return  if the game was a dominion game, player's objectives score, otherwise 0
     */
    public long getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    public long getPentaKills() {
        return pentaKills;
    }

    public long getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public long getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public long getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public long getQuadraKills() {
        return quadraKills;
    }

    public long getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    /**
     * @return  if the game was a dominion game, number of complete team objectives (i.e. quests)
     */
    public long getTeamObjective() {
        return teamObjective;
    }

    public long getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public long getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public long getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public long getTotalHeal() {
        return totalHeal;
    }

    /**
     * @return  if the game was a dominion game, player's total score, otherwise 0
     */
    public long getTotalPlayerScore() {
        return totalPlayerScore;
    }

    /**
     * @return  if the game was a dominion game, team rank of the player's total score (e.g., 1-5)
     */
    public long getTotalScoreRank() {
        return totalScoreRank;
    }

    public long getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public long getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public long getTowerKills() {
        return towerKills;
    }

    public long getTripleKills() {
        return tripleKills;
    }

    public long getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public long getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public long getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public long getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public long getWardsKilled() {
        return wardsKilled;
    }

    public long getWardsPlaced() {
        return wardsPlaced;
    }

    public boolean isWinner() {
        return winner;
    }
}
