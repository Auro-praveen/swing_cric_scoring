/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.globalvariables;

import com.scoring.beans.CurrentMatchPlayers;
import com.scoring.beans.MatchDetails;
import com.scoring.beans.PlayersBean;
import com.scoring.reference.bean.BothTeamPlayers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AuroLed
 *
 */
public class TeamMatchVariables {

    public static String tournamentType, homeTeam, awayTeam, matchCode, homeTeamShortName, awayTeamShortName;

    public static String homeTeamCaptain = null,
            homeTeamWicketKeeper = null,
            awayTeamCaptain = null,
            awayTeamWicketKeeper = null;

    public static ArrayList<String> teamShortNameList, teamFullNameList;

    // key is match code, just keep it 
//    public static Map<String, MatchDetails> selectedTeamsObjectMap = new HashMap<>();
    
    public static MatchDetails currentMatchDetails = new MatchDetails();

    // parameter for shortName = teamShortName AND for the team id = teamId
    public static Map<String, Map<String, Object>> selectedTeamsMap = new HashMap<>();

    public static Map<String, ArrayList<PlayersBean>> bothTeamPlayersGlobalMap = new HashMap<>();

    // selected Current matach players bean for the match
    // key vairable will be home team fullname and awayTeam Full name
    public static Map<String, ArrayList<CurrentMatchPlayers>> selectedPlayersMap = new HashMap<>();

    // selected Players from both the team and key will be the team full name  selected Players from both the team
    public static Map<String, ArrayList<String>> selectedPlayersIntoMap = new HashMap<>();
    
    // selected players from both the team for shortName key is teamFullName and valueList is ArrayList of shortname of selected players
    public static Map<String, ArrayList<String>> selectedPlayersShortNameIntoMap = new HashMap<>();
    
    // key is stadium name and value is city in which the stadium is located
    public static Map<String, String> stadiumsMap = new HashMap<>();

    public static int homeTeamId, awayTeamId;
}
