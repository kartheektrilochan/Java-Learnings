package kkt.java.multithreading;

public class PrinterClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrinterClass obj=new PrinterClass();
		PrinterControllerWithThread printercontroller1=new PrinterControllerWithThread("Thread1", obj);
		PrinterControllerWithThread printercontroller2=new PrinterControllerWithThread("Thread2", obj);
		System.out.println("Starting the threads");
		printercontroller1.start();
		printercontroller2.start();
		System.out.println("Closing the execution");
		/*try {
			printercontroller1.join();
			printercontroller2.join();
	      } catch( Exception e) {
	         System.out.println("Interrupted");
	      }
*/	}

}
