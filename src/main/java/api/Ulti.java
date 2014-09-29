package api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dto.Region;
import dto.champion.Champion;
import dto.champion.ChampionList;
import dto.game.RecentGames;
import dto.league.League;
import dto.match.MatchDetail;
import dto.matchhistory.PlayerHistory;
import dto.stats.PlayerStatsSummaryList;
import dto.stats.RankedStats;
import dto.summoner.MasteryPages;
import dto.summoner.RunePages;
import dto.summoner.Summoner;
import dto.team.Team;

import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static api.QueryUtils.normalize;
import static api.QueryUtils.passLengthConstraint;
import static api.QueryUtils.prepare;

public class Ulti {

    /**
     * Store the latest version of each type of call, update value when new version
     * is released
     */
    private static final Map<String, String> versions = new HashMap<String, String>();
    static {
        versions.put("summoner", "v1.4");
        versions.put("team", "v2.3");
        versions.put("champion", "v1.2");
        versions.put("game", "v1.3");
        versions.put("league", "v2.5");
        versions.put("static", "v1.2");
        versions.put("match", "v2.2");
        versions.put("matchhistory", "v2.2");
        versions.put("stats", "v1.3");
    }

    private final QueryManager api;
    private final Gson gson;

    public Ulti(String apiKey) {
        api = QueryManager.getInstance();
        api.setApiKey(apiKey);

        gson = new Gson();
    }

    public Ulti(String apiKey, Region region) {
        this(apiKey);
        api.setRegion(region);
    }

    /**
     * Sets the limit for the short rate
     *
     * @param requestsPerSecond number of requests allowed per second
     */
    public void setShortRateLimit(int requestsPerSecond) {
        api.setShortRateLimit(requestsPerSecond);
    }

    /**
     * Sets the limit for the long rate.
     *
     * @param requestsPerSecond number of requests allowed per second
     */
    public void setLongRateLimit(int requestsPerSecond) {
        api.setLongRateLimit(requestsPerSecond);
    }

    /**
     * Sets the region to be used for all requests.
     *
     * @param region region to use
     */
    public void setRegion(Region region) {
        api.setEndpoint(region);
    }

    /**
     * Returns all champions currently in the game.
     *
     * @return  championList containing a list of {@link dto.champion.Champion}.
     */
    public ChampionList getChampions() {
        Reader json = api.apiQuery(versions.get("champion") + "/champion");

        return gson.fromJson(json, ChampionList.class);
    }


    /**
     * Searches for a champion by their id.
     *
     * @param   championId id of the champion
     * @return  a {@link dto.champion.Champion} with the specified champion id
     */
    public Champion getChampionById(int championId) {
        Reader json = api.apiQuery(versions.get("champion") + "/champion/" + championId);

        return gson.fromJson(json, Champion.class);
    }

    /**
     * Queries for summoners by their summoner names. A maximum of 40 summoner names can be provided.
     *
     * @param   championNames the names of summoners to lookup
     * @return  a {@link java.util.Map} with keys being the summoner names as a {@link String} and values being
     *          a {@link dto.summoner.Summoner} object
     */
    public Map<String, Summoner> getSummonerByName(String... championNames) {
        if (!passLengthConstraint(championNames, 40)) {
            throw new UltiException(UltiException.Type.INVALID_PARAMETERS);
        }

        Reader json = api.apiQuery(versions.get("summoner") + "/summoner/by-name/" + prepare(championNames));
        Type type = new TypeToken<Map<String, Summoner>>() {}.getType();

        return gson.fromJson(json, type);
    }

    /**
     * Helper function for the {@link #getSummonerByName(String...) getSummonerByName} method when only a single
     * summoner name is supplied.
     *
     * @param   summonerName the name of summoner to lookup
     * @return  a {@link dto.summoner.Summoner} object referring to the summoner name
     */
    public Summoner getSummonerByName(String summonerName) {
        return getSummonerByName(new String[]{summonerName}).get(normalize(summonerName));
    }


