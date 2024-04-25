/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author AuroLed
 */

@Entity
@Table(name = "supover_batting")
public class SuperOverBatting implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sup_batting_id;
    @Column(length = 50)
    private String sup_batsman_name;
    @Column(length = 50)
    private String sup_batsman_fullname;
    private short sup_batsman_jersey;
    private short balls_faced;
    private short runs_scored;
    private short strike_rate;
    @Column(length = 50)
    private String team;
    
    @ManyToOne
    @JoinColumn(name = "super_over_id")
    private SuperOvers superOver;
    
    public SuperOverBatting() {
        
    }

    public SuperOverBatting(long sup_batting_id, String sup_batsman_name, String sup_batsman_fullname, short sup_batsman_jersey, short balls_faced, short runs_scored, short strike_rate, String team, SuperOvers superOver) {
        this.sup_batting_id = sup_batting_id;
        this.sup_batsman_name = sup_batsman_name;
        this.sup_batsman_fullname = sup_batsman_fullname;
        this.sup_batsman_jersey = sup_batsman_jersey;
        this.balls_faced = balls_faced;
        this.runs_scored = runs_scored;
        this.strike_rate = strike_rate;
        this.team = team;
        this.superOver = superOver;
    }

    public void setSup_batting_id(long sup_batting_id) {
        this.sup_batting_id = sup_batting_id;
    }

    public void setSup_batsman_name(String sup_batsman_name) {
        this.sup_batsman_name = sup_batsman_name;
    }

    public void setSup_batsman_fullname(String sup_batsman_fullname) {
        this.sup_batsman_fullname = sup_batsman_fullname;
    }

    public void setSup_batsman_jersey(short sup_batsman_jersey) {
        this.sup_batsman_jersey = sup_batsman_jersey;
    }

    public void setBalls_faced(short balls_faced) {
        this.balls_faced = balls_faced;
    }

    public void setRuns_scored(short runs_scored) {
        this.runs_scored = runs_scored;
    }

    public void setStrike_rate(short strike_rate) {
        this.strike_rate = strike_rate;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setSuperOver(SuperOvers superOver) {
        this.superOver = superOver;
    }

    public long getSup_batting_id() {
        return sup_batting_id;
    }

    public String getSup_batsman_name() {
        return sup_batsman_name;
    }

    public String getSup_batsman_fullname() {
        return sup_batsman_fullname;
    }

    public short getSup_batsman_jersey() {
        return sup_batsman_jersey;
    }

    public short getBalls_faced() {
        return balls_faced;
    }

    public short getRuns_scored() {
        return runs_scored;
    }

    public short getStrike_rate() {
        return strike_rate;
    }

    public String getTeam() {
        return team;
    }

    public SuperOvers getSuperOver() {
        return superOver;
    }
    
    

}
