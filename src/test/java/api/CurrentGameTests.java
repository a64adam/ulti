package api;

import dto.currentgame.CurrentGameInfo;
import dto.currentgame.FeaturedGames;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CurrentGameTests {

    private static Ulti ulti;

    private static long summonerId;

    @BeforeClass
    public static void setUp() throws Exception {
        ulti = new Ulti("");
        ulti.setShortRateLimit(0.9);
        summonerId = 23287684l;
    }

    @Test
    public void testGetCurrentGameInfo() {
        CurrentGameInfo currentGameInfo = ulti.getCurrentGameInfo(summonerId);
        Assert.assertNotNull(currentGameInfo);
    }

    @Test
    public void testGetFeaturedGames() {
        FeaturedGames featuredGames = ulti.getFeaturedGames();
        Assert.assertNotNull(featuredGames);
    }
}
