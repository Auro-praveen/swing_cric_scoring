/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.threadOperations;

import com.scoring.globalvariables.TeamMatchVariables;
import com.scoring.services.TeamOperationsAndServices;
import java.util.ArrayList;

/**
 *
 * @author AuroLed
 */
public class GetAllPlayersThreadOperations extends Thread {

    private ArrayList<Integer> teamIdList;
    private ArrayList<String> teamNameList;

    public void run() {
        TeamOperationsAndServices teamOperationsAndServices = new TeamOperationsAndServices();
        TeamMatchVariables.bothTeamPlayersGlobalMap = teamOperationsAndServices.bothTeamPlayers(teamIdList, teamNameList);

    }

    public GetAllPlayersThreadOperations() {

    }

    public GetAllPlayersThreadOperations(ArrayList<Integer> teamIdList, ArrayList<String> teamNameList) {
        this.teamIdList = teamIdList;
        this.teamNameList = teamNameList;

        // starting a thread here
        start();

    }

//    public void callGetAllPlayersThreadOper() {
//        GetAllPlayersThreadOperations allPlayersThreadOperations = new GetAllPlayersThreadOperations();
//        allPlayersThreadOperations.start();
//    }
}
