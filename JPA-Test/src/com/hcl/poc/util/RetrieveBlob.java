package com.hcl.poc.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hcl.poc.base.service.BaseDAOService;
import com.poc.dao.entity.Stubtab;



public class RetrieveBlob extends BaseDAOService<Stubtab>{

	
	public static void main(String[] args) {
		try{
			String PERSISTENCE_UNIT_NAME="JPA-Test";
			EntityManagerFactory factory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			EntityManager em = factory.createEntityManager();
			Query q = em.createNamedQuery("Stubtab.findAll", Stubtab.class);
				 /*displays the content*/
				 List<Stubtab> stublist=q.getResultList();
				 System.out.println(stublist.get(0).getId());
				 
				 /*copies the blob content*/
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
