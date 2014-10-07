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

package dto.game;

public class RawStats {

    private int assists;
    private int barracksKilled;
    private int championsKilled;
    private int combatPlayerScore;
    private int consumablesPurchased;
    private int damageDealtPlayer;
    private int doubleKills;
    private int firstBlood;
    private int gold;
    private int goldEarned;
    private int goldSpent;
    private int item0;
    private int item1;
    private int item2;
    private int item3;
    private int item4;
    private int item5;
    private int item6;
    private int itemsPurchased;
    private int killingSprees;
    private int largestCriticalStrike;
    private int largestKillingSpree;
    private int largestMultiKill;
    private int legendaryItemsCreated;
    private int level;
    private int magicDamageDealtPlayer;
    private int magicDamageDealtToChampions;
    private int magicDamageTaken;
    private int minionsDenied;
    private int minionsKilled;
    private int neutralMinionsKilled;
    private int neutralMinionsKilledEnemyJungle;
    private int neutralMinionsKilledYourJungle;
    private boolean nexusKilled;
    private int nodeCapture;
    private int nodeCaptureAssist;
    private int nodeNeutralize;
    private int nodeNeutralizeAssist;
    private int numDeaths;
    private int numItemsBought;
    private int objectivePlayerScore;
    private int pentaKills;
    private int physicalDamageDealtPlayer;
    private int physicalDamageDealtToChampions;
    private int physicalDamageTaken;
    private int quadraKills;
    private int sightWardsBought;
    private int spell1Cast;
    private int spell2Cast;
    private int spell3Cast;
    private int spell4Cast;
    private int summonSpell1Cast;
    private int summonSpell2Cast;
    private int superMonsterKilled;
    private int team;
    private int teamObjective;
    private int timePlayed;
    private int totalDamageDealt;
    private int totalDamageDealtToChampions;
    private int totalDamageTaken;
    private int totalHeal;
    private int totalPlayerScore;
    private int totalScoreRank;
    private int totalTimeCrowdControlDealt;
    private int totalUnitsHealed;
    private int tripleKills;
    private int trueDamageDealtPlayer;
    private int trueDamageDealtToChampions;
    private int trueDamageTaken;
    private int turretsKilled;
    private int unrealKills;
    private int victoryPointTotal;
    private int visionWardsBought;
    private int wardKilled;
    private int wardPlaced;
    private boolean win;

    public int getAssists() {
        return assists;
    }

    /**
     * @return the number of inhibitors destroyed
     */
    public int getBarracksKilled() {
        return barracksKilled;
    }

    public int getChampionsKilled() {
        return championsKilled;
    }

    public int getCombatPlayerScore() {
        return combatPlayerScore;
    }

    public int getConsumablesPurchased() {
        return consumablesPurchased;
    }

    public int getDamageDealtPlayer() {
        return damageDealtPlayer;
    }

    public int getDoubleKills() {
        return doubleKills;
    }

    public int getFirstBlood() {
        return firstBlood;
    }

    public int getGold() {
        return gold;
    }

    public int getGoldEarned() {
        return goldEarned;
    }

    public int getGoldSpent() {
        return goldSpent;
    }

    public int getItem0() {
        return item0;
    }

    public int getItem1() {
        return item1;
    }

    public int getItem2() {
        return item2;
    }

    public int getItem3() {
        return item3;
    }

    public int getItem4() {
        return item4;
    }

    public int getItem5() {
        return item5;
    }

    public int getItem6() {
        return item6;
    }

    public int getItemsPurchased() {
        return itemsPurchased;
    }

    public int getKillingSprees() {
        return killingSprees;
    }

    public int getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public int getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public int getLargestMultiKill() {
        return largestMultiKill;
    }

    /**
     * @return  the number of tier 3 items built
     */
    public int getLegendaryItemsCreated() {
        return legendaryItemsCreated;
    }

    public int getLevel() {
        return level;
    }

    public int getMagicDamageDealtPlayer() {
        return magicDamageDealtPlayer;
    }

    public int getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public int getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public int getMinionsDenied() {
        return minionsDenied;
    }

    public int getMinionsKilled() {
        return minionsKilled;
    }

    public int getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public int getNeutralMinionsKilledEnemyJungle() {
        return neutralMinionsKilledEnemyJungle;
    }

    public int getNeutralMinionsKilledYourJungle() {
        return neutralMinionsKilledYourJungle;
    }

    /**
     *
     * @return  flag specifying if the summoner got the killing blow on the nexus
     */
    public boolean isNexusKilled() {
        return nexusKilled;
    }

    public int getNodeCapture() {
        return nodeCapture;
    }

    public int getNodeCaptureAssist() {
        return nodeCaptureAssist;
    }

    public int getNodeNeutralize() {
        return nodeNeutralize;
    }

    public int getNodeNeutralizeAssist() {
        return nodeNeutralizeAssist;
    }

    public int getNumDeaths() {
        return numDeaths;
    }

    public int getNumItemsBought() {
        return numItemsBought;
    }

    public int getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    public int getPentaKills() {
        return pentaKills;
    }

    public int getPhysicalDamageDealtPlayer() {
        return physicalDamageDealtPlayer;
    }

    public int getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public int getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public int getQuadraKills() {
        return quadraKills;
    }

    public int getSightWardsBought() {
        return sightWardsBought;
    }

    /**
     * @return  number of times first champion spell was cast
     */
    public int getSpell1Cast() {
        return spell1Cast;
    }

    /**
     * @return  number of times second champion spell was cast
     */
    public int getSpell2Cast() {
        return spell2Cast;
    }

    /**
     * @return  number of times third champion spell was cast
     */
    public int getSpell3Cast() {
        return spell3Cast;
    }

    /**
     * @return  number of times fourth champion spell was cast
     */
    public int getSpell4Cast() {
        return spell4Cast;
    }

    public int getSummonSpell1Cast() {
        return summonSpell1Cast;
    }

    public int getSummonSpell2Cast() {
        return summonSpell2Cast;
    }

    public int getSuperMonsterKilled() {
        return superMonsterKilled;
    }

    public int getTeam() {
        return team;
    }

    public int getTeamObjective() {
        return teamObjective;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public int getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public int getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public int getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public int getTotalHeal() {
        return totalHeal;
    }

    public int getTotalPlayerScore() {
        return totalPlayerScore;
    }

    public int getTotalScoreRank() {
        return totalScoreRank;
    }

    public int getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public int getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public int getTripleKills() {
        return tripleKills;
    }

    public int getTrueDamageDealtPlayer() {
        return trueDamageDealtPlayer;
    }

    public int getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public int getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public int getTurretsKilled() {
        return turretsKilled;
    }

    public int getUnrealKills() {
        return unrealKills;
    }

    public int getVictoryPointTotal() {
        return victoryPointTotal;
    }

    public int getVisionWardsBought() {
        return visionWardsBought;
    }

    public int getWardKilled() {
        return wardKilled;
    }

    public int getWardPlaced() {
        return wardPlaced;
    }

    /**
     * @return  flag specifying whether or not this game was won
     */
    public boolean isWin() {
        return win;
    }
}
