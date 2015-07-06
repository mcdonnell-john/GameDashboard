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
import org.jmcdonnell.dashboard.beans.Person;
import org.jmcdonnell.dashboard.ejb.PersonBean;

/**
 * REST Web Service
 *
 * @author john
 */
@Path("/persons")
public class PersonResource extends AbstractResource<Person>{

    @Context
    private UriInfo context;
    
    @EJB
    private PersonBean personBean;

    @Override
    public List<Person> getAll() {
        return personBean.getAll();
    }
    
    @Override
    public void add(Person resource) {
        personBean.add(resource);
    }

    @Override
    public Person get(@PathParam("id") String id) {
        return personBean.get(Long.parseLong(id));
    }

    @Override
    public void delete(@PathParam("id") String id) {
        personBean.delete(Long.parseLong(id));
    }
}
