/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.services;

import com.hibernate.utils.sessionService.HibernateUtils;
import com.scoring.beans.PlayersBean;
import com.scoring.beans.TeamBean;
import com.scoring.globalvariables.Countries;
import com.scoring.globalvariables.CountriesShort;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author AuroLed
 */
public class SavePlayersService {
    
    private TeamBean teamBean;
    private PlayersBean playersBean;
    
    private Session session  = null;
    
    public boolean saveTeam() {
        
        System.out.println("com.scoring.services.SavePlayersService.saveTeam()");
        teamBean = new TeamBean();
        
        teamBean.setTeam_id(109);
        teamBean.setTeam_name("PBKS");
        teamBean.setHome_stadium("Maharaja Yadavindra Singh International Cricket Stadium");
        teamBean.setHometown("Mohali");
        teamBean.setTeam_captain("Sam Curren");
        teamBean.setTeam_full_name("Punjab Kings");
        teamBean.setTeam_owner("Punjab Kings Pvt.lmtd");
        teamBean.setTotal_players(30);

        try {
            
            session = HibernateUtils.getSession();
            
            Transaction transaction =  session.beginTransaction();
        
            session.persist(teamBean);
            transaction.commit();

//            session.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            
            if (session != null) {
                session.close();
                
            }
            teamBean = null;
        }
        
        
        return false;
    }
    
    
        public boolean savePlayers() {
        
        System.out.println("com.scoring.services.SavePlayersService.saveTeam()");
        
        
//        playersBean.setPlayer_name("Rajat");

        
        String playersList[] = {"MS Dhoni", "Moeen Ali", "Deepak Chahar", "Devon Conway", "Tushar Deshpande",
                                "Shivam Dube","Ruturaj Gaikwad", "Rajvardhan Hangargekar", "Ravindra Jadeja",
                                "Ajay Mandal", "Mukesh Choudhary", "Matheesha Pathirana", "Ajinkya Rahane",
                                "Shaik Rasheed", "Mitchell Santner", "Simarjeet Singh", "Nishant Sindhu", "Prashant Solanki",
                                "Matheesha Theekshana", "Rachin Ravindra", "Shardul Thakur", "Daryl Mitchell", "Sameer Rizvi",
                                "Mustafizur Rahman", "Avanish Rao Aravelly"};
        
        int num =  7;
        
        try {
            
            session = HibernateUtils.getSession();
            
            Transaction transaction =  session.beginTransaction();
            
            for (int i = 0; i < playersList.length -1; i++) {
                
                playersBean = new PlayersBean();
                
                playersBean.setAge(35);
                playersBean.setCity("Chennai");
                playersBean.setState("Tamilnadu");
                playersBean.setBatting_hand("Right Hand");
                playersBean.setCountry(Countries.INDIA.toString());
                playersBean.setCountry_short(CountriesShort.IN.toString());
                playersBean.setBowling_type("Right Arm Quick Bowler");
                playersBean.setDob(Date.valueOf("1982-10-10"));
                playersBean.setMatches_played(240);
                teamBean = new TeamBean();
                teamBean.setTeam_id(101);
                playersBean.setTeamBean(teamBean);
                
               
                String playerName = playersList[i];
                String[] playerName_arr = playerName.split(" ");
                
                playersBean.setPlayer_full_name(playerName);
                playersBean.setPlayer_name(playerName_arr[1]);
                playersBean.setJersey_no(num);
                
                
                
                session.persist(playersBean);
               
                num =  num + 2;
            }
        
             transaction.commit();
            

//            session.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            
            if (session != null) {
                session.close();

            }
            
        }
        
        
        return false;
    }
    
}