    /**
     * Queries for summoners by their summoner IDs. A maximum of 40 summoner IDs can be provided.
     *
     * @param   summonerIds the IDs of the summoners to lookup
     * @return  a {@link java.util.Map} with keys being the summoner IDs as a {@link String} and values being
     *          a {@link dto.summoner.Summoner} object
     */
    public Map<String, Summoner> getSummonerById(Long... summonerIds) {
        if (!passLengthConstraint(summonerIds, 40)) {
            throw new UltiException(UltiException.Type.INVALID_PARAMETERS);
        }

        Reader json = api.apiQuery(versions.get("summoner") + "/summoner/" + prepare(summonerIds));
        Type type = new TypeToken<Map<String, Summoner>>() {}.getType();

        return gson.fromJson(json, type);
    }

    /**
     * Helper function for the {@link #getSummonerById(Long...) getSummonerById} method when only a single
     * summoner ID is supplied.
     *
     * @param   summonerId the ID of the summoner to lookup
     * @return  a {@link dto.summoner.Summoner} object referring to the summoner ID
     */
    public Summoner getSummonerById(Long summonerId) {
        return getSummonerById(new Long[]{summonerId}).get(summonerId.toString());
    }

    /**
     * Queries for all the masteries pages of the given summoners. A maximum of 40 summoner IDs can be provided.
     *
     * @param   summonerIds the IDs of the summoners to lookup
     * @return  a {@link java.util.Map} of {@link dto.summoner.MasteryPages} with summoner ID keys
     *          as a {@link java.lang.String}
     */
    public Map<String, MasteryPages> getMasteriesBySummonerId(Long... summonerIds) {
        if (!passLengthConstraint(summonerIds, 40)) {
            throw new UltiException(UltiException.Type.INVALID_PARAMETERS);
        }

        Reader json = api.apiQuery(versions.get("summoner") + "/summoner/" + prepare(summonerIds) + "/masteries");
        Type type = new TypeToken<Map<String, MasteryPages>>() {}.getType();

        return gson.fromJson(json, type);
    }

    /**
     * Helper function for the {@link #getMasteriesBySummonerId(Long...) getMasteriesBySummonerId} method when
     * only a single summoner ID is supplied.
     *
     * @param   summonerId the ID of the summoner to lookup
     * @return  a {@link dto.summoner.MasteryPages} object with the masteries of the summoner
     */
    public MasteryPages getMasteriesBySummonerId(Long summonerId) {
        return getMasteriesBySummonerId(new Long[]{summonerId}).get(summonerId.toString());
    }

    /**
     * Queries for a summoners name by their ID.
     *
     * @param   summonerIds the ID of the summoner to lookup
     * @return  a {@link java.util.Map} of summoner names as a {@link java.lang.String} with their summoner ID
     *          as the key
     */
    public Map<String, String> getSummonerNameById(Long... summonerIds) {
        Reader json = api.apiQuery(versions.get("summoner") + "/summoner/" + prepare(summonerIds) + "/name");
        Type type = new TypeToken<Map<String, String>>() {}.getType();

        return gson.fromJson(json, type);
    }

    /**
     * Helper function for the {@link #getSummonerNameById(Long...) getSummonerNameById} method when only a
     * single summoner ID is provided
     *
     * @param   summonerId the ID of the summoner to lookup
     * @return  the summoners name as a {@link java.lang.String}
     */
    public String getSummonerNameById(Long summonerId) {
        return getSummonerNameById(new Long[]{summonerId}).get(summonerId.toString());
    }

    /**
     * Queries for all the rune pages of the given summoner IDs. A maximum of 40 summoner IDs can be provided.
     *
     * @param   ids the ID of the summoners to lookup
     * @return  a {@link java.util.Map} of {@link dto.summoner.RunePages} with summoner ID keys
     *          as a {@link java.lang.String}
     */
    public Map<String, RunePages> getRunePagesBySummonerId(Long... ids) {
        if (!passLengthConstraint(ids, 40)) {
            throw new UltiException(UltiException.Type.INVALID_PARAMETERS);
        }

        Reader json = api.apiQuery(versions.get("summoner") + "/summoner/" + prepare(ids) + "/runes");
        Type type = new TypeToken<Map<String, RunePages>>() {}.getType();

        return gson.fromJson(json, type);
    }

