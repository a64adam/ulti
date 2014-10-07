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

package dto.stats;

public class AggregatedStats {

    private int averageAssists;
    private int averageChampionsKilled;
    private int averageCombatPlayerScore;
    private int averageNodeCapture;
    private int averageNodeCaptureAssist;
    private int averageNodeNeutralize;
    private int averageNodeNeutralizeAssist;
    private int averageNumDeaths;
    private int averageObjectivePlayerScore;
    private int averageTeamObjective;
    private int averageTotalPlayerScore;
    private int botGamesPlayed;
    private int killingSpree;
    private int maxAssists;
    private int maxChampionsKilled;
    private int maxCombatPlayerScore;
    private int maxLargestCriticalStrike;
    private int maxLargestKillingSpree;
    private int maxNodeCapture;
    private int maxNodeCaptureAssist;
    private int maxNodeNeutralize;
    private int maxNodeNeutralizeAssist;
    private int maxNumDeaths;
    private int maxObjectivePlayerScore;
    private int maxTeamObjective;
    private int maxTimePlayed;
    private int maxTimeSpentLiving;
    private int maxTotalPlayerScore;
    private int mostChampionKillsPerSession;
    private int mostSpellsCast;
    private int normalGamesPlayed;
    private int rankedPremadeGamesPlayed;
    private int rankedSoloGamesPlayed;
    private int totalAssists;
    private int totalChampionKills;
    private int totalDamageDealt;
    private int totalDamageTaken;
    private int totalDeathsPerSession;
    private int totalDoubleKills;
    private int totalFirstBlood;
    private int totalGoldEarned;
    private int totalHeal;
    private int totalMagicDamageDealt;
    private int totalMinionKills;
    private int totalNeutralMinionsKilled;
    private int totalNodeCapture;
    private int totalNodeNeutralize;
    private int totalPentaKills;
    private int totalPhysicalDamageDealt;
    private int totalQuadraKills;
    private int totalSessionsLost;
    private int totalSessionsPlayed;
    private int totalSessionsWon;
    private int totalTripleKills;
    private int totalTurretsKilled;
    private int totalUnrealKills;

    /**
     * Only available in Dominion games
     */
    public int getAverageAssists() {
        return averageAssists;
    }

    /**
     * Only available in Dominion games
     */
    public int getAverageChampionsKilled() {
        return averageChampionsKilled;
    }

    /**
     * Only available in Dominion games
     */
    public int getAverageCombatPlayerScore() {
        return averageCombatPlayerScore;
    }

    /**
     * Only available in Dominion games
     */
    public int getAverageNodeCapture() {
        return averageNodeCapture;
    }

    /**
     * Only available in Dominion games
     */
    public int getAverageNodeCaptureAssist() {
        return averageNodeCaptureAssist;
    }

    /**
     * Only available in Dominion games
     */
    public int getAverageNodeNeutralize() {
        return averageNodeNeutralize;
    }

    /**
     * Only available in Dominion games
     */
    public int getAverageNodeNeutralizeAssist() {
        return averageNodeNeutralizeAssist;
    }

    /**
     * Only available in Dominion games
     */
    public int getAverageNumDeaths() {
        return averageNumDeaths;
    }

    /**
     * Only available in Dominion games
     */
    public int getAverageObjectivePlayerScore() {
        return averageObjectivePlayerScore;
    }

    /**
     * Only available in Dominion games
     */
    public int getAverageTeamObjective() {
        return averageTeamObjective;
    }

    /**
     * Only available in Dominion games
     */
    public int getAverageTotalPlayerScore() {
        return averageTotalPlayerScore;
    }

    public int getBotGamesPlayed() {
        return botGamesPlayed;
    }

    public int getKillingSpree() {
        return killingSpree;
    }

    /**
     * Only available in Dominion games
     */
    public int getMaxAssists() {
        return maxAssists;
    }

    public int getMaxChampionsKilled() {
        return maxChampionsKilled;
    }

