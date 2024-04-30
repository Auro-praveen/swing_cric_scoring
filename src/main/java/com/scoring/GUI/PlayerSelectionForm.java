/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.GUI;

import com.scoring.beans.CurrentMatchPlayers;
import com.scoring.beans.PlayersBean;
import com.scoring.globalvariables.TeamMatchVariables;
import com.scoring.reference.bean.BothTeamPlayers;
import com.scoring.reference.bean.IndividualPlayerBean;
import com.scoring.services.TeamOperationsAndServices;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AuroLed
 */
public class PlayerSelectionForm extends javax.swing.JFrame {

    /**
     * Creates new form PlayerSelectionForm
     */
    private String selectedTeamToAddPlayers = null;
    private TeamOperationsAndServices teamOperationsAndServices = new TeamOperationsAndServices();
    private Map<String, ArrayList<PlayersBean>> allPlayersMap = new HashMap<>();
//    private BothTeamPlayers bothTeamPlayersBean = new BothTeamPlayers();
    private ArrayList<PlayersBean> playersBeanList;
    private String selectedPlayer = null;
    private Map<String, ArrayList<CurrentMatchPlayers>> selectedPlayersMapList = new HashMap<>();

    private PlayersBean playerBeanObject = null;
    

//    private ArrayList<CurrentMatchPlayers> currentSelectedPlayersList;
    private Map<String, ArrayList<String>> selectedPlayersIntoMap = new HashMap<>();

    public PlayerSelectionForm() {
        initComponents();

        this.setSize(700, 500);
        this.getContentPane().setBackground(new Color(63, 115, 113));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        getPlayersOfBothTeam();

        addTeamsToSelectionList();

        selectedPlayersMapList.put(TeamMatchVariables.homeTeam, new ArrayList<CurrentMatchPlayers>());
        selectedPlayersMapList.put(TeamMatchVariables.awayTeam, new ArrayList<CurrentMatchPlayers>());
    }

    // get all theplayers from the both the playing team
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
        
        System.out.println();
        System.out.println("Before calling the bothTeamPlayers function from the playerselectionfrom ==============");
        
