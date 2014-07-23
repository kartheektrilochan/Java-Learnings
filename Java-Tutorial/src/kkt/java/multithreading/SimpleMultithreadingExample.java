package kkt.java.multithreading;

public class SimpleMultithreadingExample implements Runnable{

	/**
	 * @param args
	 */
	private String threadName;
	SimpleMultithreadingExample(String name)
	{
		this.threadName=name;
	}
	public static void main(String[] args) {
		SimpleMultithreadingExample simplethreadexample1=new SimpleMultithreadingExample("thread1");
		SimpleMultithreadingExample simplethreadexample2=new SimpleMultithreadingExample("thread2");
		System.out.println("Start the thread");
		Thread t1=new Thread(simplethreadexample1);
		t1.start();
		Thread t2=new Thread(simplethreadexample2);
		t2.start();
		System.out.println("Thread execution will start");
	}

	@Override
	public void run() {
		System.out.println("This is in run method");
		for(int i=0;i<4;i++)
		{
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("thread name:"+threadName+" "+i);
		}
	}

}
