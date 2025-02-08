/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.GUI.panels;

import com.scoring.globalvariables.GlobalPanels;
import com.scoring.globalvariables.GlobalVariables;
import com.scoring.globalvariables.InningsGlobalVariable;
import com.scoring.globalvariables.TeamMatchVariables;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author AuroLed
 */
public class SelectBatsmentAsLebel extends javax.swing.JPanel {

    /**
     * Creates new form SelectBatsmentAsLebel
     */
    private String nonStrikerBatsman = null;
    private String strikerBatsman = null;
    private String currentBowler = null;
    private String miniOverBowler = null;
    public int selectedPlayerNum;
    private JPanel selectionPanel = null;
    private JPanel afterSelectionInfoPanel = null;
//    private JLabel selectinoHeadLabel = new JLabel();

    private String chooseType = null;
    private String loadType = "BATSMAN";
    
    private ArrayList<String> batPlayersList = new ArrayList<>();

//    private ArrayList<String> batPlayersList = new ArrayList<String>() {
//        {
//            add("sd");
//            add("asdf");
//            add("sdddd");
//            add("sd");
//            add("sdas");
//            add("asdfas");
//            add("sddddas");
//            add("sdas");
//            add("sdre");
//            add("asdfre");
//            add("sddddre");
//            add("sdere");
//            add("sdash");
//            add("sdreh");
//            add("asdfreh");
//            add("sddddreh");
//        }
//    };

    public SelectBatsmentAsLebel(String chooseType) {
        initComponents();
        this.setVisible(true);
        this.setBackground(new Color(125, 168, 151));
        this.setBounds(50, 50, 1000, 250);

        this.chooseType = chooseType;

//        if (InningsGlobalVariable.strikerBatsman != null) {
//            this.strikerBatsman = InningsGlobalVariable.strikerBatsman;
//        } 
//        
//        if (InningsGlobalVariable.nonStrikerBatsman != null) {
//            this.nonStrikerBatsman = InningsGlobalVariable.nonStrikerBatsman;
//        }
//        
//        if (InningsGlobalVariable.currentBowlerName != null) {
//            this.currentBowler = currentBowler;
//        }
//        this.setLayout(new AbsoluteLayout());
//
//        batsmenset_scrollPane1.setVisible(false);
//        batsmenset_scrollPane2.setVisible(false);
//        batsmenset_scrollPane3.setVisible(false);
//        batPlayersList = TeamMatchVariables.selectedPlayersShortNameIntoMap.get(GlobalVariables.firstInningsBattingTeam);
        switch (chooseType) {

            case "STRIKER_BAT":  // for selecting a striker batsman

                selection_header_label.setText("Select Batsman At The Striker End");
                batPlayersList = TeamMatchVariables.selectedPlayersIntoMap.get(GlobalVariables.firstInningsBattingTeam);

                break;

            case "NONSTRIKER_BAT":  // for selecting a non-striker batsman
                selection_header_label.setText("Select Batsman At The Non-Striker End");
                batPlayersList = TeamMatchVariables.selectedPlayersIntoMap.get(GlobalVariables.firstInningsBattingTeam);
                break;

            case "BOWLER":      // for selecting a bowler

                selection_header_label.setText("Select Bowler");
                batPlayersList = TeamMatchVariables.selectedPlayersIntoMap.get(GlobalVariables.firstInningsBowlingTeam);
                loadType = "BOWLER";
                break;

            case "MINI_OVER_BOWLER":    // this will be selected when there is new Bowler for the mini over

                selection_header_label.setText("Select Bowler For Mini Over");
                batPlayersList = TeamMatchVariables.selectedPlayersIntoMap.get(GlobalVariables.firstInningsBowlingTeam);
                break;
            case "START_INNINGS":       // TODO its for selecting both batsment, and a bowler at the beginning of the innings

                selection_header_label.setText("Select Batsman At The Striker End");
                
                batPlayersList = TeamMatchVariables.selectedPlayersIntoMap.get(GlobalVariables.firstInningsBattingTeam);

                break;
        }

        loadTheBatsmen(loadType);
    }

