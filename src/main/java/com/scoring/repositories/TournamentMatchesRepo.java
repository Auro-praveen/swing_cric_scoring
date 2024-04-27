/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.repositories;

import com.scoring.beans.TeamBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author AuroLed
 */

public interface TournamentMatchesRepo {
    
    public List<TeamBean> getAllTeams();
//    public 
    
    // last updated match_code for the team that playing currently
    public String getLastUpdateMatchCode(String match_between);
    
   
    
}
