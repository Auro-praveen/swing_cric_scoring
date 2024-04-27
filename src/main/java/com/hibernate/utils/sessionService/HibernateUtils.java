/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.utils.sessionService;

import com.scoring.beans.CurrentMatchPlayers;
import com.scoring.beans.FirstInningsBatting;
import com.scoring.beans.FirstInningsBowling;
import com.scoring.beans.MatchDetails;
import com.scoring.beans.PlayersBean;
import com.scoring.beans.SecondInningsBatting;
import com.scoring.beans.SecondInningsBowling;
import com.scoring.beans.SuperOverBatting;
import com.scoring.beans.SuperOverBowling;
import com.scoring.beans.SuperOvers;
import com.scoring.beans.TeamBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author AuroLed
 */
public class HibernateUtils {
    
    private static SessionFactory sessionFactory = null;
   
    
    static {
        
        System.out.println("called here before initializing");
        
        sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(TeamBean.class)
                .addAnnotatedClass(PlayersBean.class)
                .addAnnotatedClass(SuperOvers.class)
                .addAnnotatedClass(SuperOverBatting.class)
                .addAnnotatedClass(SuperOverBowling.class)
                .addAnnotatedClass(MatchDetails.class)
                .addAnnotatedClass(CurrentMatchPlayers.class)
                .addAnnotatedClass(FirstInningsBatting.class)
                .addAnnotatedClass(FirstInningsBowling.class)
                .addAnnotatedClass(SecondInningsBatting.class)
                .addAnnotatedClass(SecondInningsBowling.class)

                .buildSessionFactory();
    }
    
    public static Session getSession() {
        return sessionFactory.openSession();
    }
    
}
