package kkt.java.classrelated;

public class FinalClassCaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Example e=new Example();
		e.setAge("10");
		System.out.println(e.getAge());
		e.setAge("11");
		System.out.println(e.getAge());
	}

}
