package kkt.java.multithreading;

public class VolatileExample2 extends Thread{
	 /*volatile */boolean keepRunning = true;

	    public void run() {
	        long count=0;
	        while (keepRunning) {
	            count++;
	        }
	        System.out.println("Thread terminated."+count);
	    }

	    public static void main(String[] args) throws InterruptedException {
	        VolatileExample2 t = new VolatileExample2();
	        t.start();
	        Thread.sleep(100);
	        t.keepRunning = false;
	        System.out.println("keepRunning set to false.");
	    }
	}