/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.service;

import org.jmcdonnell.dashboard.ejb.GameOverview;
import org.jmcdonnell.dashboard.ejb.PlayerOverview;
import org.jmcdonnell.dashboard.ejb.OverviewBean;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jmcdonnell.dashboard.beans.Overview;

/**
 *
 * @author john
 */
@Path("/overview")
public class OverviewResource {
    
    @EJB
    private OverviewBean overviewBean;
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Overview getOverview() {
        return null;//overviewBean.generateOverview();
    }

    @GET
    @Path("players/{id}")
    public PlayerOverview getPlayerOverview(@PathParam("id") String id) {
        return null;
    }
    
    @GET
    @Path("games/{id}")
    public GameOverview getGameOverview(@PathParam("id") String id) {
        return null;
    }
}
