/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.reference.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author AuroLed
 */
public class BothTeamPlayers {

    private String teamName;
    private String teamFullName;
    private ArrayList<IndividualPlayerBean> teamPlayers;
//    private In
    
    public BothTeamPlayers() {
        
    }

    public BothTeamPlayers(String teamName, String teamFullName, ArrayList<IndividualPlayerBean> teamPlayers) {
        this.teamName = teamName;
        this.teamFullName = teamFullName;
        this.teamPlayers = teamPlayers;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamFullName() {
        return teamFullName;
    }

    public void setTeamFullName(String teamFullName) {
        this.teamFullName = teamFullName;
    }

    public ArrayList<IndividualPlayerBean> getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(ArrayList<IndividualPlayerBean> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    

}
