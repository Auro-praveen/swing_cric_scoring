/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.services;

import com.scoring.beans.TeamBean;
import com.scoring.dbOperations.ChoosingMatchOperations;
import com.scoring.repositories.TournamentMatchesRepo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AuroLed
 */
public class TeamOperationsAndServices{

    private ChoosingMatchOperations startMatchOperations;

    public List<String> getAllTeamNames() {
        //To change body of generated methods, choose Tools | Templates.
        List<String> teams = new ArrayList<String>();
        List<TeamBean> teambeanList;
        
        startMatchOperations = new ChoosingMatchOperations();
        
        
        teambeanList =  startMatchOperations.getAllTeams();
        
        if (!teambeanList.isEmpty()) {
            teambeanList.forEach( TeamBean -> {
                teams.add(TeamBean.getTeam_full_name());
            } );
        } 
      
        
        return teams;
        
    }
    
}
