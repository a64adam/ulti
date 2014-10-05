package dto.league;

/**
 * Queue type enum used for queries to the League API
 *
 * Currently only used by {@link api.Ulti#getChallengers(QueueType)} getCallengers}
 */
public enum QueueType {
    RANKED_SOLO_5x5,
    RANKED_TEAM_5x5,
    RANKED_TEAM_3x3,
}
