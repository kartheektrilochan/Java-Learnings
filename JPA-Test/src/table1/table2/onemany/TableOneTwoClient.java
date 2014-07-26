package table1.table2.onemany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import primary.person.foriegn.orders.onemany.Order;
import primary.person.foriegn.orders.onemany.Person;

public class TableOneTwoClient {

	public static void main(String[] args) {

		String PERSISTENCE_UNIT_NAME = "JPA-Test";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		em.getTransaction().begin();
		Tableone one=new Tableone();
		one.setTableoneid("3");
		one.setSizeone("100");
		one.setGenericoneId("1");
		List<Table2> table2lis=new ArrayList<>();
			
			Table2 tab2=new Table2();
			tab2.setTable2id("3");
			tab2.setSize2("200");
			tab2.setTableone(one);
			
			Table2 tab2_2=new Table2();
			tab2_2.setTable2id("4");
			tab2_2.setSize2("21");
			tab2_2.setTableone(one);
			
			
			
		table2lis.add(tab2);	
		table2lis.add(tab2_2);
		//one.setTable2s(table2lis);
		
		
		em.flush();
		em.persist(one);
		tx.commit();
		em.close();
		factory.close();
		System.out.println("ececuted successfully");
	
	
	}

}
