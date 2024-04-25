/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GeneratorType;

/**
 *
 * @author AuroLed
 */
@Entity
@Table(name = "teams")

public class TeamBean implements Serializable {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long team_id;

    @Column(length = 50)
    private String team_name;
    
    @Column(length = 50)
    private String team_full_name;
    
    @Column(length = 50)
    private String hometown;
    private int total_players;
    @Column(length = 50)
    private String team_owner;
    @Column(length = 50)
    private String team_captain;
    @Column(length = 50)
    private String home_stadium;

    @OneToMany(mappedBy = "teamBean", cascade = CascadeType.ALL)
    private List<PlayersBean> playersList = new ArrayList<>();

    @OneToMany(mappedBy = "teamBean", cascade = CascadeType.ALL)
    private List<FirstInningsBatting> firstInningsBattingList;

    @OneToMany(mappedBy = "teamBean", cascade = CascadeType.ALL)
    private List<FirstInningsBowling> firstInningsBowlingList;

    @OneToMany(mappedBy = "teamBean", cascade = CascadeType.ALL)
    private List<SecondInningsBatting> secondInningsBattingList;

    @OneToMany(mappedBy = "teamBean", cascade = CascadeType.ALL)
    private List<SecondInningsBowling> secondInningsBowlinglist;

    public TeamBean() {

    }

    public TeamBean(long team_id, String team_name, String team_full_name, String hometown, int total_players, String team_owner, String team_captain, String home_stadium, List<FirstInningsBatting> firstInningsBattingList, List<FirstInningsBowling> firstInningsBowlingList, List<SecondInningsBatting> secondInningsBattingList, List<SecondInningsBowling> secondInningsBowlinglist) {
        this.team_id = team_id;
        this.team_name = team_name;
        this.team_full_name = team_full_name;
        this.hometown = hometown;
        this.total_players = total_players;
        this.team_owner = team_owner;
        this.team_captain = team_captain;
        this.home_stadium = home_stadium;
        this.firstInningsBattingList = firstInningsBattingList;
        this.firstInningsBowlingList = firstInningsBowlingList;
        this.secondInningsBattingList = secondInningsBattingList;
        this.secondInningsBowlinglist = secondInningsBowlinglist;
    }

    public void setTeam_id(long team_id) {
        this.team_id = team_id;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public void setTeam_full_name(String team_full_name) {
        this.team_full_name = team_full_name;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setTotal_players(int total_players) {
        this.total_players = total_players;
    }

    public void setTeam_owner(String team_owner) {
        this.team_owner = team_owner;
    }

    public void setTeam_captain(String team_captain) {
        this.team_captain = team_captain;
    }

    public void setHome_stadium(String home_stadium) {
        this.home_stadium = home_stadium;
    }

    public void setPlayersList(List<PlayersBean> playersList) {
        this.playersList = playersList;
    }

    public void setFirstInningsBattingList(List<FirstInningsBatting> firstInningsBattingList) {
        this.firstInningsBattingList = firstInningsBattingList;
    }

    public void setFirstInningsBowlingList(List<FirstInningsBowling> firstInningsBowlingList) {
        this.firstInningsBowlingList = firstInningsBowlingList;
    }

    public void setSecondInningsBattingList(List<SecondInningsBatting> secondInningsBattingList) {
        this.secondInningsBattingList = secondInningsBattingList;
    }

    public void setSecondInningsBowlinglist(List<SecondInningsBowling> secondInningsBowlinglist) {
        this.secondInningsBowlinglist = secondInningsBowlinglist;
    }

    public long getTeam_id() {
        return team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public String getTeam_full_name() {
        return team_full_name;
    }

    public String getHometown() {
        return hometown;
    }

    public int getTotal_players() {
        return total_players;
    }

    public String getTeam_owner() {
        return team_owner;
    }

    public String getTeam_captain() {
        return team_captain;
    }

    public String getHome_stadium() {
        return home_stadium;
    }

    public List<PlayersBean> getPlayersList() {
        return playersList;
    }

    public List<FirstInningsBatting> getFirstInningsBattingList() {
        return firstInningsBattingList;
    }

    public List<FirstInningsBowling> getFirstInningsBowlingList() {
        return firstInningsBowlingList;
    }

    public List<SecondInningsBatting> getSecondInningsBattingList() {
        return secondInningsBattingList;
    }

    public List<SecondInningsBowling> getSecondInningsBowlinglist() {
        return secondInningsBowlinglist;
    }

}
