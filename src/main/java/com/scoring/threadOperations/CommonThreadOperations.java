/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.threadOperations;

import com.scoring.beans.CurrentMatchPlayers;
import com.scoring.globalvariables.TeamMatchVariables;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author AuroLed
 */
public class CommonThreadOperations extends Thread {

    public String condition;
    public Map<String, ArrayList<CurrentMatchPlayers>> selectedPlayersMapList = new HashMap<>();

    @Override
    public void run() {
//        super.run(); //To change body of generated methods, choose Tools | Templates.

        switch (condition) {
            case "ADD_PLAYERS_SHORTLIST":
                addSelectedPlayersShortNameToList();
                break;
        }

    }

    public void addSelectedPlayersShortNameToList() {

        ArrayList<String> homeTeamPlayerShortName = new ArrayList<>();
        ArrayList<String> awayTeamPlayersShortName = new ArrayList<>();

        for (Map.Entry<String, ArrayList<CurrentMatchPlayers>> entry : selectedPlayersMapList.entrySet()) {

            if (entry.getKey().equals(TeamMatchVariables.homeTeam)) {

                ArrayList<CurrentMatchPlayers> currentMatchPlayersList = entry.getValue();

                for (CurrentMatchPlayers currentMatchPlayers : currentMatchPlayersList) {
                    homeTeamPlayerShortName.add(currentMatchPlayers.getPlayer_name());
                }

//                homeTeamPlayerShortName.add(); 
            } else if (entry.getKey().equals(TeamMatchVariables.awayTeam)) {
                ArrayList<CurrentMatchPlayers> currentMatchPlayersList = entry.getValue();

                for (CurrentMatchPlayers currentMatchPlayers : currentMatchPlayersList) {
                    awayTeamPlayersShortName.add(currentMatchPlayers.getPlayer_name());
                }
            }
        }

        TeamMatchVariables.selectedPlayersShortNameIntoMap.put(TeamMatchVariables.homeTeam, homeTeamPlayerShortName);
        TeamMatchVariables.selectedPlayersShortNameIntoMap.put(TeamMatchVariables.awayTeam, awayTeamPlayersShortName);
    }

    public CommonThreadOperations(String condition, Map<String, ArrayList<CurrentMatchPlayers>> selectedPlayersMapList) {

        this.condition = condition;
        this.selectedPlayersMapList = selectedPlayersMapList;

    }

}
