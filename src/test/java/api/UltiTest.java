package api;

import dto.Region;
import dto.champion.Champion;
import dto.champion.ChampionList;
import dto.game.RecentGames;
import dto.league.League;
import dto.match.MatchDetail;
import dto.matchhistory.PlayerHistory;
import dto.staticdata.Item;
import dto.staticdata.ItemList;
import dto.staticdata.Mastery;
import dto.staticdata.MasteryList;
import dto.staticdata.Realm;
import dto.staticdata.Rune;
import dto.staticdata.RuneList;
import dto.staticdata.SummonerSpell;
import dto.staticdata.SummonerSpellList;
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

public class UltiTest {

    private static Ulti ulti;
    private static long summonerId;
    private static String teamId;

    @BeforeClass
    public static void setUp() throws Exception {
        ulti = new Ulti("db012a8a-e9c0-413d-9c97-9dffe07a91c5");
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
     * @see Ulti#getChallengers()
     */
    @Test
    public void testGetChallengers() {
        League l = ulti.getChallengers();
        Assert.assertNotNull(l);
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

    /**
     * @see api.Ulti#getStaticChampionList()
     */
    @Test
    public void testGetStaticChampionList() {
        dto.staticdata.ChampionList cl = ulti.getStaticChampionList();
        Assert.assertNotNull(cl);
    }

    /**
     * @see Ulti#getStaticChampion(int)
     */
    @Test
    public void testGetStaticChampion() {
        dto.staticdata.ChampionList cl = ulti.getStaticChampionList();
        Iterator<dto.staticdata.Champion> iter = cl.getData().values().iterator();

        while (iter.hasNext()) {
            dto.staticdata.Champion c = iter.next();
            Assert.assertNotNull(ulti.getStaticChampion(c.getId()));
        }
    }

    /**
     * @see api.Ulti#getStaticItemList()
     */
    @Test
    public void testGetStaticItemList() {
        ItemList il = ulti.getStaticItemList();
        Assert.assertNotNull(il);
    }

    /**
     * @see Ulti#getStaticItem(int)
     */
    @Test
    public void testGetStaticItem() {
        ItemList il = ulti.getStaticItemList();
        Iterator<Item> iter = il.getData().values().iterator();

        while (iter.hasNext()) {
            Item item = iter.next();
            Assert.assertNotNull(ulti.getStaticItem(item.getId()));
        }
    }

    /**
     * @see api.Ulti#getStaticMasteryList()
     */
    @Test
    public void testGetStaticMasteryList() {
        MasteryList ml = ulti.getStaticMasteryList();
        Assert.assertNotNull(ml);
    }

    /**
     * @see Ulti#getStaticMastery(int)
     */
    @Test
    public void testGetStaticMastery() {
        MasteryList ml = ulti.getStaticMasteryList();
        Iterator<Mastery> iter = ml.getData().values().iterator();

        while (iter.hasNext()) {
            Mastery m = iter.next();
            Assert.assertNotNull(ulti.getStaticMastery(m.getId()));
        }
    }

    /**
     * @see api.Ulti#getStaticRealm()
     */
    @Test
    public void testGetStaticRealm() {
        Realm r = ulti.getStaticRealm();
        Assert.assertNotNull(r);
    }

    /**
     * @see api.Ulti#getStaticRuneList()
     */
    @Test
    public void testGetStaticRuneList() {
        RuneList rl = ulti.getStaticRuneList();
        Assert.assertNotNull(rl);
    }

    /**
     * @see Ulti#getStaticRune(int)
     */
    @Test
    public void testGetStaticRune() {
        RuneList rl = ulti.getStaticRuneList();
        Iterator<Rune> iter = rl.getData().values().iterator();

        while (iter.hasNext()) {
            Rune r = iter.next();
            Assert.assertNotNull(ulti.getStaticRune(r.getId()));
        }
    }

    /**
     * @see api.Ulti#getStaticSummonerSpellList()
     */
    @Test
    public void testGetStaticSummonerSpellList() {
        SummonerSpellList ssl = ulti.getStaticSummonerSpellList();
        Assert.assertNotNull(ssl);
    }

    /**
     * @see Ulti#getStaticSummonerSpell(int)
     */
    @Test
    public void testGetStaticSummonerSpell() {
        SummonerSpellList ssl = ulti.getStaticSummonerSpellList();
        Iterator<SummonerSpell> iter = ssl.getData().values().iterator();

        while (iter.hasNext()) {
            SummonerSpell ss = iter.next();
            Assert.assertNotNull(ss.getId());
        }
    }

    /**
     * @see api.Ulti#getStaticVersions()
     */
    @Test
    public void testGetStaticVersions() {
        List<String> v = ulti.getStaticVersions();
        Assert.assertNotNull(v);
    }
}