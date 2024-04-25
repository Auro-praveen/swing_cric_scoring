/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author AuroLed
 */
@Entity
@Table(name = "super_overs")
public class SuperOvers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int super_over_id;
    private short first_bat_score;
    private short second_bat_score;
    private short first_fallen_wickets;
    private short second_fallen_wickets;
    private double first_inn_overplayer;
    private double second_inn_overplayed;
    @Column(length = 50)
    private String first_batting_team;
    @Column(length = 50)
    private String second_batting_team;
    @Column(length = 50)
    private String match_result;
    @Column(length = 50)
    private String super_over_match_id;
    @Column(length = 50)
    private String team_versus;
    @Column(length = 50)
    private String match_code;

    @OneToMany(mappedBy = "superOvers", cascade = CascadeType.ALL)
    private List<SuperOverBatting> superOverBattingList;

    @OneToMany(mappedBy = "superOvers", cascade = CascadeType.ALL)
    private List<SuperOverBowling> superOverBowlingList;

    public SuperOvers() {

    }

    public SuperOvers(int super_over_id, short first_bat_score, short second_bat_score, short first_fallen_wickets, short second_fallen_wickets, double first_inn_overplayer, double second_inn_overplayed, String first_batting_team, String second_batting_team, String match_result, String super_over_match_id, String team_versus, String match_code, List<SuperOverBatting> superOverBattingList, List<SuperOverBowling> superOverBowlingList) {
        this.super_over_id = super_over_id;
        this.first_bat_score = first_bat_score;
        this.second_bat_score = second_bat_score;
        this.first_fallen_wickets = first_fallen_wickets;
        this.second_fallen_wickets = second_fallen_wickets;
        this.first_inn_overplayer = first_inn_overplayer;
        this.second_inn_overplayed = second_inn_overplayed;
        this.first_batting_team = first_batting_team;
        this.second_batting_team = second_batting_team;
        this.match_result = match_result;
        this.super_over_match_id = super_over_match_id;
        this.team_versus = team_versus;
        this.match_code = match_code;
        this.superOverBattingList = superOverBattingList;
        this.superOverBowlingList = superOverBowlingList;

    }

    public void setSuper_over_id(int super_over_id) {
        this.super_over_id = super_over_id;
    }

    public void setFirst_bat_score(short first_bat_score) {
        this.first_bat_score = first_bat_score;
    }

    public void setSecond_bat_score(short second_bat_score) {
        this.second_bat_score = second_bat_score;
    }

    public void setFirst_fallen_wickets(short first_fallen_wickets) {
        this.first_fallen_wickets = first_fallen_wickets;
    }

    public void setSecond_fallen_wickets(short second_fallen_wickets) {
        this.second_fallen_wickets = second_fallen_wickets;
    }

    public void setFirst_inn_overplayer(double first_inn_overplayer) {
        this.first_inn_overplayer = first_inn_overplayer;
    }

    public void setSecond_inn_overplayed(double second_inn_overplayed) {
        this.second_inn_overplayed = second_inn_overplayed;
    }

    public void setFirst_batting_team(String first_batting_team) {
        this.first_batting_team = first_batting_team;
    }

    public void setSecond_batting_team(String second_batting_team) {
        this.second_batting_team = second_batting_team;
    }

    public void setMatch_result(String match_result) {
        this.match_result = match_result;
    }

    public void setSuper_over_match_id(String super_over_match_id) {
        this.super_over_match_id = super_over_match_id;
    }

    public void setTeam_versus(String team_versus) {
        this.team_versus = team_versus;
    }

    public void setMatch_code(String match_code) {
        this.match_code = match_code;
    }

    public void setSuperOverBattingList(List<SuperOverBatting> superOverBattingList) {
        this.superOverBattingList = superOverBattingList;
    }

    public void setSuperOverBowlingList(List<SuperOverBowling> superOverBowlingList) {
        this.superOverBowlingList = superOverBowlingList;
    }

    public int getSuper_over_id() {
        return super_over_id;
    }

    public short getFirst_bat_score() {
        return first_bat_score;
    }

    public short getSecond_bat_score() {
        return second_bat_score;
    }

    public short getFirst_fallen_wickets() {
        return first_fallen_wickets;
    }

    public short getSecond_fallen_wickets() {
        return second_fallen_wickets;
    }

    public double getFirst_inn_overplayer() {
        return first_inn_overplayer;
    }

    public double getSecond_inn_overplayed() {
        return second_inn_overplayed;
    }

    public String getFirst_batting_team() {
        return first_batting_team;
    }

    public String getSecond_batting_team() {
        return second_batting_team;
    }

    public String getMatch_result() {
        return match_result;
    }

    public String getSuper_over_match_id() {
        return super_over_match_id;
    }

    public String getTeam_versus() {
        return team_versus;
    }

    public String getMatch_code() {
        return match_code;
    }

    public List<SuperOverBatting> getSuperOverBattingList() {
        return superOverBattingList;
    }

    public List<SuperOverBowling> getSuperOverBowlingList() {
        return superOverBowlingList;
    }
    
}