    /**
     * Helper function for the {@link #getRunePagesBySummonerId(Long...) getRunePagesBySummonerId} method when
     * only a single summoner ID is supplied.
     *
     * @param   summonerId the ID of the summoner to lookup
     * @return  a {@link dto.summoner.RunePages} object with the rune pages of the summoner
     */
    public RunePages getRunePagesBySummonerId(Long summonerId) {
        return getRunePagesBySummonerId(new Long[]{summonerId}).get(summonerId.toString());
    }


    /**
     * Queries for the teams of each summoner provided. A maximum of 40 summoner IDs can be provided.
     *
     * @param   summonerIds the IDs of the summoners to lookup
     * @return  a {@link java.util.Map} containing a {@link java.util.List} of every {@link dto.team.Team} the
     *          summoner is part of, with the key being the summoner ID as a {@link String}
     */
    public Map<String, List<Team>> getTeamBySummonerId(Long... summonerIds) {
        if (!passLengthConstraint(summonerIds, 40)) {
            throw new UltiException(UltiException.Type.INVALID_PARAMETERS);
        }

        Reader json = api.apiQuery(versions.get("team") + "/team/by-summoner/" + prepare(summonerIds));
        Type type = new TypeToken<Map<String, List<Team>>>() {}.getType();

        return gson.fromJson(json, type);
    }

    /**
     * Helper function for the {@link #getTeamBySummonerId(Long...) getTeamBySummonerId} method when only a
     * single summoner ID is provided.
     *
     * @param   summonerId the ID of the summoner to lookup
     * @return  a {@link java.util.List} of every {@link dto.team.Team} the summoner is part of.
     */
    public List<Team> getTeamBySummonerId(Long summonerId) {
        return getTeamBySummonerId(new Long[]{summonerId}).get(summonerId.toString());
    }

    /**
     * Queries for the team by the teams ID. A maximum of 40 team IDs can be provided.
     *
     * @param   teamIds the IDs of the teams to lookup
     * @return  a {@link java.util.Map} containing each a {@link dto.team.Team} object corresponding to each
     *          team ID provided.
     */
    public Map<String, Team> getTeamById(String... teamIds) {
        if (!passLengthConstraint(teamIds, 40)) {
            throw new UltiException(UltiException.Type.INVALID_PARAMETERS);
        }

        Reader json = api.apiQuery(versions.get("team") + "/team/" + prepare(teamIds, false));
        Type type = new TypeToken<Map<String, Team>>() {
        }.getType();

        return gson.fromJson(json, type);
    }

    /**
     * Helper function for the {@link #getTeamById(String...) getTeamById} method when only a single team
     * ID is provided.
     *
     * @param   teamId the ID of the team to lookup
     * @return  a {@link dto.team.Team} corresponding to the team ID.
     */
    public Team getTeamById(String teamId) {
        return getTeamById(new String[]{teamId}).get(teamId.toString());
    }

    /**
     * Queries for the recent games of the summoner by their ID.
     *
     * @param       summonerId the ID of the summoner to lookup
     * @return      a {@link dto.game.RecentGames} object containing the 10 most recent games of the summoner.
     * @deprecated  with the introduction of the MatchHistory and Match APIs, this has been deprecated and
     *              will be shut off at some point. Please use the provided MatchHistory and Match APIs which
     *              both provided a greater amount of detail.
     */
    @Deprecated
    public RecentGames getRecentGames(Long summonerId) {
        Reader json = api.apiQuery(versions.get("game") + "/game/by-summoner/" + summonerId + "/recent");

        return gson.fromJson(json, RecentGames.class);
    }

