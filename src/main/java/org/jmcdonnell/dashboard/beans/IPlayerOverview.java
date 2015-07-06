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
public interface IPlayerOverview {
    
    Person getPlayer();
    
    void setPlayer(Person player);
    
    Integer getTotalNumberOfGamesPlayed();
    
    void setTotalNumberOfGamesPlayed(Integer totalNumberOfGamesPlayed);
    
    Integer getTotalNumberOfGamesWon();
    
    void setTotalNumberOfGamesWon(Integer totalNumberOfGamesWon);
    
    Game getFavouriteGame();
    
    void setFavouriteGame(Game favouriteGame);
    
    Team getFavouriteTeam();
    
    void setFavouriteTeam(Team favouriteTeam);
    
}
