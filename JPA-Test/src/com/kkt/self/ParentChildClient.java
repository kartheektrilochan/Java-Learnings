package com.kkt.self;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.poc.dao.entity.Stubtab;

public class ParentChildClient {

	public static void main(String[] args) {

		String PERSISTENCE_UNIT_NAME = "JPA-Test";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		Customer cust = new Customer();
		cust.setId("4");
		cust.setCustomername("kartheek");
		Address a = new Address();
		a.setAddress1("address1");
		a.setAddress2("address2");
		cust.setAddress(a);
		em.flush();
		em.persist(cust);
		tx.commit();
		em.close();
		factory.close();
		System.out.println("ececuted successfully");
	}

}
