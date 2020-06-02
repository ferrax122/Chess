/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects.Other;

public class Player {
    private String playerId;
    private String playerColor;

    public Player(String playerId, String playerColor){
        this.playerId = playerId;
        this.playerColor = playerColor;
    }

    public String getPlayerColor(){
        return playerColor;
    }

    public String getPlayerId(){
        return playerId;
    }
}