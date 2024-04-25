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
public class CurrentMatchPlayers implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_id;
    private int player_jersey;
    @Column(length = 50)
    private String player_name;
    @Column(length = 50)
    private String player_full_name;
    @Column(length = 50)
    private String player_status;
    @Column(length = 50)
    private String team;
    
    public CurrentMatchPlayers() {
        
    }

    public CurrentMatchPlayers(int player_id, int player_jersey, String player_name, String player_full_name, String player_status, String team) {
        this.player_id = player_id;
        this.player_jersey = player_jersey;
        this.player_name = player_name;
        this.player_full_name = player_full_name;
        this.player_status = player_status;
        this.team = team;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public void setPlayer_jersey(int player_jersey) {
        this.player_jersey = player_jersey;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public void setPlayer_full_name(String player_full_name) {
        this.player_full_name = player_full_name;
    }

    public void setPlayer_status(String player_status) {
        this.player_status = player_status;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public int getPlayer_jersey() {
        return player_jersey;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public String getPlayer_full_name() {
        return player_full_name;
    }

    public String getPlayer_status() {
        return player_status;
    }

    public String getTeam() {
        return team;
    }

}
