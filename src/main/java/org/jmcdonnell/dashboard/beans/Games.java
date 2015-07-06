/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.beans;

/**
 *
 * @author john
 */
public class Games {
    
    private Games() {
    }
    
    public static Game FIFA_15() {
        Game fifa = new Game();
        fifa.setName("Fifa 15");
        fifa.setBoxartUrl("http://img.game.co.uk/ml2/3/0/0/1/300145_xb1_b.png");
        fifa.setCategory(GameCategory.FOOTBALL);
        return fifa;
    }
    
    public static Game NBA_2k15() {
        Game nba = new Game();
        nba.setName("NBA 2K15");
        nba.setBoxartUrl("http://img.game.co.uk/ml2/2/9/9/0/299040_xb1_b.png");
        nba.setCategory(GameCategory.BASKETBALL);
        return nba;
    }
    
    public static Game MADDEN_15() {
        Game nfl = new Game();
        nfl.setName("Madden 15");
        nfl.setBoxartUrl("http://img.game.co.uk/ml2/2/9/7/6/297665_xb1_b.png");
        nfl.setCategory(GameCategory.AMERICAN_FOOTBALL);
        return nfl;
    }
    
}
