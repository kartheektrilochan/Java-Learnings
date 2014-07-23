package kkt.java.tips;

public class ExecutionTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long startTimenano = System.nanoTime();
		//Stopwatch timer = new Stopwatch().start();
		System.out.println("MILLI"+startTime);
		System.out.println("Nano"+startTimenano);
		System.out.println("Time Started");
		for(int i=0;i<1000;i++)
		{
			//System.out.println("i:"+i);
		}
		long stopTime = System.currentTimeMillis();
		long stopTimenano = System.nanoTime();
		long elapsedTime = stopTime - startTime;
	    long elaspsedTimenano=stopTimenano-startTimenano;
		System.out.println("elapsedTimeMilli:"+elapsedTime);
		System.out.println("elapsedTimeNano:"+elaspsedTimenano);
	}

}
