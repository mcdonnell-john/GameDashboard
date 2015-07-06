/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author john
 */
public class Overview {

    public static IPlayerOverview newPersonOverview() {
        return new PlayerOverview();
    }
    
    private final List<IPlayerOverview> playerOverviews = new ArrayList<>();
    
    

    public List<IPlayerOverview> getPlayerOverviews() {
        return playerOverviews;
    }

    
    
    
    private static class PlayerOverview implements IPlayerOverview {
        
        private Person player;
        private Integer totalNumberOfGamesPlayed;
        private Integer totalNumberOfGamesWon;
        private Game favouriteGame;
        private Team favouriteTeam;

        @Override
        public Person getPlayer() {
            return player;
        }

        @Override
        public void setPlayer(Person player) {
            this.player = player;
        }
        
        @Override
        public Integer getTotalNumberOfGamesPlayed() {
            return totalNumberOfGamesPlayed;
        }

        @Override
        public void setTotalNumberOfGamesPlayed(Integer totalNumberOfGamesPlayed) {
            this.totalNumberOfGamesPlayed = totalNumberOfGamesPlayed;
        }

        @Override
        public Integer getTotalNumberOfGamesWon() {
            return totalNumberOfGamesWon;
        }

        @Override
        public void setTotalNumberOfGamesWon(Integer totalNumberOfGamesWon) {
            this.totalNumberOfGamesWon = totalNumberOfGamesWon;
        }

        @Override
        public Game getFavouriteGame() {
            return favouriteGame;
        }

        @Override
        public void setFavouriteGame(Game favouriteGame) {
            this.favouriteGame = favouriteGame;
        }

        @Override
        public Team getFavouriteTeam() {
            return favouriteTeam;
        }

        @Override
        public void setFavouriteTeam(Team favouriteTeam) {
            this.favouriteTeam = favouriteTeam;
        }
    }
    
}
