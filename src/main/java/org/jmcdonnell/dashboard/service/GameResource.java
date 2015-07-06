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
import org.jmcdonnell.dashboard.beans.Game;
import org.jmcdonnell.dashboard.ejb.GameBean;

/**
 * REST Web Service
 *
 * @author john
 */
@Path("/games")
public class GameResource extends AbstractResource<Game> {

    @Context
    private UriInfo context;
    
    @EJB
    private GameBean gameBean;

    @Override
    public List<Game> getAll() {
        return gameBean.getAll();
    }

    @Override
    public void add(Game content) {
        gameBean.add(content);
    }

    @Override
    public Game get(@PathParam("id") String id) {
        return gameBean.get(Long.parseLong(id));
    }

    @Override
    public void delete(@PathParam("id") String id) {
        gameBean.delete(Long.parseLong(id));
    }
}
