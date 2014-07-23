package kkt.java.collections;

import java.util.Comparator;

public class Customer implements Comparable<Customer>{

	private String name;
	private int age;
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.valueOf(age);
		//return "Customer [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Customer customerObj) {
		// TODO Auto-generated method stub
		return this.age>customerObj.age?1:(this.age<customerObj.age?-1:0);
	}
	
	public static class OrderbyName implements Comparator<Customer>{

		@Override
		public int compare(Customer o1, Customer o2) {

			return o1.name.compareTo(o2.name);
		}
		
	}
	
}
