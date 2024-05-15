/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scoring.services;

import com.scoring.beans.CurrentMatchPlayers;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class CurrentPlayersService {

    public ArrayList<CurrentMatchPlayers> addCaptainsMethod(ArrayList<CurrentMatchPlayers> playersList,
            String captain, String wicketKeeper) {

        int captain_jersey = Integer.valueOf(captain.substring(0, captain.indexOf(' ')));
        String captainName = captain.substring(captain.indexOf(' ') + 1);

        int wicketKeeper_jersey = Integer.valueOf(captain.substring(0, captain.indexOf(' ')));
        String wicketWicket_name = captain.substring(captain.indexOf(' ') + 1);

        for (CurrentMatchPlayers currentMatchPlayers : playersList) {

            if (currentMatchPlayers.getPlayer_jersey() == captain_jersey
                    && currentMatchPlayers.getPlayer_jersey() == wicketKeeper_jersey) {
                System.out.println("Captain jersey === " + captain_jersey);
                System.out.println("Captain_Name === " + captainName);
                System.out.println("player is from bean :: = " + currentMatchPlayers.getPlayer_full_name());
                currentMatchPlayers.setIsCaptain(true);
                currentMatchPlayers.setIsWicketKeeper(true);
                break;
            } else if (currentMatchPlayers.getPlayer_jersey() == captain_jersey) {
                System.out.println("Captain jersey === " + captain_jersey);
                System.out.println("Captain_Name === " + captainName);
                System.out.println("player is from bean :: = " + currentMatchPlayers.getPlayer_full_name());
                currentMatchPlayers.setIsCaptain(true);
//                currentMatchPlayers.setIsWicketKeeper(true);
                break;
            } else if (currentMatchPlayers.getPlayer_jersey() == wicketKeeper_jersey) {
                System.out.println("Captain jersey === " + captain_jersey);
                System.out.println("Captain_Name === " + captainName);
                System.out.println("player is from bean :: = " + currentMatchPlayers.getPlayer_full_name());
                currentMatchPlayers.setIsCaptain(true);
                currentMatchPlayers.setIsWicketKeeper(true);
                break;
            }
        }

        return playersList;

    }

}
