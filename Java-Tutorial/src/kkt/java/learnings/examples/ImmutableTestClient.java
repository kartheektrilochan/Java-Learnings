package kkt.java.learnings.examples;

public class ImmutableTestClient {

	public static void main(String[] args) {
		Customer cust=new Customer();
		cust.setCustid("1");
		cust.setCustname("Trilochan");
		ImmutableTest test=new ImmutableTest(1, "kartheek", cust);
		System.out.println(test.getCustomer().getCustid());
	}

}
