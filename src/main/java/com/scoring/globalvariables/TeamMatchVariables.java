/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.globalvariables;

import com.scoring.beans.MatchDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AuroLed
 */
public class TeamMatchVariables {
    
    public static String tournamentType, homeTeam, awayTeam, matchCode;
    public static ArrayList<String> teamShortNameList, teamFullNameList;
    public static Map<String, MatchDetails> selectedTeamsObjectMap = new HashMap<>();
    public static Map<String, String> selectedTeamsMap = new HashMap<>();
    
    
}
