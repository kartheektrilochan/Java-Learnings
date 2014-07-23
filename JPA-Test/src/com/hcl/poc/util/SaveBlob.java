package com.hcl.poc.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.poc.dao.entity.Stubtab;



public class SaveBlob {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			String PERSISTENCE_UNIT_NAME="JPA-Test";
			EntityManagerFactory factory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			// TODO Auto-generated method stub
			 EntityManager em = factory.createEntityManager();
			 EntityTransaction tx = em.getTransaction();
			 tx.begin();
			Stubtab pr=new Stubtab();
			pr.setId("1");
			em.persist(pr);
			em.flush();
			tx.commit();
			em.close();
			factory.close();
			System.out.println("ececuted successfully");
		}catch(NoClassDefFoundError e){
			System.out.println("called");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
