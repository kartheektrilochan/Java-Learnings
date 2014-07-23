package kkt.java.multithreading;

public class PrinterControllerWithThread implements Runnable{

	private Thread t;
	private String threadname;
	PrinterClass printer;
	PrinterControllerWithThread(String name,PrinterClass obj)
	{
		this.threadname=name;
		printer=obj;
	}
	@Override
	public void run() {
	     synchronized (printer) {
	    	 System.out.println("Thread " +  threadname + " exiting.");
		     printer.display(threadname);
		}
	     
	}

	   public void start ()
	   {
	      System.out.println("Starting " +  threadname );
	      if (t == null)
	      {
	         t = new Thread (this, threadname);
	         t.start ();
	      }
	   }

}
