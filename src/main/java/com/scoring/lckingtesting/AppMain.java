/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.lckingtesting;

import com.scoring.services.TeamOperationsAndServices;



/**
 *
 * @author AuroLed
 */
public class AppMain {
    
    public static void main(String[] args) {
        
        System.out.println("com.scoring.lckingtesting.AppMain.main() hereh erherherherhereher");
        
//        new SavePlayersService().saveTeam();
//        new SavePlayersService().savePlayers();
        new TeamOperationsAndServices().getAllTeamNames();

    }
    
}
