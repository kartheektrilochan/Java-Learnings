package kkt.java.multithreading;

public class InterThreadCommunication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChatAppInterThread obj=new ChatAppInterThread();
		new ChatA(obj);
		new ChatB(obj);
	}

}
