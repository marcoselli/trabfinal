/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Marco
 */
public abstract class GenericDao <Entity> {
    
    public abstract void insert(Entity e);
    public abstract void delete(int o);
    public EntityManager getEntityManager(){
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("TrabalhoFinalPU");
        EntityManager em = emf.createEntityManager();
       return em;
    }
     
}
    
    