        allPlayersMap = teamOperationsAndServices.bothTeamPlayers(teamIdList, teamNameList);
        TeamMatchVariables.bothTeamPlayersGlobalMap = allPlayersMap;
    }

    // to add the Teams to team selection list to add players for them
    private void addTeamsToSelectionList() {

        DefaultListModel<String> defaultListModel = new DefaultListModel<>();

        defaultListModel.addElement(TeamMatchVariables.homeTeam);
        defaultListModel.addElement(TeamMatchVariables.awayTeam);

        selectedTeamToAddPlayers = TeamMatchVariables.homeTeam;

        team_selection_list.setModel(defaultListModel);
        team_selection_list.setSelectedIndex(0);

        selectedTeamToAddPlayers = TeamMatchVariables.homeTeam;

//        currentSelectedPlayersList = selectedPlayersMapList.get(selectedTeamToAddPlayers);
        addPlayersToList(TeamMatchVariables.homeTeam);
    }

    // to add all the players to list of selected team type
    private void addPlayersToList(String teamName) {
        
        System.out.println("team name is is  ::== "+teamName);
        
        System.out.println("Players bean list is is is ::======= " + allPlayersMap);

        playersBeanList = allPlayersMap.get(TeamMatchVariables.selectedTeamsMap.get(teamName).get("teamShortName"));
        DefaultListModel<String> defaultListModel = new DefaultListModel<>();
        
        System.out.println("Players bean list is is is ::======= " + playersBeanList.size());

        playersBeanList.forEach((PlayersBean players) -> {
            defaultListModel.addElement(players.getJersey_no() + "   " + players.getPlayer_full_name());
        });

//        bothTeamPlayersBean.getTeamPlayers().forEach((IndividualPlayerBean individualPlayersBean) -> {
//            defaultListModel.addElement(individualPlayersBean.getJerseyNo() + "   " + individualPlayersBean.getFullName());
//        });
        selected_players_list.setModel(defaultListModel);
    }

    private boolean playersOperations(String operType, String player) {

        boolean operationComplete = true;

        try {
            CurrentMatchPlayers currentPlayers = new CurrentMatchPlayers(playerBeanObject.getJersey_no(),
                    playerBeanObject.getPlayer_name(), playerBeanObject.getPlayer_full_name(), playerBeanObject.getBatting_hand(),
                    playerBeanObject.getTeamBean().getTeam_name(), playerBeanObject.getBowling_type(), TeamMatchVariables.matchCode, playerBeanObject.getTeamBean().getTeam_full_name());

            ArrayList<CurrentMatchPlayers> currentMatchPlayersList = selectedPlayersMapList.get(selectedTeamToAddPlayers);

            if (operType == "ADD") {
                currentMatchPlayersList.add(currentPlayers);

            } else if (operType == "REMOVE") {

                currentMatchPlayersList.remove(currentMatchPlayersList);

            } else {
                currentMatchPlayersList.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            operationComplete = true;
        }

        return operationComplete;
    }

    private void addPlayersToSelectedList() {
        
        DefaultListModel<String> defaultPlayerList = new DefaultListModel<>();
        
        selectedPlayersIntoMap.get(selectedTeamToAddPlayers).forEach( (teamPlayers) -> {
            defaultPlayerList.addElement(teamPlayers);
        } );
        
        selected_players_list.setModel(defaultPlayerList);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player_selection_panel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        team_selection_list = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        selected_players_list = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        player_selectionList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        add_playersBtn = new javax.swing.JButton();
        remove_playersBtn = new javax.swing.JButton();
        remove_allBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        player_selection_panel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        player_selection_panel.setForeground(new java.awt.Color(135, 30, 1));
        player_selection_panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player_selection_panel.setText("Choose Players Here");
        getContentPane().add(player_selection_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 230, 32));

        team_selection_list.setBackground(new java.awt.Color(116, 153, 152));
        team_selection_list.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        team_selection_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                team_selection_listValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(team_selection_list);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, 60));

        selected_players_list.setBackground(new java.awt.Color(116, 153, 152));
        selected_players_list.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        selected_players_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selected_players_listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(selected_players_list);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 250, 350));

        jLabel1.setText("Select Team");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 20));

        jLabel2.setText("Players");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        player_selectionList.setBackground(new java.awt.Color(116, 153, 152));
        player_selectionList.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        player_selectionList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                player_selectionListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(player_selectionList);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, 350));

        jLabel3.setText("Selected Players");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 140, 20));

        add_playersBtn.setText("Add Player");
        add_playersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_playersBtnActionPerformed(evt);
            }
        });
        getContentPane().add(add_playersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 213, 120, 40));

        remove_playersBtn.setText("Remove Player");
        getContentPane().add(remove_playersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 293, 120, 40));

        remove_allBtn.setText("Clear Selected List");
        remove_allBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_allBtnActionPerformed(evt);
            }
        });
        getContentPane().add(remove_allBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 383, -1, 40));

        confirmBtn.setText("CONFIRM");
        getContentPane().add(confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void team_selection_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_team_selection_listValueChanged
        // TODO add your handling code here:

        selectedTeamToAddPlayers = team_selection_list.getSelectedValue();

        addPlayersToList(selectedTeamToAddPlayers);

//        currentSelectedPlayersList = selectedPlayersMapList.get(selectedTeamToAddPlayers);

    }//GEN-LAST:event_team_selection_listValueChanged

    private void remove_allBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_allBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remove_allBtnActionPerformed

    private void player_selectionListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_player_selectionListValueChanged
        // TODO add your handling code here:

        selectedPlayer = player_selectionList.getSelectedValue();

    }//GEN-LAST:event_player_selectionListValueChanged

    private void add_playersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_playersBtnActionPerformed
        // TODO add your handling code here:
        
        ArrayList<String> selectedPlArrayList = selectedPlayersIntoMap.get(selectedTeamToAddPlayers);

        if (selectedPlayer != null) {

            if (!selectedPlArrayList.contains(selectedPlayer)) {

                selectedPlArrayList.add(selectedPlayer);

                for (PlayersBean playersBean : playersBeanList) {
                    if (playersBean.getJersey_no() == Integer.valueOf(selectedPlayer.substring(0, selectedPlayer.indexOf(' ')))) {
                        playerBeanObject = playersBean;

                        break;
                    }
                }

                boolean isOperatinoCompleted = playersOperations("ADD", selectedPlayer);

                if (isOperatinoCompleted) {
                    addPlayersToSelectedList();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Player Already Exists Try Adding Different Players", "Player Alredy Exists", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select The Player That You Want To Add To The Team", "No Player Selected", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_add_playersBtnActionPerformed

    private void selected_players_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_selected_players_listValueChanged
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_selected_players_listValueChanged

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
            java.util.logging.Logger.getLogger(PlayerSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerSelectionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_playersBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> player_selectionList;
    private javax.swing.JLabel player_selection_panel;
    private javax.swing.JButton remove_allBtn;
    private javax.swing.JButton remove_playersBtn;
    private javax.swing.JList<String> selected_players_list;
    private javax.swing.JList<String> team_selection_list;
    // End of variables declaration//GEN-END:variables
}
