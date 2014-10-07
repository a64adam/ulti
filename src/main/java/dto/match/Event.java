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

package dto.match;

import java.util.List;

public class Event {

    private String ascendedType;
    private List<Integer> assistingParticipantIds;
    private String buildingType;
    private int creatorId;
    private String eventType;
    private int itemAfter;
    private int itemBefore;
    private int itemId;
    private int killerId;
    private String laneType;
    private String levelUpType;
    private String monsterType;
    private int participantId;
    private String pointCaptured;
    private Position position;
    private int skillSlot;
    private int teamId;
    private long timestamp;
    private String towerType;
    private int victimId;
    private String wardType;

    /**
     * Legal values: CHAMPION_ASCENDED, CLEAR_ASCENDED, MINION_ASCENDED
     * Note that CLEAR_ASCENDED refers to when a participant kills the ascended player.
     *
     * @return  a {@link java.lang.String} representing the ascended type. Only present if relevant
     */
    public String getAscendedType() {
        return ascendedType;
    }

    /**
     * @return  a {@link java.util.List} of participant IDs of the event. Only present if relevant
     */
    public List<Integer> getAssistingParticipantIds() {
        return assistingParticipantIds;
    }

    /**
     * Legal values: INHIBITOR_BUILDING, TOWER_BUILDING
     *
     * @return  a {@link java.lang.String} representing the building type. Only present if relevant
     */
    public String getBuildingType() {
        return buildingType;
    }

    /**
     * @return  the creator ID of the event. Only present if relevant
     */
    public int getCreatorId() {
        return creatorId;
    }

    /**
     * Legal values: ASCENDED_EVENT, BUILDING_KILL, CAPTURE_POINT, CHAMPION_KILL, ELITE_MONSTER_KILL, ITEM_DESTROYED,
     * ITEM_PURCHASED, ITEM_SOLD, ITEM_UNDO, SKILL_LEVEL_UP, WARD_KILL, WARD_PLACED
     *
     * @return  a {@link java.lang.String} representing the event type
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @return  the ending item ID of the event. Only present if relevant
     */
    public int getItemAfter() {
        return itemAfter;
    }

    /**
     * @return  the starting item ID of the event. Only present if relevant
     */
    public int getItemBefore() {
        return itemBefore;
    }

    /**
     *
     * @return  the item ID of the event. Only present if relevant
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * @return  the killer ID of the event. Only present if relevant
     */
    public int getKillerId() {
        return killerId;
    }

    /**
     * Legal values: BOT_LANE, MID_LANE, TOP_LANE
     *
     * @return  {@link java.lang.String} representing the lane type of the event. Only present if relevant
     */
    public String getLaneType() {
        return laneType;
    }

    /**
     * Legal values: EVOLVE, NORMAL
     *
     * @return  a {@link java.lang.String} representing the level up type of the event. Only present if relevant
     */
    public String getLevelUpType() {
        return levelUpType;
    }

    /**
     * Legal values: BARON_NASHOR, BLUE_GOLEM, DRAGON, RED_LIZARD, VILEMAW
     *
     * @return  a {@link java.lang.String} representing the monster type of the event. Only present if relevant
     */
    public String getMonsterType() {
        return monsterType;
    }

    /**
     * @return  the participant ID of the event. Only present if relevant
     */
    public int getParticipantId() {
        return participantId;
    }

    /**
     * Legal values: POINT_A, POINT_B, POINT_C, POINT_D, POINT_E
     *
     * @return  a {@link java.lang.String} representing the point captured in the event. Only present if relevant
     */
    public String getPointCaptured() {
        return pointCaptured;
    }

    /**
     * @return  a {@link dto.match.Position} object with the position of the event. Only present if relevant
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @return  the skill slot of the event. Only present if relevant
     */
    public int getSkillSlot() {
        return skillSlot;
    }

    /**
     * @return  the team ID of the event. Only present if relevant
     */
    public int getTeamId() {
        return teamId;
    }

    /**
     * Represents how many milliseconds into the game the event occurred
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Legal values: BASE_TURRET, FOUNTAIN_TURRET, INNER_TURRET, NEXUS_TURRET, OUTER_TURRET, UNDEFINED_TURRET
     *
     * @return  a {@link java.lang.String} representing the tower type of the event. Only present if relevant
     */
    public String getTowerType() {
        return towerType;
    }

    /**
     * @return  the victim ID of the event. Only present if relevant
     */
    public int getVictimId() {
        return victimId;
    }

    /**
     * Legal values: SIGHT_WARD, TEEMO_MUSHROOM, UNDEFINED, VISION_WARD, YELLOW_TRINKET, YELLOW_TRINKET_UPGRADE
     *
     * @return  a {@link java.lang.String} representing the ward type of the event. Only present if relevant
     */
    public String getWardType() {
        return wardType;
    }
}
