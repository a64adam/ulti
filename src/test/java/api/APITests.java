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

package api;

import dto.Region;
import dto.champion.Champion;
import dto.champion.ChampionList;
import dto.game.RecentGames;
import dto.league.League;
import dto.league.QueueType;
import dto.match.MatchDetail;
import dto.matchhistory.PlayerHistory;
import dto.staticdata.champion.ChampData;
import dto.staticdata.champion.ChampionQueryParams;
import dto.staticdata.item.Item;
import dto.staticdata.item.ItemList;
import dto.staticdata.mastery.Mastery;
import dto.staticdata.mastery.MasteryList;
import dto.staticdata.realm.Realm;
import dto.staticdata.rune.Rune;
import dto.staticdata.rune.RuneList;
import dto.staticdata.summonerspell.SummonerSpell;
import dto.staticdata.summonerspell.SummonerSpellList;
import dto.stats.PlayerStatsSummaryList;
import dto.stats.RankedStats;
import dto.status.Shard;
import dto.status.ShardStatus;
import dto.summoner.MasteryPages;
import dto.summoner.RunePages;
import dto.summoner.Summoner;
import dto.team.Team;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class APITests {

    private static Ulti ulti;
    private static long summonerId;
    private static String teamId;

    @BeforeClass
    public static void setUp() throws Exception {
        ulti = new Ulti("");
        ulti.setShortRateLimit(0.9);
        summonerId = 23287684l;
        teamId = "TEAM-fe3c3290-28e4-11e4-91d2-782bcb4d0bb2";
    }

    /**
     * @see Ulti#getChampions()
     */
    @Test
    public void testGetChampions() {
        ChampionList cl = ulti.getChampions();
        Assert.assertNotNull(cl);
    }

    /**
     * @see Ulti#getChampionById(int)
     */
    @Test
    public void testGetChampionById() {
        Champion c = ulti.getChampionById(10);
        Assert.assertNotNull(c);
    }

    /**
     * @see Ulti#getRecentGames(Long)
     */
    @Test
    public void testGetRecentGames() {
        RecentGames rg = ulti.getRecentGames(summonerId);
        Assert.assertNotNull(rg);
    }

    /**
     * @see Ulti#getLeagueBySummonerId(Long...)
     * @see Ulti#getLeagueBySummonerId(Long)
     */
    @Test
    public void testGetLeagueBySummonerId() {
        List<League> l = ulti.getLeagueBySummonerId(summonerId);

        for (int i = 0; i < l.size(); i++) {
            Assert.assertNotNull(l.get(i));
        }
    }

    /**
     * @see Ulti#getLeagueEntryBySummonerId(Long...)
     * @see Ulti#getLeagueEntryBySummonerId(Long)
     */
    @Test
    public void testGetLeagueEntryBySummonerId() {
        List<League> l = ulti.getLeagueEntryBySummonerId(summonerId);

        for (int i = 0; i < l.size(); i++) {
            Assert.assertNotNull(l.get(i));
        }
    }

    /**
     * @see Ulti#getTeamLeagueById(String...)
     * @see Ulti#getTeamLeagueById(String)
     */
    @Test
    public void testGetTeamLeagueById() {
        List<League> l = ulti.getTeamLeagueById(teamId);

        for (int i = 0; i < l.size(); i++) {
            Assert.assertNotNull(l.get(i));
        }
    }

    /**
     * @see Ulti#getTeamLeagueEntryById(String...)
     * @see Ulti#getTeamLeagueEntryById(String)
     */
    @Test
    public void testGetTeamLeagueEntryById() {
        List<League> l = ulti.getTeamLeagueEntryById(teamId);

        for (int i = 0; i < l.size(); i++) {
            Assert.assertNotNull(l.get(i));
        }
    }

    /**
     * @see Ulti#getChallengers(dto.league.QueueType)
     */
    @Test
    public void testGetChallengers() {
        for (QueueType qt : QueueType.values()) {
            Assert.assertNotNull(ulti.getChallengers(qt));
        }
    }

    /**
     * @see Ulti#getMatchHistoryBySummonerId(Long)
     */
    @Test
    public void testGetMatchHistoryBySummonerId() {
        PlayerHistory ph = ulti.getMatchHistoryBySummonerId(summonerId);
        Assert.assertNotNull(ph);
    }

    /**
     * @see Ulti#getMatchById(Long)
     */
    @Test
    public void testGetMatchById() {
        long matchId = ulti.getMatchHistoryBySummonerId(summonerId).getMatches().get(0).getMatchId();

        MatchDetail md = ulti.getMatchById(matchId);
        Assert.assertNotNull(md);
    }

    /**
     * @see Ulti#getRankedStatsBySummonerId(Long)
     */
    @Test
    public void testGetRankedStatsBySummonerId() {
        RankedStats rs = ulti.getRankedStatsBySummonerId(summonerId);
        Assert.assertNotNull(rs);
    }

    /**
     * @see Ulti#getStatsSummaryBySummonerId(Long)
     */
    @Test
    public void testGetStatsSummaryBySummonerId() {
        PlayerStatsSummaryList pss = ulti.getStatsSummaryBySummonerId(summonerId);
        Assert.assertNotNull(pss);
    }

    /**
     * @see Ulti#getSummonerByName(String)
     * @see Ulti#getSummonerByName(String...)
     */
    @Test
    public void testGetSummonerByName() {
        Summoner s = ulti.getSummonerByName("getCarry");
        Assert.assertNotNull(s);
    }

    /**
     * @see Ulti#getSummonerById(Long)
     * @see Ulti#getSummonerById(Long...)
     */
    @Test
    public void testGetSummonerById() {
        Summoner s = ulti.getSummonerById(summonerId);
        Assert.assertNotNull(s);
    }

    /**
     * @see Ulti#getSummonerNameById(Long)
     * @see Ulti#getSummonerNameById(Long...)
     */
    @Test
    public void testGetSummonerNameById() {
        String s = ulti.getSummonerNameById(summonerId);
        Assert.assertEquals(s.toLowerCase(), "getcarry");
    }

    /**
     * @see Ulti#getMasteriesBySummonerId(Long)
     * @see Ulti#getMasteriesBySummonerId(Long...)
     */
    @Test
    public void testGetMasteriesBySummonerId() {
        MasteryPages mp = ulti.getMasteriesBySummonerId(summonerId);
        Assert.assertNotNull(mp);
    }

    /**
     * @see Ulti#getRunePagesBySummonerId(Long)
     * @see Ulti#getRunePagesBySummonerId(Long...)
     */
    @Test
    public void testGetRunePagesBySummonerId() {
        RunePages rp = ulti.getRunePagesBySummonerId(summonerId);
        Assert.assertNotNull(rp);
    }

    /**
     * @see Ulti#getTeamBySummonerId(Long)
     * @see Ulti#getTeamBySummonerId(Long...)
     */
    @Test
    public void testGetTeamBySummonerId() {
        List<Team> teams = ulti.getTeamBySummonerId(summonerId);
        Assert.assertNotNull(teams);
    }

    /**
     * @see Ulti#getTeamById(String)
     * @see Ulti#getTeamById(String...)
     */
    @Test
    public void testGetTeamById() {
        Team team = ulti.getTeamById(teamId);
        Assert.assertNotNull(team);
    }

    /**
     * @see api.Ulti#getServerStatus()
     */
    @Test
    public void testGetServerStatus() {
        List<Shard> l = ulti.getServerStatus();

        for (Shard s : l) {
            Assert.assertNotNull(s);
        }
    }

    /**
     * @see Ulti#getServerStatus(dto.Region)
     */
    @Test
    public void testGetServerStatusByRegion() {
        ShardStatus ss = ulti.getServerStatus(Region.NA);
        Assert.assertNotNull(ss);
    }
}
