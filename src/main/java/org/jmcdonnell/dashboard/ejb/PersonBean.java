/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.ejb;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import org.jmcdonnell.dashboard.beans.Game;
import org.jmcdonnell.dashboard.beans.Person;
import org.jmcdonnell.dashboard.beans.Persons;
import org.jmcdonnell.dashboard.beans.Team;

/**
 *
 * @author john
 */
@Stateless
public class PersonBean extends AbstractBean<Person> {

    public PersonBean() {
        super(Person.class);
    }
    
    @Override
    public List<Person> getAll(){
        return entityManager.createNamedQuery("Person.findAll", Person.class).getResultList();
    }

    // package private overview methods
    Game getMostPlayedGameForPlayer(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Team getMostPlayedTeamForPlayer(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @PostConstruct
    public void initPersons(){
        if (getAll().isEmpty()) {
            add(Persons.JOHN());
            add(Persons.MARK());
            add(Persons.TOMMY());
        }
    }
}
