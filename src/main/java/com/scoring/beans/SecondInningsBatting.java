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
@Table(name = "second_innings_batting")
public class SecondInningsBatting implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long second_innings_batting_id;
    @Column(length = 50)
    private String batsmen_name;
    @Column(length = 50)
    private String batsmen_full_name;
    private short batsmen_jersey_no;
    private short no_of_fours;
    private short no_of_sixes;
    private short total_runs;
    private short total_balls_faced;
    private short strike_rate;
    private short match_no;
    @Column(length = 50)
    private String wicket_status;
    @Column(length = 50)
    private String wicket_type;
    @Column(length = 50)
    private String wicket_taking_bowler;
    @Column(length = 50)
    private String wicket_description;
    private short batting_position;
    private short wicket_number;
    
    @ManyToOne
    @JoinColumn(name = "match_code")
    private MatchDetails matchDetails;
    
    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamBean teamBean;
    
    public SecondInningsBatting() {
        
    }

    public SecondInningsBatting(long second_innings_batting_id, String batsmen_name, String batsmen_full_name, short batsmen_jersey_no, short no_of_fours, short no_of_sixes, short total_runs, short total_balls_faced, short strike_rate, short match_no, String wicket_status, String wicket_type, String wicket_taking_bowler, String wicket_description, short batting_position, short wicket_number, MatchDetails matchDetails, TeamBean teamBean) {
        this.second_innings_batting_id = second_innings_batting_id;
        this.batsmen_name = batsmen_name;
        this.batsmen_full_name = batsmen_full_name;
        this.batsmen_jersey_no = batsmen_jersey_no;
        this.no_of_fours = no_of_fours;
        this.no_of_sixes = no_of_sixes;
        this.total_runs = total_runs;
        this.total_balls_faced = total_balls_faced;
        this.strike_rate = strike_rate;
        this.match_no = match_no;
        this.wicket_status = wicket_status;
        this.wicket_type = wicket_type;
        this.wicket_taking_bowler = wicket_taking_bowler;
        this.wicket_description = wicket_description;
        this.batting_position = batting_position;
        this.wicket_number = wicket_number;
        this.matchDetails = matchDetails;
        this.teamBean = teamBean;
    }

    public void setSecond_innings_batting_id(long second_innings_batting_id) {
        this.second_innings_batting_id = second_innings_batting_id;
    }

    public void setBatsmen_name(String batsmen_name) {
        this.batsmen_name = batsmen_name;
    }

    public void setBatsmen_full_name(String batsmen_full_name) {
        this.batsmen_full_name = batsmen_full_name;
    }

    public void setBatsmen_jersey_no(short batsmen_jersey_no) {
        this.batsmen_jersey_no = batsmen_jersey_no;
    }

    public void setNo_of_fours(short no_of_fours) {
        this.no_of_fours = no_of_fours;
    }

    public void setNo_of_sixes(short no_of_sixes) {
        this.no_of_sixes = no_of_sixes;
    }

    public void setTotal_runs(short total_runs) {
        this.total_runs = total_runs;
    }

    public void setTotal_balls_faced(short total_balls_faced) {
        this.total_balls_faced = total_balls_faced;
    }

    public void setStrike_rate(short strike_rate) {
        this.strike_rate = strike_rate;
    }

    public void setMatch_no(short match_no) {
        this.match_no = match_no;
    }

    public void setWicket_status(String wicket_status) {
        this.wicket_status = wicket_status;
    }

    public void setWicket_type(String wicket_type) {
        this.wicket_type = wicket_type;
    }

    public void setWicket_taking_bowler(String wicket_taking_bowler) {
        this.wicket_taking_bowler = wicket_taking_bowler;
    }

    public void setWicket_description(String wicket_description) {
        this.wicket_description = wicket_description;
    }

    public void setBatting_position(short batting_position) {
        this.batting_position = batting_position;
    }

    public void setWicket_number(short wicket_number) {
        this.wicket_number = wicket_number;
    }

    public void setMatchDetails(MatchDetails matchDetails) {
        this.matchDetails = matchDetails;
    }

    public void setTeamBean(TeamBean teamBean) {
        this.teamBean = teamBean;
    }

    public long getSecond_innings_batting_id() {
        return second_innings_batting_id;
    }

    public String getBatsmen_name() {
        return batsmen_name;
    }

    public String getBatsmen_full_name() {
        return batsmen_full_name;
    }

    public short getBatsmen_jersey_no() {
        return batsmen_jersey_no;
    }

    public short getNo_of_fours() {
        return no_of_fours;
    }

    public short getNo_of_sixes() {
        return no_of_sixes;
    }

    public short getTotal_runs() {
        return total_runs;
    }

    public short getTotal_balls_faced() {
        return total_balls_faced;
    }

    public short getStrike_rate() {
        return strike_rate;
    }

    public short getMatch_no() {
        return match_no;
    }

    public String getWicket_status() {
        return wicket_status;
    }

    public String getWicket_type() {
        return wicket_type;
    }

    public String getWicket_taking_bowler() {
        return wicket_taking_bowler;
    }

    public String getWicket_description() {
        return wicket_description;
    }

    public short getBatting_position() {
        return batting_position;
    }

    public short getWicket_number() {
        return wicket_number;
    }

    public MatchDetails getMatchDetails() {
        return matchDetails;
    }

    public TeamBean getTeamBean() {
        return teamBean;
    }

    
    
}
