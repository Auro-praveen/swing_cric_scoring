/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author AuroLed
 */
@Entity
@Table(name = "match_details")
public class MatchDetails implements Serializable {

    @Id
    @Column(length = 50)
    private String match_code;
    @Column(length = 50)
    private String matches_between;
    @Column(length = 50)
    private String home_team_name;
    @Column(length = 50)
    private String home_team_full_name;
    @Column(length = 50)
    private String away_team_name;
    @Column(length = 50)
    private String away_team_full_name;
    @Column(length = 50)
    private String team_versus;
    @Column(length = 50)
    private String toss_win_team;
    @Column(length = 50)
    private String toss_win_choose_type;
    private short total_overs;
    @Column(length = 50)
    private String home_team_captain;
    @Column(length = 50)
    private String away_team_captain;
    @Column(length = 50)
    private String state;
    @Column(length = 50)
    private String home_town;
    @Column(length = 50)
    private String stadium;
    @Column(length = 50)
    private String venue_type;
    @Column(length = 50)
    private String first_innings_score;
    @Column(length = 50)
    private String second_innings_score;
    @Column(length = 50)
    private String result;
    private short match_no;
    @Column(length = 50)
    private String umpires;
    @Column(length = 50)
    private String city;
    @Column(length = 50)
    private String tv_umpires;
    private Date matchDate;
    private boolean super_over;
    private short super_over_count;
    private short reviews_remaining;

    @OneToMany(mappedBy = "matchDetails", cascade = CascadeType.ALL)
    private List<FirstInningsBatting> firstInningsBattingList;

    @OneToMany(mappedBy = "matchDetails", cascade = CascadeType.ALL)
    private List<FirstInningsBowling> firstInningsBowlingList;

    @OneToMany(mappedBy = "matchDetails", cascade = CascadeType.ALL)
    private List<SecondInningsBatting> secondInningsBattingList;

    @OneToMany(mappedBy = "matchDetails", cascade = CascadeType.ALL)
    private List<SecondInningsBowling> secondInningsBowlingList;

    @OneToMany(mappedBy = "matchDetails", cascade = CascadeType.ALL)
    private List<SuperOvers> superOverses;

    public MatchDetails() {

    }

    public MatchDetails(String match_code, String matches_between, String home_team_name, String home_team_full_name, String away_team_name, String away_team_full_name, String team_versus, String toss_win_team, String toss_win_choose_type, short total_overs, String home_team_captain, String away_team_captain, String state, String home_town, String stadium, String venue_type, String first_innings_score, String second_innings_score, String result, short match_no, String umpires, String city, String tv_umpires, Date matchDate, boolean super_over, short super_over_count, short reviews_remaining, List<FirstInningsBatting> firstInningsBattingList, List<FirstInningsBowling> firstInningsBowlingList, List<SecondInningsBatting> secondInningsBattingList, List<SecondInningsBowling> secondInningsBowlingList, List<SuperOvers> superOverses) {
        this.match_code = match_code;
        this.matches_between = matches_between;
        this.home_team_name = home_team_name;
        this.home_team_full_name = home_team_full_name;
        this.away_team_name = away_team_name;
        this.away_team_full_name = away_team_full_name;
        this.team_versus = team_versus;
        this.toss_win_team = toss_win_team;
        this.toss_win_choose_type = toss_win_choose_type;
        this.total_overs = total_overs;
        this.home_team_captain = home_team_captain;
        this.away_team_captain = away_team_captain;
        this.state = state;
        this.home_town = home_town;
        this.stadium = stadium;
        this.venue_type = venue_type;
        this.first_innings_score = first_innings_score;
        this.second_innings_score = second_innings_score;
        this.result = result;
        this.match_no = match_no;
        this.umpires = umpires;
        this.city = city;
        this.tv_umpires = tv_umpires;
        this.matchDate = matchDate;
        this.super_over = super_over;
        this.super_over_count = super_over_count;
        this.reviews_remaining = reviews_remaining;
        this.firstInningsBattingList = firstInningsBattingList;
        this.firstInningsBowlingList = firstInningsBowlingList;
        this.secondInningsBattingList = secondInningsBattingList;
        this.secondInningsBowlingList = secondInningsBowlingList;
        this.superOverses = superOverses;
    }

    public String getMatch_code() {
        return match_code;
    }

    public void setMatch_code(String match_code) {
        this.match_code = match_code;
    }

    public String getMatches_between() {
        return matches_between;
    }

    public void setMatches_between(String matches_between) {
        this.matches_between = matches_between;
    }

