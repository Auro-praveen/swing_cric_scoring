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
import javax.persistence.Table;

/**
 *
 * @author AuroLed
 */

@Entity
@Table(name = "current_match_players")
public class CurrentMatchPlayers implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_id;
    private int player_jersey;
    @Column(length = 50)
    private String player_name;
    @Column(length = 50)
    private String player_full_name;
    @Column(length = 50)
    private String batting_hand;
    @Column(length = 50)
    private String team;
    @Column(length = 50)
    private String bowling_type;
    @Column(length = 50)
    private String match_code;
    @Column(length = 50)
    private String team_fullName;
    
    public CurrentMatchPlayers() {
        
    }

    public CurrentMatchPlayers(int player_jersey, String player_name, String player_full_name, String batting_hand, String team, String bowling_type, String match_code, String team_fullName) {
//        this.player_id = player_id;
        this.player_jersey = player_jersey;
        this.player_name = player_name;
        this.player_full_name = player_full_name;
        this.batting_hand = batting_hand;
        this.team = team;
        this.bowling_type = bowling_type;
        this.match_code = match_code;
        this.team_fullName = team_fullName;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public int getPlayer_jersey() {
        return player_jersey;
    }

    public void setPlayer_jersey(int player_jersey) {
        this.player_jersey = player_jersey;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_full_name() {
        return player_full_name;
    }

    public void setPlayer_full_name(String player_full_name) {
        this.player_full_name = player_full_name;
    }

    public String getBatting_hand() {
        return batting_hand;
    }

    public void setBatting_hand(String batting_hand) {
        this.batting_hand = batting_hand;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getBowling_type() {
        return bowling_type;
    }

    public void setBowling_type(String bowling_type) {
        this.bowling_type = bowling_type;
    }

    public String getMatch_code() {
        return match_code;
    }

    public void setMatch_code(String match_code) {
        this.match_code = match_code;
    }

    public String getTeam_fullName() {
        return team_fullName;
    }

    public void setTeam_fullName(String team_fullName) {
        this.team_fullName = team_fullName;
    }

    

}
