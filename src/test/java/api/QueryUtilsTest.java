package api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QueryUtilsTest {

    private List<String> list;
    private List<Long> list2;

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<String>();
        list2 = new ArrayList<Long>();

        for (int i = 0; i < 40; i++) {
            list.add(Integer.toString(i));
        }
    }

    @Test
    public void testIsValid() throws Exception {
        boolean beTrue = QueryUtils.passLengthConstraint(list.toArray(), 40);
        Assert.assertTrue(beTrue);

        // Make it invalid
        list.add("41");
        Assert.assertTrue(list.size() > 40);

        boolean beFalse = QueryUtils.passLengthConstraint(list.toArray(), 40);
        Assert.assertFalse(beFalse);
    }

    @Test
    public void testPrepare() throws Exception {
        String[] strings = new String[]{"a", "    b", "c ", "d     "};

        String asStringList = QueryUtils.prepare(strings);

        Assert.assertEquals(asStringList, "a,b,c,d");

    }

    @Test
    public void testPrepare1() throws Exception {
        Long[] longs = new Long[]{1l, 2l, 3l, 4l};

        String asStringList = QueryUtils.prepare(longs);

        Assert.assertEquals(asStringList, "1,2,3,4");
    }
}