package kkt.java.research;

public class PassByValue {

	/**
	 * @param args
	 */
	static String age="10";

	public static void main(String[] args) {
		Customer cust=new Customer();
		cust.setAddress("12");
		System.out.println(cust.getAddress());
		changeValues(cust.getAddress());
		System.out.println(age);
		System.out.println(cust.getAddress());
	}

	private static void changeValues(String address) {
		address="14";
		
	}

}
