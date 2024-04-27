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

        String query = "SELECT match_code FROM MatchDetails WHERE match_code LIKE :matchName ORDER BY match_code DESC 1 LIMIT 1";

        String matchCode = null;

        try {
            session.beginTransaction();
            matchCode = (String) session.createQuery(query).setParameter("matchName", match_between).getSingleResult();

        } catch (NullPointerException e) {
            System.out.println("No Data Present In The Database Or Database is Empty");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return matchCode;

    }

}