    public void loadTheBatsmen(String type) {
        
        System.out.println("called here again");

        int count = 1;

        int numberLabelHeightPos = 30;
        int numberLabelWidthPos = 20;

//        int playerNameLabelHeight = 0;
        int playerNameLabelWidthPos = 41;
        int commonLabelHeight = 30;
        int commonNumLabelWidth = 50;

        int commonPlayerLabelWidth = 150;

//        selectionPanel.setBounds(10, 10, 980, 180);

        selectionPanel =  new JPanel(new AbsoluteLayout());
        selectionPanel.setBackground(new Color(125, 168, 151));

        for (int i = 0; i < batPlayersList.size(); i++) {

            JLabel numberLabel = new JLabel();
            JLabel playerNameLabel = new JLabel();

            if (String.valueOf(i + 1).length() == 1) {
                numberLabel.setText("0" + String.valueOf(i + 1));
            } else {
                numberLabel.setText(String.valueOf(i + 1));
            }

            playerNameLabel.setText(batPlayersList.get(i));

//            numberLabel.setVisible(true);
//            playerNameLabel.setVisible(true);
            playerNameLabel.setText(batPlayersList.get(i));

            if (count >= 4) {

//                numberLabel.setBounds(numberLabelWidthPos, numberLabelHeightPos, commonNumLabelWidth, commonLabelHeight);
//
//                playerNameLabel.setBounds(playerNameLabelWidthPos, numberLabelHeightPos, commonPlayerLabelWidth, commonLabelHeight);
                selectionPanel.add(numberLabel, new AbsoluteConstraints(numberLabelWidthPos, numberLabelHeightPos, commonNumLabelWidth, commonLabelHeight));
                selectionPanel.add(playerNameLabel, new AbsoluteConstraints(playerNameLabelWidthPos, numberLabelHeightPos, commonPlayerLabelWidth, commonLabelHeight));
                count = 1;
                numberLabelHeightPos = 30;

                // for number label
                numberLabelWidthPos += commonNumLabelWidth + commonPlayerLabelWidth + 30;

                playerNameLabelWidthPos = commonNumLabelWidth + commonPlayerLabelWidth + playerNameLabelWidthPos + 30 + 4;

            } else {

//                numberLabel.setBounds(numberLabelWidthPos, numberLabelHeightPos, commonNumLabelWidth, commonLabelHeight);
//
//                playerNameLabel.setBounds(playerNameLabelWidthPos, numberLabelHeightPos, commonPlayerLabelWidth, commonLabelHeight);
                selectionPanel.add(numberLabel, new AbsoluteConstraints(numberLabelWidthPos, numberLabelHeightPos, commonNumLabelWidth, commonLabelHeight));
                selectionPanel.add(playerNameLabel, new AbsoluteConstraints(playerNameLabelWidthPos, numberLabelHeightPos, commonPlayerLabelWidth, commonLabelHeight));

                numberLabelHeightPos += 31;
                count += 1;
            }
        }

        this.add(selectionPanel, new AbsoluteConstraints(10, 10, 980, 200));

    }

