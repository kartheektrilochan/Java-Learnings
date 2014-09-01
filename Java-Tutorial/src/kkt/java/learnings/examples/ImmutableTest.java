package kkt.java.learnings.examples;

public final class ImmutableTest {
	
	private int age;
	private String name;
	private Customer customer;
	public ImmutableTest(int age,String name,Customer cust) {
		this.age=age;
		this.name=name;
		this.customer=cust;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public Customer getCustomer() {
		return customer;
	}
	

}