    public String getHome_team_name() {
        return home_team_name;
    }

    public void setHome_team_name(String home_team_name) {
        this.home_team_name = home_team_name;
    }

    public String getHome_team_full_name() {
        return home_team_full_name;
    }

    public void setHome_team_full_name(String home_team_full_name) {
        this.home_team_full_name = home_team_full_name;
    }

    public String getAway_team_name() {
        return away_team_name;
    }

    public void setAway_team_name(String away_team_name) {
        this.away_team_name = away_team_name;
    }

    public String getAway_team_full_name() {
        return away_team_full_name;
    }

    public void setAway_team_full_name(String away_team_full_name) {
        this.away_team_full_name = away_team_full_name;
    }

    public String getTeam_versus() {
        return team_versus;
    }

    public void setTeam_versus(String team_versus) {
        this.team_versus = team_versus;
    }

    public String getToss_win_team() {
        return toss_win_team;
    }

    public void setToss_win_team(String toss_win_team) {
        this.toss_win_team = toss_win_team;
    }

    public String getToss_win_choose_type() {
        return toss_win_choose_type;
    }

    public void setToss_win_choose_type(String toss_win_choose_type) {
        this.toss_win_choose_type = toss_win_choose_type;
    }

    public short getTotal_overs() {
        return total_overs;
    }

    public void setTotal_overs(short total_overs) {
        this.total_overs = total_overs;
    }

    public String getHome_team_captain() {
        return home_team_captain;
    }

    public void setHome_team_captain(String home_team_captain) {
        this.home_team_captain = home_team_captain;
    }

    public String getAway_team_captain() {
        return away_team_captain;
    }

    public void setAway_team_captain(String away_team_captain) {
        this.away_team_captain = away_team_captain;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHome_town() {
        return home_town;
    }

    public void setHome_town(String home_town) {
        this.home_town = home_town;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getVenue_type() {
        return venue_type;
    }

    public void setVenue_type(String venue_type) {
        this.venue_type = venue_type;
    }

    public String getFirst_innings_score() {
        return first_innings_score;
    }

    public void setFirst_innings_score(String first_innings_score) {
        this.first_innings_score = first_innings_score;
    }

    public String getSecond_innings_score() {
        return second_innings_score;
    }

    public void setSecond_innings_score(String second_innings_score) {
        this.second_innings_score = second_innings_score;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public short getMatch_no() {
        return match_no;
    }

    public void setMatch_no(short match_no) {
        this.match_no = match_no;
    }

    public String getUmpires() {
        return umpires;
    }

    public void setUmpires(String umpires) {
        this.umpires = umpires;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTv_umpires() {
        return tv_umpires;
    }

    public void setTv_umpires(String tv_umpires) {
        this.tv_umpires = tv_umpires;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public boolean isSuper_over() {
        return super_over;
    }

    public void setSuper_over(boolean super_over) {
        this.super_over = super_over;
    }

    public short getSuper_over_count() {
        return super_over_count;
    }

    public void setSuper_over_count(short super_over_count) {
        this.super_over_count = super_over_count;
    }

    public short getReviews_remaining() {
        return reviews_remaining;
    }

    public void setReviews_remaining(short reviews_remaining) {
        this.reviews_remaining = reviews_remaining;
    }

    public List<FirstInningsBatting> getFirstInningsBattingList() {
        return firstInningsBattingList;
    }

    public void setFirstInningsBattingList(List<FirstInningsBatting> firstInningsBattingList) {
        this.firstInningsBattingList = firstInningsBattingList;
    }

    public List<FirstInningsBowling> getFirstInningsBowlingList() {
        return firstInningsBowlingList;
    }

    public void setFirstInningsBowlingList(List<FirstInningsBowling> firstInningsBowlingList) {
        this.firstInningsBowlingList = firstInningsBowlingList;
    }

    public List<SecondInningsBatting> getSecondInningsBattingList() {
        return secondInningsBattingList;
    }

    public void setSecondInningsBattingList(List<SecondInningsBatting> secondInningsBattingList) {
        this.secondInningsBattingList = secondInningsBattingList;
    }

    public List<SecondInningsBowling> getSecondInningsBowlingList() {
        return secondInningsBowlingList;
    }

    public void setSecondInningsBowlingList(List<SecondInningsBowling> secondInningsBowlingList) {
        this.secondInningsBowlingList = secondInningsBowlingList;
    }

    public List<SuperOvers> getSuperOverses() {
        return superOverses;
    }

    public void setSuperOverses(List<SuperOvers> superOverses) {
        this.superOverses = superOverses;
    }

    

}
