package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.moneyEntity;

/**
 * Session Bean implementation class moneyEJB
 */
@Stateless
@LocalBean
public class moneyEJB {

 @PersistenceContext
 private EntityManager mt;
    public moneyEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNewTransaction(moneyEntity moneyTransferEntity)
    {
    	System.out.println("add new transaction to the database");
    	mt.persist(moneyTransferEntity);
    }
    
    

}