    private void onSelectPlayers(String selectedPlayer) {

        selectionPanel.setVisible(false);

        value_entered.setText("");

        JLabel selectInfoLebel = new JLabel();
        JButton selectButton = new JButton();

        switch (chooseType) {

            case "STRIKER_BAT":  // for selecting a striker batsman

                strikerBatsman = selectedPlayer;

                InningsGlobalVariable.prevOutBatsman = InningsGlobalVariable.strikerBatsman;

                InningsGlobalVariable.strikerBatsman = strikerBatsman;

                selectInfoLebel.setText("Selected Batsman : " + selectedPlayer);

                selectButton.setText("Continue");

                break;

            case "NONSTRIKER_BAT":  // for selecting a non-striker batsman

                nonStrikerBatsman = selectedPlayer;

                InningsGlobalVariable.prevOutBatsman = InningsGlobalVariable.nonStrikerBatsman;

                InningsGlobalVariable.nonStrikerBatsman = nonStrikerBatsman;

                selectInfoLebel.setText("Selected Batsman : " + selectedPlayer);
                selectButton.setText("Continue");
                break;

            case "BOWLER":      // for selecting a bowler

                currentBowler = selectedPlayer;

                InningsGlobalVariable.previousBowlerName = InningsGlobalVariable.currentBowlerName;

                InningsGlobalVariable.currentBowlerName = currentBowler;

                selectInfoLebel.setText("Selected Bowler : " + selectedPlayer);
                selectButton.setText("Continue");
                break;

            case "MINI_OVER_BOWLER":    // this will be selected when there is new Bowler for the mini over

                miniOverBowler = selectedPlayer;

                InningsGlobalVariable.miniOverBowlerName = miniOverBowler;

                selectInfoLebel.setText("Selected Mini Over Bowler : " + selectedPlayer);
                selectButton.setText("Continue");
                break;
            case "START_INNINGS":       // TODO its for selecting both batsment, and a bowler at the beginning of the innings

                if (strikerBatsman == null) {

                    strikerBatsman = selectedPlayer;
                    InningsGlobalVariable.strikerBatsman = strikerBatsman;

                    selectInfoLebel.setText("Selected Batsman at Striker End : " + selectedPlayer);
                    selectButton.setText("Select Non-Striker");

                } else if (nonStrikerBatsman == null) {
                    nonStrikerBatsman = selectedPlayer;
                    InningsGlobalVariable.nonStrikerBatsman = nonStrikerBatsman;

                    selectInfoLebel.setText("Selected Batsman at non Striker End : " + selectedPlayer);
                    
                    batPlayersList = TeamMatchVariables.selectedPlayersIntoMap.get(GlobalVariables.firstInningsBowlingTeam);
                    
                    selectButton.setText("Select Bowler");
                } else if (currentBowler == null) {
                    currentBowler = selectedPlayer;
                    InningsGlobalVariable.currentBowlerName = currentBowler;

                    selectInfoLebel.setText("Selected Batsman at non Striker End : " + selectedPlayer);
                    selectButton.setText("Continue");
                }

                break;
        }

//        selectInfoLebel.setBounds(10, 10, 250, 40);
//        selectButton.setBounds(10, 52, 250, 25);
        value_entered.setVisible(false);
        
        afterSelectionInfoPanel = new JPanel(new AbsoluteLayout());

        afterSelectionInfoPanel.add(selectInfoLebel, new AbsoluteConstraints(30, 10, 250, 40));
        afterSelectionInfoPanel.add(selectButton, new AbsoluteConstraints(50, 52, 250, 30));

        this.add(afterSelectionInfoPanel, new AbsoluteConstraints(400, 50, 350, 60 + 25 + 5));

//        if (chooseType == "STRIKER_BAT") { //  for selecting a striker batsman
//
//        } else if (chooseType == "NONSTRIKER_BAT") {    // for selecting a non striker batsman
//
//        } else if (chooseType == "BOWLER") { // for selecting a bowler
//
//        } else if (chooseType == "MINI_OVER_BOWLER") { // this will be selected when there is new Bowler for the mini over
//
//        } else if (chooseType == "START_INNINGS") {  // TODO its for selecting both batsment, and a bowler at the beginning of the innings
//
//        }
        // for handling the events after selecting the players 
        
        selectButton.addActionListener((e) -> {

            System.out.println("Clicked HERE");

            if (chooseType.equals("START_INNINGS")) {
                if (strikerBatsman == null) {
                    selection_header_label.setText("Select Batsman At The Striker End");
                    clearTheSelectionPanels(loadType);
                } else if (nonStrikerBatsman == null) {
                    selection_header_label.setText("Select Batsman At The Non-Striker End");
                    clearTheSelectionPanels(loadType);
                } else if (currentBowler == null) {
                    selection_header_label.setText("Select Bowler");
                    clearTheSelectionPanels("BOWLER");
                } else {
                    this.setVisible(false);
                    GlobalPanels.main_score_type_panel.setVisible(true);
                }
            } else {
                this.setVisible(false);
                GlobalPanels.main_score_type_panel.setVisible(true);
            }

        });

    }

    public void clearTheSelectionPanels(String type) {
        
        value_entered.setVisible(true);
        afterSelectionInfoPanel.removeAll();
        
        afterSelectionInfoPanel.setVisible(false);
        this.remove(afterSelectionInfoPanel);
//        loadTheBatsmen(type);
        selectionPanel.removeAll();
        this.remove(selectionPanel);
        loadTheBatsmen(type);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        value_entered = new javax.swing.JTextField();
        selection_header_label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        value_entered.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                value_enteredKeyReleased(evt);
            }
        });
        add(value_entered, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 40, 30));

        selection_header_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        selection_header_label.setForeground(new java.awt.Color(23, 23, 251));
        selection_header_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selection_header_label.setText("jLabel1");
        add(selection_header_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 280, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void value_enteredKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_value_enteredKeyReleased
        // TODO add your handling code here:

        String selectedTextFomUserEntered = value_entered.getText();

        if (selectedTextFomUserEntered.length() > 1) {
            selectedPlayerNum = Integer.valueOf(value_entered.getText());
        }

        String selectedPlayerName = null;

        if (value_entered.getText().length() == 2) {
            selectedPlayerName = batPlayersList.get(selectedPlayerNum - 1);
            onSelectPlayers(selectedPlayerName);
        }

        System.out.println("Selected Player is ==== " + strikerBatsman);

    }//GEN-LAST:event_value_enteredKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel selection_header_label;
    private javax.swing.JTextField value_entered;
    // End of variables declaration//GEN-END:variables
}
