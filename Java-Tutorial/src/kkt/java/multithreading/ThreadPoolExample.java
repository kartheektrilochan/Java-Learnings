package kkt.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample implements Runnable{

	public static void main(String[] args) {

		ExecutorService service=Executors.newFixedThreadPool(10);
		Runnable run1=new ThreadPoolExample();
		service.execute(run1);
		Runnable run2=new ThreadPoolExample();
		service.execute(run2);
	}

	@Override
	public void run() {
		System.out.println("inside run method:"+Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
