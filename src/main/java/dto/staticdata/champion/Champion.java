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

package dto.staticdata.champion;

import dto.staticdata.Image;
import dto.staticdata.Info;
import dto.staticdata.Passive;
import dto.staticdata.Recommended;
import dto.staticdata.Skin;
import dto.staticdata.Stats;

import java.util.List;

public class Champion {

    private List<String> allytips;
    private String blurb;
    private List<String> enemytips;
    private int id;
    private Image image;
    private Info info;
    private String key;
    private String lore;
    private String name;
    private String partype;
    private Passive passive;
    private List<Recommended> recommended;
    private List<Skin> skins;
    private List<ChampionSpell> spells;
    private Stats stats;
    private List<String> tags;
    private String title;

    public List<String> getAllytips() {
        return allytips;
    }

    public String getBlurb() {
        return blurb;
    }

    public List<String> getEnemytips() {
        return enemytips;
    }

    public int getId() {
        return id;
    }

    public Image getImage() {
        return image;
    }

    public Info getInfo() {
        return info;
    }

    public String getKey() {
        return key;
    }

    public String getLore() {
        return lore;
    }

    public String getName() {
        return name;
    }

    public String getPartype() {
        return partype;
    }

    public Passive getPassive() {
        return passive;
    }

    public List<Recommended> getRecommended() {
        return recommended;
    }

    public List<Skin> getSkins() {
        return skins;
    }

    public List<ChampionSpell> getSpells() {
        return spells;
    }

    public Stats getStats() {
        return stats;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getTitle() {
        return title;
    }
}
