/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.services;

import com.scoring.beans.PlayersBean;
import com.scoring.beans.TeamBean;
import com.scoring.dbOperations.ChoosingMatchOperations;
import com.scoring.globalvariables.TeamMatchVariables;
import com.scoring.reference.bean.BothTeamPlayers;
import com.scoring.reference.bean.IndividualPlayerBean;
import com.scoring.repositories.TournamentMatchesRepo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author AuroLed
 */
public class TeamOperationsAndServices {

    private ChoosingMatchOperations startMatchOperations = new ChoosingMatchOperations();

    public List<String> getAllTeamNames() {
        //To change body of generated methods, choose Tools | Templates.
        List<String> teams = new ArrayList<String>();
        List<TeamBean> teambeanList;

        teambeanList = startMatchOperations.getAllTeams();

        if (!teambeanList.isEmpty()) {
            teambeanList.forEach(TeamBean -> {
                teams.add(TeamBean.getTeam_full_name());
                Map<String, Object> teamList = new HashMap<String, Object>();
                teamList.put("teamShortName", TeamBean.getTeam_name());
                teamList.put("teamId", TeamBean.getTeam_id());
                TeamMatchVariables.stadiumsMap.put(TeamBean.getHome_stadium(), TeamBean.getHometown());

                TeamMatchVariables.selectedTeamsMap.put(TeamBean.getTeam_full_name(), teamList);

            });
        }

        return teams;

    }

    public Map<String, ArrayList<PlayersBean>> bothTeamPlayers(ArrayList<Integer> team, ArrayList<String> tNames) {

//        System.out.println("Here inside bothTeamPlayers service class :;==== " + tNames);

        List<PlayersBean> allPlayersBeanList = startMatchOperations.getAllThePlayers(team);

//        System.out.println("From After Getting the result  :;==== " + tNames);

        Map<String, ArrayList<PlayersBean>> bothTeamPlayersMap = new HashMap<>();

        try {

            if (!allPlayersBeanList.isEmpty()) {

                ArrayList<PlayersBean> homeTeamPlayers = new ArrayList<>();
                ArrayList<PlayersBean> awayTeamPlayers = new ArrayList<>();

                allPlayersBeanList.forEach((PlayersBean playerBean) -> {

//                    String teamName = tNames.get(team.indexOf(playerBean.getTeamId()));
                    if (playerBean.getTeamBean().getTeam_id() == team.get(0)) {
                        homeTeamPlayers.add(playerBean);
                    } else {
                        awayTeamPlayers.add(playerBean);
                    }

                });
//                bothTeamPlayersBean = new BothTeamPlayers(String.valueOf(team.get(0)), TeamMatchVariables.homeTeam, homeTeamPlayers);
                bothTeamPlayersMap.put(tNames.get(0), homeTeamPlayers);
//                bothTeamPlayersBean = new BothTeamPlayers(String.valueOf(team.get(1)), TeamMatchVariables.awayTeam, awayTeamPlayers);
                bothTeamPlayersMap.put(tNames.get(1), awayTeamPlayers);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return bothTeamPlayersMap;
    }

}
