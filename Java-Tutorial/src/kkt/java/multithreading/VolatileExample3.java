/**
 * 
 */
package kkt.java.multithreading;

/**
 * @author trilochan
 *
 */
public class VolatileExample3 implements Runnable{

	volatile int value=0;
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		VolatileExample3 eg=new VolatileExample3();
		Thread t=new Thread(eg,"thread1");
		System.out.println("Startinn Thread");
		t.start();
		Thread.sleep(1000);
		eg.value=1;
		System.out.println("Closing the program");
	}
	@Override
	public void run() {
		System.out.println("Executing Run method");
		int count=0;
		System.out.println(value);
		while(value==0)
		{
			count++;
		}
		System.out.println("Count is:"+count);
	}

}