    /**
     * Queries for the leagues of each summoner ID provided. A maximum of 10 summoner IDs can be provided.
     *
     * @param   summonerIds the IDs of the summoners to lookup
     * @return  a {@link java.util.Map} containing a {@link java.util.List} of each {@link dto.league.League}
     *          the summoner is a part of
     */
    public Map<String, List<League>> getLeagueBySummonerId(Long... summonerIds) {
        if (!passLengthConstraint(summonerIds, 10)) {
            throw new UltiException(UltiException.Type.INVALID_PARAMETERS);
        }

        Reader json = api.apiQuery(versions.get("league") + "/league/by-summoner/" + prepare(summonerIds));
        Type type = new TypeToken<Map<String, List<League>>>() {}.getType();

        return gson.fromJson(json, type);
    }

    /**
     * Helper function for the {@link #getLeagueBySummonerId(Long...) getLeagueBySummonerId} method when only a
     * single summoner ID is provided.
     *
     * @param   summonerId the ID of the summoner to lookup
     * @return  a {@link java.util.List} of each {@link dto.league.League} the summoner is a part of
     */
    public List<League> getLeagueBySummonerId(Long summonerId) {
        return getLeagueBySummonerId(new Long[]{summonerId}).get(summonerId.toString());
    }

    /**
     * Queries for the league entries of the provided summoner IDs. A maximum of 10 summoner IDs can be provided.
     *
     * @param   summonerIds the IDs of the summoners to lookup
     * @return  a {@link java.util.Map} of each {@link dto.league.League} the summoner is a part of, only containing
     *          a {@link dto.league.LeagueEntry} for the summoner
     */
    public Map<String, List<League>> getLeagueEntryBySummonerId(Long... summonerIds) {
        if (!passLengthConstraint(summonerIds, 10)) {
            throw new UltiException(UltiException.Type.INVALID_PARAMETERS);
        }

        Reader json = api.apiQuery(versions.get("league") + "/league/by-summoner/" + prepare(summonerIds) + "/entry");
        Type type = new TypeToken<Map<String, List<League>>>() {}.getType();

        return gson.fromJson(json, type);
    }

    /**
     * Helper function for the {@link #getLeagueEntryBySummonerId(Long...) getLeagueEntryBySummonerId} method when
     * only a single summoner ID is provided.
     *
     * @param   summonerId the ID of the summoner to lookup
     * @return  a {@link java.util.List} of each {@link dto.league.League} the summoner is a part of, only containing
     *          a {@link dto.league.LeagueEntry} for the summoner
     */
    public List<League> getLeagueEntryBySummonerId(Long summonerId) {
        return getLeagueEntryBySummonerId(new Long[]{summonerId}).get(summonerId.toString());
    }

    /**
     * Queries for leagues of each team ID provided. A maximum of 10 team IDs can be provided.
     *
     * @param   teamIds the IDs of the teams to lookup
     * @return  a {@link java.util.Map} containing a {@link java.util.List} of each {@link dto.league.League}
     *          the team is a part of (3v3 and 5v5 leagues). The {@link dto.league.League} object contains a
     *          {@link dto.league.LeagueEntry} for each summoner in the respective league.
     */
    public Map<String, List<League>> getTeamLeagueById(String... teamIds) {
        if (!passLengthConstraint(teamIds, 10)) {
            throw new UltiException(UltiException.Type.INVALID_PARAMETERS);
        }

        Reader json = api.apiQuery(versions.get("league") + "/league/by-team/" + prepare(teamIds, false));
        Type type = new TypeToken<Map<String, List<League>>>() {}.getType();

        return gson.fromJson(json, type);
    }

    /**
     * Helper function for the {@link #getTeamLeagueById(String...) getTeamLeagueById} method when only a single
     * team ID is provided.
     *
     * @param   teamId the ID of the team to lookup
     * @return  a {@link java.util.List} of each {@link dto.league.League} the team is a part of (3v3 and
     *          5v5 leagues).
     */
    public List<League> getTeamLeagueById(String teamId) {
        return getTeamLeagueById(new String[] {teamId}).get(teamId);
    }

