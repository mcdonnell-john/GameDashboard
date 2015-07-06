/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.jmcdonnell.dashboard.beans.Team;
import org.jmcdonnell.dashboard.ejb.TeamBean;

@Path("/teams")
public class TeamResource extends AbstractResource<Team> {
    
    @Context
    private UriInfo context;
    
    @EJB
    private TeamBean teamBean;

    public List<Team> getAllTeamsByGame(@PathParam("game") String gameId) {
        
    }
    
    @Override
    public List<Team> getAll() {
        return teamBean.getAll();
    }

    @Override
    public void add(Team resource) {
        teamBean.add(resource);
    }

    @Override
    public Team get(@PathParam("id") String id) {
        return teamBean.get(Long.parseLong(id));
    }

    @Override
    public void delete(@PathParam("id") String id) {
        teamBean.delete(Long.parseLong(id));
    }
}
