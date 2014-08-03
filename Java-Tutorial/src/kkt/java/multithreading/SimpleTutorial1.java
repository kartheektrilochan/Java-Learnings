package kkt.java.multithreading;

public class SimpleTutorial1 implements Runnable {

	
	public static void main(String[] args) {
		SimpleTutorial1 tut1=new SimpleTutorial1();
		Thread thread=new Thread(tut1);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Run Method of thread");
	}

}
