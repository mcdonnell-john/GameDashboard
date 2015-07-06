/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author john
 */
@ApplicationScoped
public class DatabaseProducer {
    
//    @Produces
//    @PersistenceContext(unitName = "dashboard_dashboard_war_1.0PU")
//    private EntityManager entityManagerProd;
//    
    @Produces
    @SuppressWarnings("unused")
    @PersistenceContext(unitName = "dashboard_dashboard_war_1.0PU_dev")
    private EntityManager entityManagerDev;
}
