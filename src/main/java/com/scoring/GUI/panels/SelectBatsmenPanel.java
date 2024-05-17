/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.GUI.panels;

import com.scoring.beans.CurrentMatchPlayers;
import com.scoring.globalvariables.GlobalVariables;
import com.scoring.globalvariables.TeamMatchVariables;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AuroLed
 */
public class SelectBatsmenPanel extends javax.swing.JPanel {

    /**
     * Creates new form SelectBatsmentPanel
     */
    public String selectedBatsmen = null;

    public String selectedChar = null;
    private JPanel selectionPanel = new JPanel();

    private ArrayList<String> batPlayersList = new ArrayList<>();

    public SelectBatsmenPanel() {

        initComponents();
        this.setVisible(true);
        this.setBackground(new Color(125, 168, 151));
        this.setSize(1000, 200);
        this.setVisible(true);

        batsmenset_scrollPane1.setVisible(false);
        batsmenset_scrollPane2.setVisible(false);
        batsmenset_scrollPane3.setVisible(false);

        batPlayersList = TeamMatchVariables.selectedPlayersShortNameIntoMap.get(GlobalVariables.firstInningsBattingTeam);

        loadTheBatsmen();

    }

    public void loadTheBatsmen() {

        int count = 1;

        int listInsertCount = 1;

        DefaultListModel<String> defaultListModel = new DefaultListModel<>();

        boolean isNewModelCreated = false;
        boolean isElementsAddedToModelAfterInsertion = false;

        for (String playerShortName : batPlayersList) {

            defaultListModel.addElement(count + ". " + playerShortName);

            if (isNewModelCreated) {
                isElementsAddedToModelAfterInsertion = true;
                isNewModelCreated = false;
            }
//            System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=- :: " + currentMatchPlayers.getPlayer_name());

            if (count % 6 == 0) {

                if (listInsertCount == 1) {

                    batsmen_list1.setModel(defaultListModel);
                    batsmenset_scrollPane1.setVisible(true);

                } else if (listInsertCount == 2) {

                    batsmen_list2.setModel(defaultListModel);
                    batsmenset_scrollPane2.setVisible(true);

                }

                listInsertCount++;

                defaultListModel = null;
                defaultListModel = new DefaultListModel<>();
                isNewModelCreated = true;
                isElementsAddedToModelAfterInsertion = false;
            }

            count++;
        }

        // changed here just for getting the name of the players in arraylist so that it can be easy to access and operation
//        for (CurrentMatchPlayers currentMatchPlayers : TeamMatchVariables.selectedPlayersMap.get(GlobalVariables.firstInningsBattingTeam)) {
//
//            defaultListModel.addElement(count + ". " + currentMatchPlayers.getPlayer_name());
//
//            if (isNewModelCreated) {
//                isElementsAddedToModelAfterInsertion = true;
//                isNewModelCreated = false;
//            }
////            System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=- :: " + currentMatchPlayers.getPlayer_name());
//
//            if (count % 6 == 0) {
//
//                if (listInsertCount == 1) {
//
//                    batsmen_list1.setModel(defaultListModel);
//                    batsmenset_scrollPane1.setVisible(true);
//
//                } else if (listInsertCount == 2) {
//
//                    batsmen_list2.setModel(defaultListModel);
//                    batsmenset_scrollPane2.setVisible(true);
//
//                }
//
//                listInsertCount++;
//
//                defaultListModel = null;
//                defaultListModel = new DefaultListModel<>();
//                isNewModelCreated = true;
//                isElementsAddedToModelAfterInsertion = false;
//            }
//
//            count++;
//        }
        if (isElementsAddedToModelAfterInsertion) {
            if (batsmenset_scrollPane1.isVisible()) {
                batsmen_list2.setModel(defaultListModel);
                batsmenset_scrollPane2.setVisible(true);
            } else if (batsmenset_scrollPane2.isVisible()) {
                batsmen_list2.setModel(defaultListModel);
                batsmenset_scrollPane2.setVisible(true);
            } else {
                batsmen_list1.setModel(defaultListModel);
                batsmenset_scrollPane1.setVisible(true);
            }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        batsmenset_scrollPane1 = new javax.swing.JScrollPane();
        batsmen_list1 = new javax.swing.JList<>();
        batsmenset_scrollPane2 = new javax.swing.JScrollPane();
        batsmen_list2 = new javax.swing.JList<>();
        batsmenset_scrollPane3 = new javax.swing.JScrollPane();
        batsmen_list3 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        batsmen_numberSelection = new javax.swing.JTextField();

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setFixedCellHeight(20);
        jScrollPane2.setViewportView(jList2);

        setBackground(new java.awt.Color(255, 153, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        batsmen_list1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "item6" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        batsmen_list1.setFixedCellHeight(25);
        batsmen_list1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                batsmen_list1ValueChanged(evt);
            }
        });
        batsmenset_scrollPane1.setViewportView(batsmen_list1);

        add(batsmenset_scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 300, 160));

