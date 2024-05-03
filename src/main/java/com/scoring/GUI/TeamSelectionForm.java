/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.GUI;

import com.scoring.beans.MatchDetails;
import com.scoring.dbOperations.ChoosingMatchOperations;
import com.scoring.globalvariables.GlobalVariables;
import com.scoring.globalvariables.TeamMatchVariables;
import com.scoring.services.TeamOperationsAndServices;
import com.scoring.threadOperations.GetAllPlayersThreadOperations;
import java.awt.Color;
import java.awt.PopupMenu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.Popup;

/**
 *
 * @author AuroLed
 */
public class TeamSelectionForm extends javax.swing.JFrame {

    /**
     * Creates new form TeamSelectionForm
     */
    List<String> teamsList = null;
    private String selected_hometeam = null;
    private String selected_awayteam = null;
    private ChoosingMatchOperations matchOperationsInDb;

    public TeamSelectionForm() {
        initComponents();

//        home_team_scrollpane.setVisible(false);
//        away_team_scrollpane.setVisible(false);
        this.setSize(700, 500);
        this.getContentPane().setBackground(new Color(63, 115, 113));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

//        TeamOperationsAndServices teamOperationsAndServices = new TeamOperationsAndServices();
//        teamsList = teamOperationsAndServices.getAllTeamNames();
        teamsList = TeamMatchVariables.teamFullNameList;

        System.out.println("printing data here here ::---------- " + teamsList);

        if (TeamMatchVariables.awayTeam != null & TeamMatchVariables.homeTeam != null) {
            selected_hometeam_field.setText(TeamMatchVariables.homeTeam);
            selected_awayteam_field.setText(TeamMatchVariables.awayTeam);

            selected_awayteam = TeamMatchVariables.awayTeam;
            selected_hometeam = TeamMatchVariables.homeTeam;
        }

        if (teamsList != null) {
            addTeamsToTeamselectionList(teamsList);

        } else {
            this.dispose();
        }

    }

