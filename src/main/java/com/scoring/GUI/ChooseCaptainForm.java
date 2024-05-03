/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.GUI;

import com.scoring.globalvariables.TeamMatchVariables;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author AuroLed
 */
public class ChooseCaptainForm extends javax.swing.JFrame {

    /**
     * Creates new form ChooseCaptainForm
     */
    private String homeTeamCaptain;
    private String homeTeamWicketKeeper;
    private String awayTeamCaptain;
    private String awayTeamWicketKeeper;
    private boolean isSelectCaptainActive = true;

    public ChooseCaptainForm() {
        initComponents();

        this.setSize(850, 700);
        this.getContentPane().setBackground(new Color(63, 115, 113));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        homeTeamCaptain = TeamMatchVariables.homeTeamCaptain;
        awayTeamCaptain = TeamMatchVariables.awayTeamCaptain;
        homeTeamWicketKeeper = TeamMatchVariables.homeTeamWicketKeeper;
        awayTeamWicketKeeper = TeamMatchVariables.awayTeamWicketKeeper;

        addHometeamCaptain();
        addAwayTeamCaptain();
    }

    private void addHometeamCaptain() {

        DefaultListModel<String> homeTeamDefaultListModel = new DefaultListModel<>();

        TeamMatchVariables.selectedPlayersIntoMap.get(TeamMatchVariables.homeTeam).forEach((player) -> {
            if (homeTeamCaptain != null && player.equals(homeTeamCaptain)) {
                homeTeamDefaultListModel.addElement(player + "   (C)");
            } else if (homeTeamCaptain != null && player.equals(homeTeamCaptain)) {
                homeTeamDefaultListModel.addElement(player + "   (WK)");
            } else {
                homeTeamDefaultListModel.addElement(player);
            }

        });
        home_choose_CaptainList.setModel(homeTeamDefaultListModel);
    }

    private void addAwayTeamCaptain() {

        DefaultListModel<String> awayTeamDefaultListModel = new DefaultListModel<>();

        TeamMatchVariables.selectedPlayersIntoMap.get(TeamMatchVariables.awayTeam).forEach((player) -> {

            if (awayTeamCaptain != null && player.equals(awayTeamCaptain)) {
                awayTeamDefaultListModel.addElement(player + "   (C)");
            } else if (awayTeamWicketKeeper != null && player.equals(awayTeamWicketKeeper)) {
                awayTeamDefaultListModel.addElement(player + "   (WK)");
            } else {
                awayTeamDefaultListModel.addElement(player);
            }
        });

        away_choosse_captainList.setModel(awayTeamDefaultListModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        away_choosse_captainList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        home_choose_CaptainList = new javax.swing.JList<>();
        choose_captainHeader = new javax.swing.JLabel();
        choose_optionType = new javax.swing.JLabel();
        choose_captainBtn = new javax.swing.JButton();
        choose_wkBtn = new javax.swing.JButton();
        submt_captainBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        away_choosse_captainList.setBackground(new java.awt.Color(116, 153, 152));
        away_choosse_captainList.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        away_choosse_captainList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                away_choosse_captainListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(away_choosse_captainList);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 250, 350));

        home_choose_CaptainList.setBackground(new java.awt.Color(116, 153, 152));
        home_choose_CaptainList.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        home_choose_CaptainList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                home_choose_CaptainListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(home_choose_CaptainList);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 250, 350));

        choose_captainHeader.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        choose_captainHeader.setForeground(new java.awt.Color(255, 232, 140));
        choose_captainHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choose_captainHeader.setText("Choose Captain");
        getContentPane().add(choose_captainHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 230, 32));

        choose_optionType.setText("Select Captain From Both The Teams");
        getContentPane().add(choose_optionType, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 180, -1));

        choose_captainBtn.setText("Choose Captain");
        choose_captainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_captainBtnActionPerformed(evt);
            }
        });
        getContentPane().add(choose_captainBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 150, 30));

        choose_wkBtn.setText("Choose WK");
        choose_wkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_wkBtnActionPerformed(evt);
            }
        });
        getContentPane().add(choose_wkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 150, 30));

        submt_captainBtn.setText("SUBMIT");
        submt_captainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submt_captainBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submt_captainBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 210, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void away_choosse_captainListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_away_choosse_captainListValueChanged
        // TODO add your handling code here:
        if (isSelectCaptainActive) {
            awayTeamCaptain = away_choosse_captainList.getSelectedValue();
        } else {
            awayTeamWicketKeeper = away_choosse_captainList.getSelectedValue();
        }

        addAwayTeamCaptain();
    }//GEN-LAST:event_away_choosse_captainListValueChanged

    private void home_choose_CaptainListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_home_choose_CaptainListValueChanged
        // TODO add your handling code here:

        if (isSelectCaptainActive) {
            homeTeamCaptain = home_choose_CaptainList.getSelectedValue();
        } else {
            homeTeamWicketKeeper = home_choose_CaptainList.getSelectedValue();
        }

        addHometeamCaptain();

    }//GEN-LAST:event_home_choose_CaptainListValueChanged

    private void choose_captainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose_captainBtnActionPerformed
        // TODO add your handling code here:

        choose_optionType.setText("Select Captain From Both The Teams");
        choose_captainHeader.setText("Choose Captain");
        isSelectCaptainActive = true;

    }//GEN-LAST:event_choose_captainBtnActionPerformed

    private void choose_wkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose_wkBtnActionPerformed
        // TODO add your handling code here:
        choose_optionType.setText("Select Wicket Keeper(WK) From Both The Teams");
        choose_captainHeader.setText("Choose Wicket Keeper");
        isSelectCaptainActive = false;
    }//GEN-LAST:event_choose_wkBtnActionPerformed

    private void submt_captainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submt_captainBtnActionPerformed
        // TODO add your handling code here:

        TeamMatchVariables.homeTeamCaptain = homeTeamCaptain;
        TeamMatchVariables.awayTeamCaptain = awayTeamCaptain;
        TeamMatchVariables.homeTeamWicketKeeper = homeTeamWicketKeeper;
        TeamMatchVariables.awayTeamWicketKeeper = awayTeamWicketKeeper;
        
        
    }//GEN-LAST:event_submt_captainBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ChooseCaptainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseCaptainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseCaptainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseCaptainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseCaptainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> away_choosse_captainList;
    private javax.swing.JButton choose_captainBtn;
    private javax.swing.JLabel choose_captainHeader;
    private javax.swing.JLabel choose_optionType;
    private javax.swing.JButton choose_wkBtn;
    private javax.swing.JList<String> home_choose_CaptainList;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton submt_captainBtn;
    // End of variables declaration//GEN-END:variables

}
