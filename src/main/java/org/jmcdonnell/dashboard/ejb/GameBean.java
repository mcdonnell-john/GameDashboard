/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.ejb;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.jmcdonnell.dashboard.beans.Game;
import org.jmcdonnell.dashboard.beans.Games;
import org.jmcdonnell.dashboard.beans.Team;
import org.jmcdonnell.dashboard.beans.Teams;

/**
 *
 * @author john
 */
@Stateless
public class GameBean extends AbstractBean<Game> {

    @EJB
    TeamBean teamBean;

    public GameBean() {
        super(Game.class);
    }

    @Override
    public List<Game> getAll() {
        return entityManager.createNamedQuery("Game.findAll", Game.class).getResultList();
    }

    @PostConstruct
    public void initGames() {
        if (getAll().isEmpty()) {
            Game fifa = add(Games.FIFA_15());
            Teams.FIFA_TEAMS().stream().map((team) -> {
                team.setGame(fifa);
                return team;
            }).forEach((team) -> {
                teamBean.add(team);
            });

            Game nba = add(Games.NBA_2k15());
            Teams.NBA_TEAMS().stream().map((team) -> {
                team.setGame(nba);
                return team;
            }).forEach((team) -> {
                teamBean.add(team);
            });
            Game nfl = add(Games.MADDEN_15());
            Teams.MADDEN_TEAMS().stream().map((team) -> {
                team.setGame(nfl);
                return team;
            }).forEach((team) -> {
                teamBean.add(team);
            });
        }
    }
}
