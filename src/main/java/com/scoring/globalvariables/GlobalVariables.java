/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.globalvariables;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author AuroLed
 */
public class GlobalVariables {
    
    public static ArrayList<String> torunamentTypes = new ArrayList<String>(){{
        add("IPL");
        add("T20 World Cup");
        add("World Cup");
        add("Asia Cup");
        add("Womens Premier League (WPL)");
    }};
   
    
    public static String selecteLeagueType;
    
    public static JFrame mainScoringForm = new JFrame();
    public static String tossOwnTeam, firstInningsBattingTeam, firstInningsBowlingTeam, tossOwnTeamDecision;
    
}