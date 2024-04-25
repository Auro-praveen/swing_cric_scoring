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
@Table(name = "supover_bowling")
public class SuperOverBowling implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sup_bowling_id;
    @Column(length = 50)
    private String sup_bowler_name;
    @Column(length = 50)
    private String sup_bowler_fullname;
    private short sup_bowler_jersey;
    private double sup_overs_bowled;
    private double economy;
    private short wickets_taken;
    private short runs_given;
    private short extras;
    private short no_balls;
    private short wides;
    @Column(length = 50)
    private String team;
    
    @ManyToOne
    @JoinColumn(name = "super_over_id")
    private SuperOvers superOver;
    
    public SuperOverBowling() {
        
    }

    public SuperOverBowling(long sup_bowling_id, String sup_bowler_name, String sup_bowler_fullname, short sup_bowler_jersey, double sup_overs_bowled, double economy, short wickets_taken, short runs_given, short extras, short no_balls, short wides, String team, SuperOvers superOver) {
        this.sup_bowling_id = sup_bowling_id;
        this.sup_bowler_name = sup_bowler_name;
        this.sup_bowler_fullname = sup_bowler_fullname;
        this.sup_bowler_jersey = sup_bowler_jersey;
        this.sup_overs_bowled = sup_overs_bowled;
        this.economy = economy;
        this.wickets_taken = wickets_taken;
        this.runs_given = runs_given;
        this.extras = extras;
        this.no_balls = no_balls;
        this.wides = wides;
        this.team = team;
        this.superOver = superOver;
    }

    public void setSup_bowling_id(long sup_bowling_id) {
        this.sup_bowling_id = sup_bowling_id;
    }

    public void setSup_bowler_name(String sup_bowler_name) {
        this.sup_bowler_name = sup_bowler_name;
    }

    public void setSup_bowler_fullname(String sup_bowler_fullname) {
        this.sup_bowler_fullname = sup_bowler_fullname;
    }

    public void setSup_bowler_jersey(short sup_bowler_jersey) {
        this.sup_bowler_jersey = sup_bowler_jersey;
    }

    public void setSup_overs_bowled(double sup_overs_bowled) {
        this.sup_overs_bowled = sup_overs_bowled;
    }

    public void setEconomy(double economy) {
        this.economy = economy;
    }

    public void setWickets_taken(short wickets_taken) {
        this.wickets_taken = wickets_taken;
    }

    public void setRuns_given(short runs_given) {
        this.runs_given = runs_given;
    }

    public void setExtras(short extras) {
        this.extras = extras;
    }

    public void setNo_balls(short no_balls) {
        this.no_balls = no_balls;
    }

    public void setWides(short wides) {
        this.wides = wides;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setSuperOver(SuperOvers superOver) {
        this.superOver = superOver;
    }

    public long getSup_bowling_id() {
        return sup_bowling_id;
    }

    public String getSup_bowler_name() {
        return sup_bowler_name;
    }

    public String getSup_bowler_fullname() {
        return sup_bowler_fullname;
    }

    public short getSup_bowler_jersey() {
        return sup_bowler_jersey;
    }

    public double getSup_overs_bowled() {
        return sup_overs_bowled;
    }

    public double getEconomy() {
        return economy;
    }

    public short getWickets_taken() {
        return wickets_taken;
    }

    public short getRuns_given() {
        return runs_given;
    }

    public short getExtras() {
        return extras;
    }

    public short getNo_balls() {
        return no_balls;
    }

    public short getWides() {
        return wides;
    }

    public String getTeam() {
        return team;
    }

    public SuperOvers getSuperOver() {
        return superOver;
    }

}
