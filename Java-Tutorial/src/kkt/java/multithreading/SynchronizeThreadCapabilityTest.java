package kkt.java.multithreading;

import kkt.java.utilityClasses.AllinOneUtility;

public class SynchronizeThreadCapabilityTest implements Runnable {

	private String threadName;

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		synchronized(this)
		{
			String t_name=threadName;
			System.out.println("Running:"+t_name);
			for(int i=0;i<100;i++)
			{
				System.out.println(t_name+":"+i);
			}
			System.out.println("Stopping:"+t_name);
			}
	}

	public static void main(String[] args) {
		AllinOneUtility utility = new AllinOneUtility();
		SynchronizeThreadCapabilityTest clsObj = new SynchronizeThreadCapabilityTest();
		clsObj.setThreadName("Thread1");
		Thread t1 = new Thread(clsObj, "Thread 1");
		long startTime = System.currentTimeMillis();
		t1.start();
		long stopTime = System.currentTimeMillis();
		System.out.println("Time Taken with for loop:"+ utility.timeTakenforExecute(stopTime, startTime));
		startTime = System.currentTimeMillis();
		Thread t2 = new Thread(clsObj, "Thread 2");
		clsObj.setThreadName("Thread2");
		t2.start();
		stopTime = System.currentTimeMillis();
		System.out.println("Time Taken with thread2 loop:"
				+ utility.timeTakenforExecute(stopTime, startTime));

	}

}
