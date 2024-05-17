/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.GUI.panels;

import com.scoring.globalvariables.GlobalVariables;
import java.awt.Color;

/**
 *
 * @author AuroLed
 */
public class MainScoringPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainScoringPanel
     */
    public MainScoringPanel() {
        
        initComponents();
        
        this.setVisible(true);
        this.setBackground(new Color(66, 125, 102));
        this.setBounds(50, 50, 1200, 620);
        
        scoring_setting_panel.add(new SelectBatsmenPanel());
        
        Batting_team.setText(GlobalVariables.firstInningsBattingTeam);
        Bowling_team.setText(GlobalVariables.firstInningsBowlingTeam);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Bowling_team = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        first_batterPanel = new javax.swing.JPanel();
        first_batterPanel1 = new javax.swing.JPanel();
        second_batterPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Batting_team = new javax.swing.JTextField();
        current_bowler = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        scoring_setting_panel = new javax.swing.JPanel();
        enter_runs_panel = new javax.swing.JPanel();
        runs_entered_field = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        score_info_panel = new javax.swing.JPanel();
        run_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        run_field1 = new javax.swing.JTextField();
        run_field2 = new javax.swing.JTextField();
        run_field3 = new javax.swing.JTextField();
        run_field4 = new javax.swing.JTextField();
        run_field5 = new javax.swing.JTextField();
        run_field6 = new javax.swing.JTextField();
        entered_optionField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        run_field7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        run_field8 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Scoring First Innings");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 160, 22));
        add(Bowling_team, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 300, 30));

        jLabel2.setText("Batting Team :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 80, 30));

        first_batterPanel.setBackground(new java.awt.Color(153, 255, 153));
        first_batterPanel.setLayout(new javax.swing.BoxLayout(first_batterPanel, javax.swing.BoxLayout.LINE_AXIS));

        first_batterPanel1.setBackground(new java.awt.Color(153, 255, 153));
        first_batterPanel1.setLayout(new javax.swing.BoxLayout(first_batterPanel1, javax.swing.BoxLayout.LINE_AXIS));
        first_batterPanel.add(first_batterPanel1);

        add(first_batterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 700, 30));

        second_batterPanel.setBackground(new java.awt.Color(153, 255, 153));
        second_batterPanel.setLayout(new javax.swing.BoxLayout(second_batterPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(second_batterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 700, 30));

        jLabel3.setText("Bowling Team :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 80, 20));
        add(Batting_team, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 300, 30));

        current_bowler.setBackground(new java.awt.Color(153, 153, 255));
        current_bowler.setLayout(new javax.swing.BoxLayout(current_bowler, javax.swing.BoxLayout.LINE_AXIS));
        add(current_bowler, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 700, 30));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 700, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 1100, 10));

        scoring_setting_panel.setBackground(new java.awt.Color(204, 204, 204));
        scoring_setting_panel.setLayout(new java.awt.GridBagLayout());
        add(scoring_setting_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 1100, 300));

        enter_runs_panel.setBackground(new java.awt.Color(255, 255, 102));
        enter_runs_panel.setMinimumSize(new java.awt.Dimension(220, 60));
        enter_runs_panel.setName(""); // NOI18N
        enter_runs_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        enter_runs_panel.add(runs_entered_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 30, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Enter Runs");
        enter_runs_panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 20));

        add(enter_runs_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 90, -1));

        score_info_panel.setBackground(new java.awt.Color(255, 204, 153));
        score_info_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        run_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        run_field.setText("V");
        run_field.setPreferredSize(new java.awt.Dimension(20, 25));
        score_info_panel.add(run_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 20, -1));

        jLabel4.setText("VIEW INNINGS : ");
        score_info_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 90, 25));

        jLabel5.setText("RUN :");
        score_info_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 25));

        jLabel6.setText("EXTRAS :");
        score_info_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 50, 25));

        jLabel7.setText("SIX :");
        score_info_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 30, 25));

        jLabel8.setText("FOUR :");
        score_info_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 40, 25));

        jLabel9.setText("WICKET : ");
        score_info_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 50, 25));

        jLabel10.setText("DOT :");
        score_info_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 30, 25));

        run_field1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        run_field1.setText("R");
        run_field1.setPreferredSize(new java.awt.Dimension(20, 25));
        score_info_panel.add(run_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 20, -1));

        run_field2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        run_field2.setText("E");
        run_field2.setPreferredSize(new java.awt.Dimension(20, 25));
        score_info_panel.add(run_field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 20, -1));

        run_field3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        run_field3.setText("S");
        run_field3.setPreferredSize(new java.awt.Dimension(20, 25));
        score_info_panel.add(run_field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 20, -1));

        run_field4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        run_field4.setText("F");
        run_field4.setPreferredSize(new java.awt.Dimension(20, 25));
        score_info_panel.add(run_field4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 20, -1));

        run_field5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        run_field5.setText("W");
        run_field5.setPreferredSize(new java.awt.Dimension(20, 25));
        score_info_panel.add(run_field5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 20, -1));

        run_field6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        run_field6.setText("D");
        run_field6.setPreferredSize(new java.awt.Dimension(20, 25));
        score_info_panel.add(run_field6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 20, -1));
        score_info_panel.add(entered_optionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 30, 30));

        jLabel11.setText("Choose Option Here : ");
        score_info_panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 110, 30));

        jLabel12.setText("END INNINGS :");
        score_info_panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, 25));

        run_field7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        run_field7.setText("T");
        run_field7.setPreferredSize(new java.awt.Dimension(20, 25));
        score_info_panel.add(run_field7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 20, -1));

        jLabel13.setText("UNDO :");
        score_info_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 50, 25));

        run_field8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        run_field8.setText("U");
        run_field8.setPreferredSize(new java.awt.Dimension(20, 25));
        score_info_panel.add(run_field8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 20, -1));

        add(score_info_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 170, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Batting_team;
    private javax.swing.JTextField Bowling_team;
    private javax.swing.JPanel current_bowler;
    private javax.swing.JPanel enter_runs_panel;
    private javax.swing.JTextField entered_optionField;
    private javax.swing.JPanel first_batterPanel;
    private javax.swing.JPanel first_batterPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField run_field;
    private javax.swing.JTextField run_field1;
    private javax.swing.JTextField run_field2;
    private javax.swing.JTextField run_field3;
    private javax.swing.JTextField run_field4;
    private javax.swing.JTextField run_field5;
    private javax.swing.JTextField run_field6;
    private javax.swing.JTextField run_field7;
    private javax.swing.JTextField run_field8;
    private javax.swing.JTextField runs_entered_field;
    private javax.swing.JPanel score_info_panel;
    private javax.swing.JPanel scoring_setting_panel;
    private javax.swing.JPanel second_batterPanel;
    // End of variables declaration//GEN-END:variables
}
