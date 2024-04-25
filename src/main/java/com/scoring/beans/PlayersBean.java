/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.beans;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 *
 * @author AuroLed
 */

@Entity
@Table(name = "players")
public class PlayersBean implements Serializable{
    
    @Id
    private int jersey_no;
    private String player_name;
    private String player_full_name;
    private int age;
    private String state;
    private String country;
    private String batting_hand;
    private String bowling_type;
    private Date dob;
    private int matches_played;
    private int debut_year;
    private String country_short;
    private String city;
    
    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamBean teamBean;

    public PlayersBean() {
        
    }

    public PlayersBean(int jersey_no, String player_name, String player_full_name, int age, String state, String country, String batting_hand, String bowling_type, Date dob, int matches_played, int debut_year, String city, TeamBean teamBean, String country_short) {
        this.jersey_no = jersey_no;
        this.player_name = player_name;
        this.player_full_name = player_full_name;
        this.age = age;
        this.state = state;
        this.country = country;
        this.batting_hand = batting_hand;
        this.bowling_type = bowling_type;
        this.dob = dob;
        this.matches_played = matches_played;
        this.debut_year = debut_year;
        this.city = city;
        this.teamBean = teamBean;
        this.country_short= country_short;
    }

    public void setJersey_no(int jersey_no) {
        this.jersey_no = jersey_no;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public void setPlayer_full_name(String player_full_name) {
        this.player_full_name = player_full_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBatting_hand(String batting_hand) {
        this.batting_hand = batting_hand;
    }

    public void setBowling_type(String bowling_type) {
        this.bowling_type = bowling_type;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setMatches_played(int matches_played) {
        this.matches_played = matches_played;
    }

    public void setDebut_year(int debut_year) {
        this.debut_year = debut_year;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry_short(String country_short) {
        this.country_short = country_short;
    }
    
    

    public void setTeamBean(TeamBean teamBean) {
        this.teamBean = teamBean;
    }

    public int getJersey_no() {
        return jersey_no;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public String getPlayer_full_name() {
        return player_full_name;
    }

    public int getAge() {
        return age;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getBatting_hand() {
        return batting_hand;
    }

    public String getBowling_type() {
        return bowling_type;
    }

    public Date getDob() {
        return dob;
    }

    public int getMatches_played() {
        return matches_played;
    }

    public int getDebut_year() {
        return debut_year;
    }

    public String getCity() {
        return city;
    }

    public TeamBean getTeamBean() {
        return teamBean;
    }

    public String getCountry_short() {
        return country_short;
    }



}
