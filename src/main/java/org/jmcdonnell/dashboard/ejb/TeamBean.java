/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.ejb;

import java.util.List;
import javax.ejb.Stateless;
import org.jmcdonnell.dashboard.beans.Team;

@Stateless
public class TeamBean extends AbstractBean<Team> {

    public TeamBean() {
        super(Team.class);
    }

    @Override
    public List<Team> getAll() {
        return entityManager.createNamedQuery("Team.findAll", Team.class).getResultList();
    }
}
