package kkt.java.multithreading;

import kkt.java.utilityClasses.AllinOneUtility;

public class WithoutThreadCapabilityTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AllinOneUtility utility=new AllinOneUtility();
		System.out.println("Starting the Thread Capability Test");
		long startTime=System.currentTimeMillis();
		for(int i=0;i<100;i++)
		{
			System.out.println("i:"+i);
		}
		long stopTime=System.currentTimeMillis();
		System.out.println("Time Taken with for loop:"+utility.timeTakenforExecute(stopTime, startTime));
		int j=0;
		startTime=System.currentTimeMillis();
		while(j<100)
		{
			System.out.println("j:"+j);
			j++;
		}
		stopTime=System.currentTimeMillis();
		System.out.println("Time Taken with while loop:"+utility.timeTakenforExecute(stopTime, startTime));
	}

}
