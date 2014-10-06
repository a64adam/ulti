package dto.staticdata.summonerspell;

import dto.staticdata.Image;
import dto.staticdata.LevelTip;
import dto.staticdata.SpellVars;

import java.util.List;

public class SummonerSpell {

    private List<Double> cooldown;
    private String cooldownBurn;
    private List<Integer> cost;
    private String costBurn;
    private String costType;
    private String description;
    private List<List<Double>> effect;
    private List<String> effectBurn;
    private int id;
    private Image image;
    private String key;
    private LevelTip leveltip;
    private int maxrank;
    private List<String> modes;
    private String name;
    private Object range;
    private String rangeBurn;
    private String resource;
    private String sanitizedDescription;
    private String sanitizedTooltip;
    private int summonerLevel;
    private String tooltip;
    private List<SpellVars> vars;

    public List<Double> getCooldown() {
        return cooldown;
    }

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public String getCostType() {
        return costType;
    }

    public String getDescription() {
        return description;
    }

    public List<List<Double>> getEffect() {
        return effect;
    }

    public List<String> getEffectBurn() {
        return effectBurn;
    }

    public int getId() {
        return id;
    }

    public Image getImage() {
        return image;
    }

    public String getKey() {
        return key;
    }

    public LevelTip getLeveltip() {
        return leveltip;
    }

    public int getMaxrank() {
        return maxrank;
    }

    public List<String> getModes() {
        return modes;
    }

    public String getName() {
        return name;
    }

    /**
     * @return  either a {@link java.util.List} of {@link java.lang.Integer}, or a {@link java.lang.String} containing
     *          'self' for spells that target one's own champion
     */
    public Object getRange() {
        return range;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public String getResource() {
        return resource;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public String getSanitizedTooltip() {
        return sanitizedTooltip;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public String getTooltip() {
        return tooltip;
    }

    public List<SpellVars> getVars() {
        return vars;
    }
}
