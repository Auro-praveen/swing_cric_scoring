/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.reference.bean;

/**
 *
 * @author AuroLed
 * 
 */

public class IndividualPlayerBean {
    
    private String name;
    private String fullName;
    private int jerseyNo;
    private String teamId;
//    private String team_Full_name
    
    public IndividualPlayerBean() {
        
    }

    public IndividualPlayerBean(String name, String fullName, int jerseyNo, String teamId) {
        this.name = name;
        this.fullName = fullName;
        this.jerseyNo = jerseyNo;
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getJerseyNo() {
        return jerseyNo;
    }

    public void setJerseyNo(int jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    
    
}
