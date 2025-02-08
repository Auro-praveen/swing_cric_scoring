/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scoring.globalvariables;

import com.scoring.reference.bean.CurrentOversBean;
import java.util.ArrayList;

/**
 * @author AuroLed
 */

public class InningsGlobalVariable {

    public static String strikerBatsman = null, nonStrikerBatsman = null, currentBowlerName = null,
            previousBowlerName = null, prevOutBatsman = null, miniOverBowlerName = null;

    public static ArrayList<CurrentOversBean> currentOversList = new ArrayList<>();
    public static ArrayList<CurrentOversBean> previousOversList = new ArrayList<>();

    public static int currentPartenershipRuns = 0, currentPartenershipBowlsFaced = 0;

    public static String currentPartnersipInString = null;
    
}
