/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects.Other;

public class Tile {
    private boolean occupied;
    private String coordId;
    private int coord;
    private int rank;

    public Tile() {
        occupied = false;
    }

    public Tile(int coord){
        occupied = false;
        this.coord = coord;
        this.coordId = null;
        this.rank = 0;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public void setOccupied(boolean newOccupied){
        this.occupied = newOccupied;
    }

    public void setCoordId(String newCoord){
        this.coordId = newCoord;
    }

    public String getCoordId(){
        return coordId;
    }

    public int getCoord(){ return coord;}

    public void setCoord(int coord){this.coord = coord;}

    public int getRank(){ return rank;}

    public void setRank(int rank){ this.rank = rank;}
}

