package kkt.java.classrelated;

public class ImmutableExampleClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImmutableExample eg=ImmutableExample.createInstance(12, "Kartheek");
		System.out.println(eg.getAge());
	}

}
