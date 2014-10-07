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