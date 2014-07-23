package com.hcl.poc.base.service;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerService implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	
	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;
	
	public String PERSISTENCE_UNIT_NAME="JPA-Test";
	
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	//private EntityManagerFactory emf;
	
	
	private EntityManager em;

	public EntityManager getEntityManager() {
		return this.em;
	}
	
	
	public void initEntityManager(){
		em=emf.createEntityManager();
	}

	protected void closeEntityManager (){
		em.close();
	}
*/

	
	private static EntityManagerFactory entityManagerFactory;
	
	private EntityManagerService(){
		createEntityManagerFactory();
	}
	
	private static void createEntityManagerFactory(){
		if (entityManagerFactory == null){
			entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Test");
		}				
	}
		
	public static EntityManager getEntityManager(){
		
		if (entityManagerFactory == null)
			createEntityManagerFactory();
		
		return entityManagerFactory.createEntityManager();		
	}
		
	@Override
	protected void finalize() throws Throwable {
		if (entityManagerFactory != null)
			entityManagerFactory.close();
	} 
	

}
