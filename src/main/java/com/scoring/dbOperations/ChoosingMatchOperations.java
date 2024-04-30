/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.dbOperations;

import com.hibernate.utils.sessionService.HibernateUtils;
import com.scoring.beans.PlayersBean;
import com.scoring.beans.TeamBean;
import com.scoring.globalvariables.TeamMatchVariables;
import com.scoring.reference.bean.IndividualPlayerBean;
import com.scoring.repositories.TournamentMatchesRepo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author AuroLed
 */
public class ChoosingMatchOperations implements TournamentMatchesRepo {

    Session session = null;
    Transaction transaction = null;

    @Override
    public List<TeamBean> getAllTeams() {

        List<TeamBean> teamsList = null;
        session = HibernateUtils.getSession();

        try {
            session.beginTransaction();
            String query = "FROM TeamBean";

            teamsList = session.createQuery(query).getResultList();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return teamsList;
    }

    @Override
    public String getLastUpdateMatchCode(String match_between) {

        session = HibernateUtils.getSession();

        String query = "SELECT match_code FROM MatchDetails WHERE match_code LIKE (:matchName) ORDER BY match_code DESC";

        String matchCode = null;

        try {

            session.beginTransaction();
            matchCode = (String) session.createQuery(query).setParameter("matchName", "%"+match_between+"%").getSingleResult();

        } catch (NoResultException e) {
            System.out.println("No Data Present In The Database Or Database is Empty");
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return matchCode;

    }

    @Override
    public List<PlayersBean> getAllThePlayers(ArrayList<Integer> teams) {
        
        session = HibernateUtils.getSession();
        
        List<PlayersBean> allPlayersList = null;
        
        String query = "FROM PlayersBean WHERE team_id IN (:teamId)";
        
        System.err.println("Here inside the getAllThePlayers list t t t t t t" + teams);
    
        try {
            
            session.beginTransaction();
            allPlayersList = session.createQuery(query).setParameterList("teamId", teams).getResultList();
            
             System.err.println("result list is is is ::==== " + allPlayersList.size());
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        } finally {
            
            if (session != null) {
                session.close();
            }
            
        }
        
        return allPlayersList;
    }

}
