/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.reference.bean;

import java.util.ArrayList;

/**
 *
 * @author AuroLed
 */

public class CurrentOversBean {
    
    private String bowlerName;
    private int legalDeliveries;
    private int allDeliveries;
    private ArrayList<String> currentOverAllDeliveriesList;
    private int currentOverExtras;
    private int currentOverRunsgiven;
    private int currentOverWicketsTaken;

    public String getBowlerName() {
        return bowlerName;
    }

    public void setBowlerName(String bowlerName) {
        this.bowlerName = bowlerName;
    }

    public int getLegalDeliveries() {
        return legalDeliveries;
    }

    public void setLegalDeliveries(int legalDeliveries) {
        this.legalDeliveries = legalDeliveries;
    }

    public int getAllDeliveries() {
        return allDeliveries;
    }

    public void setAllDeliveries(int allDeliveries) {
        this.allDeliveries = allDeliveries;
    }

    public ArrayList<String> getCurrentOverAllDeliveriesList() {
        return currentOverAllDeliveriesList;
    }

    public void setCurrentOverAllDeliveriesList(ArrayList<String> currentOverAllDeliveriesList) {
        this.currentOverAllDeliveriesList = currentOverAllDeliveriesList;
    }

    public int getCurrentOverExtras() {
        return currentOverExtras;
    }

    public void setCurrentOverExtras(int currentOverExtras) {
        this.currentOverExtras = currentOverExtras;
    }

    public int getCurrentOverRunsgiven() {
        return currentOverRunsgiven;
    }

    public void setCurrentOverRunsgiven(int currentOverRunsgiven) {
        this.currentOverRunsgiven = currentOverRunsgiven;
    }

    public int getCurrentOverWicketsTaken() {
        return currentOverWicketsTaken;
    }

    public void setCurrentOverWicketsTaken(int currentOverWicketsTaken) {
        this.currentOverWicketsTaken = currentOverWicketsTaken;
    }
    
    
    
    
}