    /**
     * Queries for the league entries of the team IDs. A maximum of 10 team IDs can be provided.
     *
     * @param   teamIds the IDs of the teams to lookup
     * @return  a {@link java.util.Map} containing a {@link java.util.List} of each {@link dto.league.League}
     *          the team is a part of (3v3 and 5v5 leagues). The {@link dto.league.League} object only contains
     *          a {@link dto.league.LeagueEntry} for the given team IDs.
     */
    public Map<String, List<League>> getTeamLeagueEntryById(String... teamIds) {
        if (!passLengthConstraint(teamIds, 10)) {
            throw new UltiException(UltiException.Type.INVALID_PARAMETERS);
        }

        Reader json = api.apiQuery(versions.get("league") + "/league/by-team/" + prepare(teamIds, false) + "/entry");
        Type type = new TypeToken<Map<String, List<League>>>() {}.getType();

        return gson.fromJson(json, type);
    }

    /**
     * Helper function for the {@link #getTeamLeagueEntryById(String...) getTeamLeagueEntryById} method when only
     * a single team ID is provided.
     *
     * @param   teamId the ID of the team to lookup
     * @return  a {@link java.util.List} of each {@link dto.league.League} the team is a part of (3v3 and 5v5
     *          leagues). The {@link dto.league.League} object only contains a {@link dto.league.LeagueEntry}
     *          for the given team ID.
     */
    public List<League> getTeamLeagueEntryById(String teamId) {
        return getTeamLeagueEntryById(new String[] {teamId}).get(teamId);
    }

    /**
     * Queries for all the summoners currently in the Challenger league.
     *
     * @return  a {@link dto.league.League} object containing a {@link dto.league.LeagueEntry} for each summoner
     *          currently in Challenger
     */
    public League getChallengers() {
        Reader json = api.apiQuery(versions.get("league") + "/league/challenger");

        return gson.fromJson(json, League.class);
    }

    /**
     * Queries for the ranked stats for the given summoner.
     *
     * @param   summonerId the ID of the summoner to lookup
     * @return  a {@link dto.stats.RankedStats} object containing all the stats for this summoner in ranked play
     */
    public RankedStats getRankedStatsBySummonerId(Long summonerId) {
        Reader json = api.apiQuery(versions.get("stats") + "/stats/by-summoner/" + summonerId + "/ranked");

        return gson.fromJson(json, RankedStats.class);
    }

    /**
     * Queries for the summary of the summoners stats.
     *
     * @param   summonerId the ID of the summoner to lookup
     * @return  a {@link dto.stats.PlayerStatsSummaryList} object containing a summary of all the stats for
     *          this summoner
     */
    public PlayerStatsSummaryList getStatsSummaryBySummonerId(Long summonerId) {
        Reader json = api.apiQuery(versions.get("stats") + "/stats/by-summoner/" + summonerId + "/summary");

        return gson.fromJson(json, PlayerStatsSummaryList.class);
    }

    /**
     * Queries for a match by its ID.
     *
     * @param   matchId the ID of the match to lookup
     * @return  a {@link dto.match.MatchDetail} object containing detailed information for the given match
     */
    public MatchDetail getMatchById(Long matchId) {
        Reader json = api.apiQuery(versions.get("match") + "/match/" + matchId);

        return gson.fromJson(json, MatchDetail.class);
    }

    /**
     * Queries for the match history of the summoner.
     *
     * @param   summonerId the ID of the summoner to lookup
     * @return  a {@link dto.matchhistory.PlayerHistory} object containing all of the summoners match history
     */
    public PlayerHistory getMatchHistoryBySummonerId(Long summonerId) {
        Reader json = api.apiQuery(versions.get("matchhistory") + "/matchhistory/" + summonerId);

        return gson.fromJson(json, PlayerHistory.class);
    }
}
