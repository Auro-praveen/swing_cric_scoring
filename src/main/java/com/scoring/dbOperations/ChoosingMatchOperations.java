/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.dbOperations;

import com.hibernate.utils.sessionService.HibernateUtils;
import com.scoring.beans.TeamBean;
import com.scoring.globalvariables.TeamMatchVariables;
import com.scoring.repositories.TournamentMatchesRepo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author AuroLed
 */
public class ChoosingMatchOperations implements TournamentMatchesRepo{

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

}
