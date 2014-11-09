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

import dto.staticdata.champion.ChampData;
import dto.staticdata.champion.Champion;
import dto.staticdata.champion.ChampionList;
import dto.staticdata.champion.ChampionQueryParams;
import dto.staticdata.item.Item;
import dto.staticdata.item.ItemList;
import dto.staticdata.item.ItemListData;
import dto.staticdata.item.ItemQueryParams;
import dto.staticdata.mastery.Mastery;
import dto.staticdata.mastery.MasteryList;
import dto.staticdata.mastery.MasteryListData;
import dto.staticdata.mastery.MasteryQueryParams;
import dto.staticdata.realm.Realm;
import dto.staticdata.rune.Rune;
import dto.staticdata.rune.RuneList;
import dto.staticdata.rune.RuneListData;
import dto.staticdata.rune.RuneQueryParams;
import dto.staticdata.summonerspell.SpellData;
import dto.staticdata.summonerspell.SummonerSpell;
import dto.staticdata.summonerspell.SummonerSpellList;
import dto.staticdata.summonerspell.SummonerSpellQueryParams;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class StaticAPITests {

    private static final String TEST_LOCALE = "en_US";
    private static final String TEST_VERSION = "4.19.2";

    private static Ulti ulti;

    @BeforeClass
    public static void setUp() throws Exception {
        ulti = new Ulti("db012a8a-e9c0-413d-9c97-9dffe07a91c5");
    }

    /**
     * @see api.Ulti#getStaticChampionList()
     */
    @Test
    public void testGetStaticChampionList() {
        ChampionList championList = ulti.getStaticChampionList();
        Assert.assertNotNull(championList);
    }

    /**
     * @see Ulti#getStaticChampionList(dto.staticdata.champion.ChampionQueryParams)
     */
    @Test
    public void testGetStaticChampionListWithParams() {
        ChampionQueryParams params = new ChampionQueryParams.Builder()
                .locale(TEST_LOCALE)
                .version(TEST_VERSION)
                .dateById(true)
                .champData(ChampData.ALL)
                .build();

        ChampionList championList = ulti.getStaticChampionList(params);
        Assert.assertNotNull(championList);
    }

    /**
     * @see Ulti#getStaticChampion(int)
     */
    @Test
    public void testGetStaticChampion() {
        ChampionList championList = ulti.getStaticChampionList();
        Iterator<Champion> iterator = championList.getData().values().iterator();

        while (iterator.hasNext()) {
            Champion champion = iterator.next();
            Assert.assertNotNull(ulti.getStaticChampion(champion.getId()));
        }
    }

    /**
     * @see api.Ulti#getStaticChampion(int, dto.staticdata.champion.ChampionQueryParams)
     */
    @Test
    public void testGetStaticChampionWithParams() {
        ChampionList championList = ulti.getStaticChampionList();
        Iterator<Champion> iterator = championList.getData().values().iterator();

        ChampionQueryParams params = new ChampionQueryParams.Builder()
                .locale(TEST_LOCALE)
                .version(TEST_VERSION)
                .champData(ChampData.ALLYTIPS, ChampData.ENEMYTIPS)
                .build();

        while (iterator.hasNext()) {
            Champion champion = iterator.next();
            Assert.assertNotNull(ulti.getStaticChampion(champion.getId(), params));
        }
    }

    /**
     * @see api.Ulti#getStaticItemList()
     */
    @Test
    public void testGetStaticItemList() {
        ItemList itemList = ulti.getStaticItemList();
        Assert.assertNotNull(itemList);
    }

    /**
     * @see api.Ulti#getStaticItemList(dto.staticdata.item.ItemQueryParams)
     */
    @Test
    public void testGetStaticItemListWithParams() {
        ItemQueryParams itemQueryParams = new ItemQueryParams.Builder()
                .locale(TEST_LOCALE)
                .version(TEST_VERSION)
                .itemListData(ItemListData.ALL)
                .build();

        ItemList itemList = ulti.getStaticItemList(itemQueryParams);
        Assert.assertNotNull(itemList);
    }

    /**
     * @see Ulti#getStaticItem(int)
     */
    @Test
    public void testGetStaticItem() {
        ItemList itemList = ulti.getStaticItemList();
        Iterator<Item> iterator = itemList.getData().values().iterator();

        while (iterator.hasNext()) {
            Item item = iterator.next();
            Assert.assertNotNull(ulti.getStaticItem(item.getId()));
        }
    }

    /**
     * @see api.Ulti#getStaticItem(int, dto.staticdata.item.ItemQueryParams)
     */
    @Test
    public void testGetStaticItemWithParams() {
        ItemList itemList = ulti.getStaticItemList();
        Iterator<Item> iterator = itemList.getData().values().iterator();

        ItemQueryParams itemQueryParams = new ItemQueryParams.Builder()
                .locale(TEST_LOCALE)
                .version(TEST_VERSION)
                .itemListData(ItemListData.COLLOQ, ItemListData.CONSUME_ON_FULL)
                .build();

        while (iterator.hasNext()) {
            Item item = iterator.next();
            Assert.assertNotNull(ulti.getStaticItem(item.getId(), itemQueryParams));
        }
    }

    /**
     * @see api.Ulti#getStaticMasteryList()
     */
    @Test
    public void testGetStaticMasteryList() {
        MasteryList masteryList = ulti.getStaticMasteryList();
        Assert.assertNotNull(masteryList);
    }

    /**
     * @see api.Ulti#getStaticMasteryList(dto.staticdata.mastery.MasteryQueryParams
     */
    @Test
    public void testGetStaticMasteryListWithParams() {
        MasteryQueryParams masteryQueryParams = new MasteryQueryParams.Builder()
                .locale(TEST_LOCALE)
                .version(TEST_VERSION)
                .masteryListData(MasteryListData.ALL)
                .build();

        MasteryList masteryList = ulti.getStaticMasteryList(masteryQueryParams);
        Assert.assertNotNull(masteryList);
    }

    /**
     * @see Ulti#getStaticMastery(int)
     */
    @Test
    public void testGetStaticMastery() {
        MasteryList masteryList = ulti.getStaticMasteryList();
        Iterator<Mastery> iterator = masteryList.getData().values().iterator();

        while (iterator.hasNext()) {
            Mastery mastery = iterator.next();
            Assert.assertNotNull(ulti.getStaticMastery(mastery.getId()));
        }
    }

    /**
     * @see api.Ulti#getStaticMastery(int, dto.staticdata.mastery.MasteryQueryParams)
     */
    @Test
    public void testGetStaticMasteryWithParams() {
        MasteryList masteryList = ulti.getStaticMasteryList();
        Iterator<Mastery> iterator = masteryList.getData().values().iterator();

        MasteryQueryParams masteryQueryParams = new MasteryQueryParams.Builder()
                .locale(TEST_LOCALE)
                .version(TEST_VERSION)
                .masteryListData(MasteryListData.IMAGE, MasteryListData.SANITIZED_DESCRIPTION)
                .build();

        while (iterator.hasNext()) {
            Mastery mastery = iterator.next();
            Assert.assertNotNull(ulti.getStaticMastery(mastery.getId(), masteryQueryParams));
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
        RuneList runeList = ulti.getStaticRuneList();
        Assert.assertNotNull(runeList);
    }

    /**
     * @see api.Ulti#getStaticRuneList(dto.staticdata.rune.RuneQueryParams)
     */
    @Test
    public void testGetStaticRuneListWithParams() {
        RuneQueryParams runeQueryParams = new RuneQueryParams.Builder()
                .locale(TEST_LOCALE)
                .version(TEST_VERSION)
                .runeListData(RuneListData.ALL)
                .build();

        RuneList runeList = ulti.getStaticRuneList(runeQueryParams);
        Assert.assertNotNull(runeList);
    }

    /**
     * @see Ulti#getStaticRune(int)
     */
    @Test
    public void testGetStaticRune() {
        RuneList runeList = ulti.getStaticRuneList();
        Iterator<Rune> iterator = runeList.getData().values().iterator();

        while (iterator.hasNext()) {
            Rune rune = iterator.next();
            Assert.assertNotNull(ulti.getStaticRune(rune.getId()));
        }
    }

    /**
     * @see api.Ulti#getStaticRune(int, dto.staticdata.rune.RuneQueryParams)
     */
    @Test
    public void testGetStaticRuneWithParams() {
        RuneList runeList = ulti.getStaticRuneList();
        Iterator<Rune> iterator = runeList.getData().values().iterator();

        RuneQueryParams runeQueryParams = new RuneQueryParams.Builder()
                .locale(TEST_LOCALE)
                .version(TEST_VERSION)
                .runeListData(RuneListData.HIDE_FROM_ALL, RuneListData.GOLD)
                .build();

        while (iterator.hasNext()) {
            Rune rune = iterator.next();
            Assert.assertNotNull(ulti.getStaticRune(rune.getId(), runeQueryParams));
        }
    }

    /**
     * @see api.Ulti#getStaticSummonerSpellList()
     */
    @Test
    public void testGetStaticSummonerSpellList() {
        SummonerSpellList summonerSpellList = ulti.getStaticSummonerSpellList();
        Assert.assertNotNull(summonerSpellList);
    }

    /**
     * @see api.Ulti#getStaticSummonerSpellList(dto.staticdata.summonerspell.SummonerSpellQueryParams)
     */
    @Test
    public void testGetStaticSummonerSpellListWithParams() {
        SummonerSpellQueryParams summonerSpellQueryParams = new SummonerSpellQueryParams.Builder()
                .locale(TEST_LOCALE)
                .version(TEST_VERSION)
                .spellData(SpellData.ALL)
                .build();

        SummonerSpellList summonerSpellList = ulti.getStaticSummonerSpellList(summonerSpellQueryParams);
        Assert.assertNotNull(summonerSpellList);
    }

    /**
     * @see Ulti#getStaticSummonerSpell(int)
     */
    @Test
    public void testGetStaticSummonerSpell() {
        SummonerSpellList summonerSpellList = ulti.getStaticSummonerSpellList();
        Iterator<SummonerSpell> iterator = summonerSpellList.getData().values().iterator();

        while (iterator.hasNext()) {
            SummonerSpell summonerSpell = iterator.next();
            Assert.assertNotNull(ulti.getStaticSummonerSpell(summonerSpell.getId()));
        }
    }

    /**
     * @see api.Ulti#getStaticSummonerSpell(int, dto.staticdata.summonerspell.SummonerSpellQueryParams)
     */
    @Test
    public void testGetStaticSummonerSpellWithParams() {
        SummonerSpellList summonerSpellList = ulti.getStaticSummonerSpellList();
        Iterator<SummonerSpell> iterator = summonerSpellList.getData().values().iterator();

        SummonerSpellQueryParams summonerSpellQueryParams = new SummonerSpellQueryParams.Builder()
                .locale(TEST_LOCALE)
                .version(TEST_VERSION)
                .spellData(SpellData.COOLDOWN_BURN, SpellData.COST_BURN, SpellData.EFFECT_BURN)
                .build();

        while (iterator.hasNext()) {
            SummonerSpell summonerSpell = iterator.next();
            Assert.assertNotNull(ulti.getStaticSummonerSpell(summonerSpell.getId(), summonerSpellQueryParams));
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
