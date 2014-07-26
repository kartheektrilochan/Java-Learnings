package primary.person.foriegn.orders.onemany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.kkt.self.Address;
import com.kkt.self.Customer;

public class Primary_ForiegnClient {

	public static void main(String[] args) {
		String PERSISTENCE_UNIT_NAME = "JPA-Test";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		em.getTransaction().begin();
		Person person=new Person();
		person.setPersonid("2");
		person.setPersonname("Kartheek");
		person.setAddress("Bangalore");
		List<Order> orderlist=new ArrayList<>();
			Order order1=new Order();
			order1.setOrderid("2");
			order1.setItemname("SOAPS");
			order1.setPerson(person);
			orderlist.add(order1);
		person.setOrders(orderlist);
		em.flush();
		em.persist(person);
		tx.commit();
		em.close();
		factory.close();
		System.out.println("ececuted successfully");
	
	}

}