        batsmen_list2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        batsmen_list2.setFixedCellHeight(25);
        batsmen_list2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                batsmen_list2ValueChanged(evt);
            }
        });
        batsmenset_scrollPane2.setViewportView(batsmen_list2);

        add(batsmenset_scrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 300, 160));

        batsmen_list3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        batsmen_list3.setFixedCellHeight(25);
        batsmen_list3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                batsmen_list3ValueChanged(evt);
            }
        });
        batsmenset_scrollPane3.setViewportView(batsmen_list3);

        add(batsmenset_scrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 300, 160));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Batsmen Or Type Number of Batsment That you Want To Select");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 390, -1));

        jLabel2.setText("Select or Enter Here :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 110, 30));

        batsmen_numberSelection.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                batsmen_numberSelectionKeyReleased(evt);
            }
        });
        add(batsmen_numberSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 40, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void batsmen_list1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_batsmen_list1ValueChanged
        // TODO add your handling code here:

        selectedBatsmen = batsmen_list1.getSelectedValue();
        batsmen_list3.clearSelection();
        batsmen_list2.clearSelection();

    }//GEN-LAST:event_batsmen_list1ValueChanged

    private void batsmen_list2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_batsmen_list2ValueChanged
        // TODO add your handling code here:

        selectedBatsmen = batsmen_list2.getSelectedValue();
        batsmen_list3.clearSelection();
        batsmen_list1.clearSelection();
    }//GEN-LAST:event_batsmen_list2ValueChanged

    private void batsmen_list3ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_batsmen_list3ValueChanged
        // TODO add your handling code here:

        selectedBatsmen = batsmen_list3.getSelectedValue();
        batsmen_list1.clearSelection();
        batsmen_list2.clearSelection();

    }//GEN-LAST:event_batsmen_list3ValueChanged

    private void batsmen_numberSelectionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_batsmen_numberSelectionKeyReleased
        // TODO add your handling code here:

        selectedChar = batsmen_numberSelection.getText();

        try {
            if (Integer.valueOf(selectedChar) > 0 && Integer.valueOf(selectedChar) <= batPlayersList.size()) {
                selectedBatsmen = batPlayersList.get(Integer.valueOf(selectedChar) - 1);

                keySelectionOperations(selectedChar);
            } else {
                JOptionPane.showMessageDialog(this, "Please Select Valid Number From The List", "Selection Invalid", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_batsmen_numberSelectionKeyReleased

    private void keySelectionOperations(String selectValue) {

        selectionPanel.setBounds(100, 100, 500, 250);
        selectionPanel.setBackground(Color.WHITE);
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> batsmen_list1;
    private javax.swing.JList<String> batsmen_list2;
    private javax.swing.JList<String> batsmen_list3;
    private javax.swing.JTextField batsmen_numberSelection;
    private javax.swing.JScrollPane batsmenset_scrollPane1;
    private javax.swing.JScrollPane batsmenset_scrollPane2;
    private javax.swing.JScrollPane batsmenset_scrollPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
