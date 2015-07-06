/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.ejb;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.jmcdonnell.dashboard.beans.Fixture;
import org.jmcdonnell.dashboard.beans.Game;
import org.jmcdonnell.dashboard.beans.IPlayerOverview;
import org.jmcdonnell.dashboard.beans.Overview;
import org.jmcdonnell.dashboard.beans.Person;
import org.jmcdonnell.dashboard.beans.Team;

/**
 *
 * @author john
 */
@Stateless
public class OverviewBean {
    
//    @EJB
//    private PersonBean personBean;
//    @EJB
//    private GameBean gameBean;
//    @EJB
//    private FixtureBean fixtureBean;
//
//    public Overview generateOverview() {
//        Overview overallOverview = new Overview();
//        
//        List<Fixture> allFixtures = fixtureBean.getAll();
//        
//        personBean.getAll().stream().map((person) -> {
//            IPlayerOverview playerOverview = Overview.newPersonOverview();
//            playerOverview.setPlayer(person);
//            calculateRemainingValues(playerOverview, person, allFixtures);
//            
//            
//            return playerOverview;            
//        }).forEach((playerOverview) -> {
//            overallOverview.getPlayerOverviews().add(playerOverview);
//        });
//        
//        return overallOverview;
//    }
//
//    private void calculateRemainingValues(IPlayerOverview playerOverview, Person person, List<Fixture> allFixtures) {
//        int numOfGamesPlayed = 0;
//        int numOfGamesWon = 0;
//        
//        for (Fixture fixture : allFixtures) {
//            if(personInFixture(person, fixture)) {
//                numOfGamesPlayed++;
//                if(playerWonFixture(person, fixture)) {
//                    numOfGamesWon++;
//                }
//                
//            }
//        }
//        
//        playerOverview.setTotalNumberOfGamesPlayed(numOfGamesPlayed);
//        playerOverview.setTotalNumberOfGamesWon(numOfGamesWon);
//    }
//
//    private boolean personInFixture(Person person, Fixture fixture) {
//        return (person.equals(fixture.getHomePlayer()) || person.equals(fixture.getAwayPlayer()));
//    }
//
//    private boolean playerWonFixture(Person person, Fixture fixture) {
//        boolean fixtureWon;
//        if (person.equals(fixture.getHomePlayer())) {
//            fixtureWon = fixture.getHomeScore() > fixture.getAwayScore();
//        } else {
//            fixtureWon = fixture.getAwayScore() > fixture.getHomeScore();
//        }
//        
//        return fixtureWon;
//    }
//
//    
}
