/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.service;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jmcdonnell.dashboard.beans.Resource;

/**
 *
 * @author john
 */
abstract class AbstractResource<T extends Resource> {
    
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    public abstract void add(T resource);
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public abstract T get(@PathParam("id") String id);
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public abstract List<T> getAll();
    
    @DELETE
    @Path("/{id}")
    public abstract void delete(@PathParam("id") String id);
    
}
