package kkt.java.multithreading;

public class ABThread1Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread_A aobj=new Thread_A();
		new A(aobj);
		new B(aobj);
	}

}