    private void addTeamsToTeamselectionList(List<String> allTeamList) {

        if (allTeamList.size() > 0) {
            DefaultListModel<String> teamListModel = new DefaultListModel<>();

            allTeamList.forEach(teams -> {
                teamListModel.addElement(teams);

            });

            home_team_list.setModel(teamListModel);// = (JList<String>) teamListModel;
            away_team_list.setModel(teamListModel);

//        home_team_scrollpane.add(home_team_list);
//        away_team_scrollpane.add(away_team_list);
//            home_team_scrollpane.setVisible(true);
//            away_team_scrollpane.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "ERROR : No Teams Found, Please Add The Team And Start A Match",
                    "No Teams", JOptionPane.ERROR_MESSAGE);
        }

    }

    
        private void getPlayersOfBothTeam() {

        ArrayList<Integer> teamIdList = new ArrayList<Integer>() {
            {
                add(TeamMatchVariables.homeTeamId);
                add(TeamMatchVariables.awayTeamId);
            }
        };

        ArrayList<String> teamNameList = new ArrayList<String>() {
            {
                add(String.valueOf(TeamMatchVariables.selectedTeamsMap.get(TeamMatchVariables.homeTeam).get("teamShortName")));
                add(String.valueOf(TeamMatchVariables.selectedTeamsMap.get(TeamMatchVariables.awayTeam).get("teamShortName")));
            }
        };

//        allPlayersMap = teamOperationsAndServices.bothTeamPlayers(teamIdList, teamNameList);
//        TeamMatchVariables.bothTeamPlayersGlobalMap = allPlayersMap;
        
         new GetAllPlayersThreadOperations(teamIdList, teamNameList);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home_team_scrollpane = new javax.swing.JScrollPane();
        home_team_list = new javax.swing.JList<>();
        away_team_scrollpane = new javax.swing.JScrollPane();
        away_team_list = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        selected_hometeam_field = new javax.swing.JTextField();
        selected_awayteam_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        team_confirmBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home_team_list.setBackground(new java.awt.Color(116, 153, 152));
        home_team_list.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        home_team_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                home_team_listValueChanged(evt);
            }
        });
        home_team_scrollpane.setViewportView(home_team_list);

        getContentPane().add(home_team_scrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, 230));

        away_team_list.setBackground(new java.awt.Color(116, 153, 152));
        away_team_list.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        away_team_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                away_team_listValueChanged(evt);
            }
        });
        away_team_scrollpane.setViewportView(away_team_list);

        getContentPane().add(away_team_scrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 250, 230));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(135, 30, 1));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose Teams");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 151, 24));
        getContentPane().add(selected_hometeam_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, 30));
        getContentPane().add(selected_awayteam_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 250, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 80, 61));
        jLabel2.setText("VS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 20));

        jLabel3.setText("home team");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setText("away team");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        team_confirmBtn.setBackground(new java.awt.Color(156, 62, 28));
        team_confirmBtn.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        team_confirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        team_confirmBtn.setText("Confirm");
        team_confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                team_confirmBtnActionPerformed(evt);
            }
        });
        getContentPane().add(team_confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_team_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_home_team_listValueChanged
        // TODO add your handling code here:

        selected_hometeam = home_team_list.getSelectedValue();
        selected_hometeam_field.setText(selected_hometeam);
        TeamMatchVariables.homeTeam = selected_hometeam;

    }//GEN-LAST:event_home_team_listValueChanged

    private void team_confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_team_confirmBtnActionPerformed
        // TODO add your handling code here:

        if (selected_hometeam != null && selected_awayteam != null) {

            String hTeamName = String.valueOf(TeamMatchVariables.selectedTeamsMap.get(selected_hometeam).get("teamShortName"));
            String aTeamName = String.valueOf(TeamMatchVariables.selectedTeamsMap.get(selected_awayteam).get("teamShortName"));

            String matchBetween = hTeamName + aTeamName;

            System.out.println("Matches between between ======= " + matchBetween);

            String currentMatchCode = matchBetween;
            String oldMatchCode = null;
            int m_code;

            try {
                oldMatchCode = new ChoosingMatchOperations().getLastUpdateMatchCode(matchBetween);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (oldMatchCode != null) {
                m_code = Integer.valueOf(oldMatchCode.substring(matchBetween.length() - 1));
                m_code += 10;
            } else {
                m_code = 1010;
            }

            currentMatchCode += m_code;

            System.out.println("Current match code is is is ===========" + currentMatchCode);

            TeamMatchVariables.matchCode = currentMatchCode;
            MatchDetails matchDetails = new MatchDetails();

            matchDetails.setMatch_code(currentMatchCode);
            matchDetails.setHome_team_name(hTeamName);
            matchDetails.setHome_team_full_name(selected_hometeam);

            matchDetails.setAway_team_name(aTeamName);
            matchDetails.setAway_team_full_name(selected_awayteam);

            TeamMatchVariables.homeTeamId = Integer.valueOf(String.valueOf(TeamMatchVariables.selectedTeamsMap.get(selected_hometeam).get("teamId")));
            TeamMatchVariables.awayTeamId = Integer.valueOf(String.valueOf(TeamMatchVariables.selectedTeamsMap.get(selected_awayteam).get("teamId")));

            TeamMatchVariables.homeTeamShortName = hTeamName;
            TeamMatchVariables.awayTeamShortName = aTeamName;

            TeamMatchVariables.selectedTeamsObjectMap.put(currentMatchCode, matchDetails);
            getPlayersOfBothTeam();
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(this, "Note : Please Select both The Teams Before Confirming", "No Teams Selected", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_team_confirmBtnActionPerformed

    private void away_team_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_away_team_listValueChanged

        // TODO add your handling code here:
        selected_awayteam = away_team_list.getSelectedValue();
        selected_awayteam_field.setText(selected_awayteam);
        TeamMatchVariables.awayTeam = selected_awayteam;


    }//GEN-LAST:event_away_team_listValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeamSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeamSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeamSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeamSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeamSelectionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> away_team_list;
    private javax.swing.JScrollPane away_team_scrollpane;
    private javax.swing.JList<String> home_team_list;
    private javax.swing.JScrollPane home_team_scrollpane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField selected_awayteam_field;
    private javax.swing.JTextField selected_hometeam_field;
    private javax.swing.JButton team_confirmBtn;
    // End of variables declaration//GEN-END:variables
}
