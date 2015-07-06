/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmcdonnell.dashboard.ejb;

import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import org.jmcdonnell.dashboard.beans.Resource;

/**
 *
 * @author john
 */
abstract class AbstractBean <T extends Resource> {

    private final Class<T> genericClass;

    public AbstractBean(Class<T> genericClass) {
        this.genericClass = genericClass;
    }
    
    @Inject
    protected EntityManager entityManager;
    
    abstract List<T> getAll();

    public T add(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    public T get(Long id) {
        return entityManager.find(genericClass, id);
    }

    public void delete(Long id) {
        T foundEntity = get(id);
        entityManager.refresh(foundEntity);
    }
}