    /**
     * Only available in Dominion games
     */
    public int getMaxCombatPlayerScore() {
        return maxCombatPlayerScore;
    }

    public int getMaxLargestCriticalStrike() {
        return maxLargestCriticalStrike;
    }

    public int getMaxLargestKillingSpree() {
        return maxLargestKillingSpree;
    }

    /**
     * Only available in Dominion games
     */
    public int getMaxNodeCapture() {
        return maxNodeCapture;
    }

    /**
     * Only available in Dominion games
     */
    public int getMaxNodeCaptureAssist() {
        return maxNodeCaptureAssist;
    }

    /**
     * Only available in Dominion games
     */
    public int getMaxNodeNeutralize() {
        return maxNodeNeutralize;
    }

    /**
     * Only available in Dominion games
     */
    public int getMaxNodeNeutralizeAssist() {
        return maxNodeNeutralizeAssist;
    }

    /**
     * Only returned for ranked statistics
     */
    public int getMaxNumDeaths() {
        return maxNumDeaths;
    }

    /**
     * Only available in Dominion games
     */
    public int getMaxObjectivePlayerScore() {
        return maxObjectivePlayerScore;
    }

    /**
     * Only available in Dominion games
     */
    public int getMaxTeamObjective() {
        return maxTeamObjective;
    }

    public int getMaxTimePlayed() {
        return maxTimePlayed;
    }

    public int getMaxTimeSpentLiving() {
        return maxTimeSpentLiving;
    }

    /**
     * Only available in Dominion games
     */
    public int getMaxTotalPlayerScore() {
        return maxTotalPlayerScore;
    }

    public int getMostChampionKillsPerSession() {
        return mostChampionKillsPerSession;
    }

    public int getMostSpellsCast() {
        return mostSpellsCast;
    }

    public int getNormalGamesPlayed() {
        return normalGamesPlayed;
    }

    public int getRankedPremadeGamesPlayed() {
        return rankedPremadeGamesPlayed;
    }

    public int getRankedSoloGamesPlayed() {
        return rankedSoloGamesPlayed;
    }

    public int getTotalAssists() {
        return totalAssists;
    }

    public int getTotalChampionKills() {
        return totalChampionKills;
    }

    public int getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public int getTotalDamageTaken() {
        return totalDamageTaken;
    }

    /**
     * Only returned for ranked statistics
     */
    public int getTotalDeathsPerSession() {
        return totalDeathsPerSession;
    }

    public int getTotalDoubleKills() {
        return totalDoubleKills;
    }

    public int getTotalFirstBlood() {
        return totalFirstBlood;
    }

    public int getTotalGoldEarned() {
        return totalGoldEarned;
    }

    public int getTotalHeal() {
        return totalHeal;
    }

    public int getTotalMagicDamageDealt() {
        return totalMagicDamageDealt;
    }

    public int getTotalMinionKills() {
        return totalMinionKills;
    }

    public int getTotalNeutralMinionsKilled() {
        return totalNeutralMinionsKilled;
    }

    /**
     * Only available in Dominion games
     */
    public int getTotalNodeCapture() {
        return totalNodeCapture;
    }

    /**
     * Only available in Dominion games
     */
    public int getTotalNodeNeutralize() {
        return totalNodeNeutralize;
    }

    public int getTotalPentaKills() {
        return totalPentaKills;
    }

    public int getTotalQuadraKills() {
        return totalQuadraKills;
    }

    public int getTotalPhysicalDamageDealt() {
        return totalPhysicalDamageDealt;
    }

    public int getTotalSessionsLost() {
        return totalSessionsLost;
    }

    public int getTotalSessionsPlayed() {
        return totalSessionsPlayed;
    }

    public int getTotalSessionsWon() {
        return totalSessionsWon;
    }

    public int getTotalTripleKills() {
        return totalTripleKills;
    }

    public int getTotalTurretsKilled() {
        return totalTurretsKilled;
    }

    public int getTotalUnrealKills() {
        return totalUnrealKills;
    }
}
