package kkt.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablenComparator {

	public static void main(String[] args) {

		Customer customer1=new Customer("A", 26);
		Customer customer2=new Customer("D", 24);
		Customer customer3=new Customer("C", 25);
		
		List<Customer> customerlist=new ArrayList<Customer>();
		customerlist.add(customer1);
		customerlist.add(customer2);
		customerlist.add(customer3);
		System.out.println("Customer list in unsorted order:"+customerlist);
		System.out.println("Sorting the elements");
		Collections.sort(customerlist);
		System.out.println(customerlist);
		System.out.println("printing in reverse order");
		Collections.sort(customerlist,Collections.reverseOrder());
		System.out.println(customerlist);
		System.out.println("Custom sorting");
		Collections.sort(customerlist,new Customer.OrderbyName());
		System.out.println(customerlist);
	}
	
}
