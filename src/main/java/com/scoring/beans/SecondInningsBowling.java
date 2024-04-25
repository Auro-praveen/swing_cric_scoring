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
@Table(name = "second_innings_bowling")
public class SecondInningsBowling implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long second_innings_bowling_id;
    private short bowler_jersey_no;
    private double overs_bowled;
    @Column(length = 50)
    private String bowler_name;
    @Column(length = 50)
    private String bowler_full_name;
    private short maiden_overs;
    private short wickets_taken;
    @Column(length = 50)
    private String nameof_wicket_taken_batsmens;
    @Column(length = 50)
    private String bowled_at;
    private short runs_given;
    private short extras_given;
    private short noof_wides;
    private short noof_noballs;
    private short noof_byes;
    private double economy;
        
    @ManyToOne
    @JoinColumn(name = "match_code")
    private MatchDetails matchDetails;
    
    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamBean teamBean;
    
    public SecondInningsBowling() {
        
    }

    public SecondInningsBowling(long second_innings_bowling_id, short bowler_jersey_no, double overs_bowled, String bowler_name, String bowler_full_name, short maiden_overs, short wickets_taken, String nameof_wicket_taken_batsmens, String bowled_at, short runs_given, short extras_given, short noof_wides, short noof_noballs, short noof_byes, double economy, MatchDetails matchDetails, TeamBean teamBean) {
        this.second_innings_bowling_id = second_innings_bowling_id;
        this.bowler_jersey_no = bowler_jersey_no;
        this.overs_bowled = overs_bowled;
        this.bowler_name = bowler_name;
        this.bowler_full_name = bowler_full_name;
        this.maiden_overs = maiden_overs;
        this.wickets_taken = wickets_taken;
        this.nameof_wicket_taken_batsmens = nameof_wicket_taken_batsmens;
        this.bowled_at = bowled_at;
        this.runs_given = runs_given;
        this.extras_given = extras_given;
        this.noof_wides = noof_wides;
        this.noof_noballs = noof_noballs;
        this.noof_byes = noof_byes;
        this.economy = economy;
        this.matchDetails = matchDetails;
        this.teamBean = teamBean;
    }

    public void setSecond_innings_bowling_id(long second_innings_bowling_id) {
        this.second_innings_bowling_id = second_innings_bowling_id;
    }

    public void setBowler_jersey_no(short bowler_jersey_no) {
        this.bowler_jersey_no = bowler_jersey_no;
    }

    public void setOvers_bowled(double overs_bowled) {
        this.overs_bowled = overs_bowled;
    }

    public void setBowler_name(String bowler_name) {
        this.bowler_name = bowler_name;
    }

    public void setBowler_full_name(String bowler_full_name) {
        this.bowler_full_name = bowler_full_name;
    }

    public void setMaiden_overs(short maiden_overs) {
        this.maiden_overs = maiden_overs;
    }

    public void setWickets_taken(short wickets_taken) {
        this.wickets_taken = wickets_taken;
    }

    public void setNameof_wicket_taken_batsmens(String nameof_wicket_taken_batsmens) {
        this.nameof_wicket_taken_batsmens = nameof_wicket_taken_batsmens;
    }

    public void setBowled_at(String bowled_at) {
        this.bowled_at = bowled_at;
    }

    public void setRuns_given(short runs_given) {
        this.runs_given = runs_given;
    }

    public void setExtras_given(short extras_given) {
        this.extras_given = extras_given;
    }

    public void setNoof_wides(short noof_wides) {
        this.noof_wides = noof_wides;
    }

    public void setNoof_noballs(short noof_noballs) {
        this.noof_noballs = noof_noballs;
    }

    public void setNoof_byes(short noof_byes) {
        this.noof_byes = noof_byes;
    }

    public void setEconomy(double economy) {
        this.economy = economy;
    }

    public void setMatchDetails(MatchDetails matchDetails) {
        this.matchDetails = matchDetails;
    }

    public void setTeamBean(TeamBean teamBean) {
        this.teamBean = teamBean;
    }

    public long getSecond_innings_bowling_id() {
        return second_innings_bowling_id;
    }

    public short getBowler_jersey_no() {
        return bowler_jersey_no;
    }

    public double getOvers_bowled() {
        return overs_bowled;
    }

    public String getBowler_name() {
        return bowler_name;
    }

    public String getBowler_full_name() {
        return bowler_full_name;
    }

    public short getMaiden_overs() {
        return maiden_overs;
    }

    public short getWickets_taken() {
        return wickets_taken;
    }

    public String getNameof_wicket_taken_batsmens() {
        return nameof_wicket_taken_batsmens;
    }

    public String getBowled_at() {
        return bowled_at;
    }

    public short getRuns_given() {
        return runs_given;
    }

    public short getExtras_given() {
        return extras_given;
    }

    public short getNoof_wides() {
        return noof_wides;
    }

    public short getNoof_noballs() {
        return noof_noballs;
    }

    public short getNoof_byes() {
        return noof_byes;
    }

    public double getEconomy() {
        return economy;
    }

    public MatchDetails getMatchDetails() {
        return matchDetails;
    }

    public TeamBean getTeamBean() {
        return teamBean;
    }

    
    
}
