
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranav
 */
public class Team {
    private String name;
    private ArrayList<Player> player;
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        this.player = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName() {
        return name;
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.player.size();
    }
    
    public void addPlayer(Player playerToAdd) {
        if (player.size() < this.maxSize) {
        this.player.add(playerToAdd);
        }
    }
    
    public void printPlayers() {
        for (Player k : player) {
            System.out.println(k);
        }
    }
    
    public int goals() {
        int goals = 0;
        for (Player k : player) {
            goals += k.goals();
        }
        return goals;
    }
    
}
