/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.ejb;

import java.util.List;
import org.jmcdonnell.dashboard.beans.Fixture;


public class FixtureBean extends AbstractBean<Fixture> {

    public FixtureBean() {
        super(Fixture.class);
    }

    @Override
    List<Fixture> getAll() {
        return entityManager.createNamedQuery("Fixture.findAll", Fixture.class).getResultList();
    }
    
}
