package kkt.java.multithreading;

public class PrinterClass {

	/**
	 * @param args
	 */
	public void display(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Counter of:"+name+" is "+i);
		}
	}
}
