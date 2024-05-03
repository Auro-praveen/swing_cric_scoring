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
public class BeforeMatchThreadOperatins implements Runnable {

    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        TeamOperationsAndServices teamOperationsAndServices = new TeamOperationsAndServices();
        TeamMatchVariables.teamFullNameList = (ArrayList<String>) teamOperationsAndServices.getAllTeamNames();

    }

    public void callBeforeMatchThread() {
        BeforeMatchThreadOperatins beforeMatchOpThread = new BeforeMatchThreadOperatins();
        Thread matchNameThread = new Thread(beforeMatchOpThread);
        matchNameThread.start();
    }

}
