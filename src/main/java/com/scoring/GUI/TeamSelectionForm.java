/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.GUI;

import com.scoring.services.TeamOperationsAndServices;
import java.awt.Color;
import java.awt.PopupMenu;
import java.util.List;
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

    public TeamSelectionForm() {
        initComponents();

//        home_team_scrollpane.setVisible(false);
//        away_team_scrollpane.setVisible(false);

        this.setSize(800, 500);
        this.getContentPane().setBackground(new Color(63, 115, 113));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        TeamOperationsAndServices teamOperationsAndServices = new TeamOperationsAndServices();
        teamsList = teamOperationsAndServices.getAllTeamNames();

        addTeamsToTeamselectionList(teamsList);

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
            JOptionPane.showMessageDialog(this, "ERROR : No Teams Found, Please Add The Team And Start A Match", "No Teams", JOptionPane.ERROR_MESSAGE);
        }

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home_team_list.setBackground(new java.awt.Color(116, 153, 152));
        home_team_list.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        home_team_scrollpane.setViewportView(home_team_list);

        getContentPane().add(home_team_scrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, 160, 230));

        away_team_list.setBackground(new java.awt.Color(116, 153, 152));
        away_team_list.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        away_team_scrollpane.setViewportView(away_team_list);

        getContentPane().add(away_team_scrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 160, 230));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(176, 11, 66));
        jLabel1.setText("Choose Teams");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 11, 151, 24));
        getContentPane().add(selected_hometeam_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 160, -1));
        getContentPane().add(selected_awayteam_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 160, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("VS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, 20));

        jLabel3.setText("home team");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setText("away team");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    // End of variables declaration//GEN-END:variables
}
