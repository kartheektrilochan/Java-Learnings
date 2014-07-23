package kkt.java.multithreading;

public class VolatileExample {

	/**
	 * @param args
	 * 
	 * This is not working
	 */
	private static volatile int value=0;
	
	public static void main(String[] args) {
		System.out.println("Started");
		//new ChangeMaker().run();
		new ChangeListener().run();
		new ChangeMaker().run();
		System.out.println("Stopped");
		
	}
	static class ChangeListener implements Runnable{
		
		@Override
		public void run() {
			int local_val=value;
			System.out.println("Listener");
			while(local_val<5){
				if(local_val!=value){
					System.out.println("Value Changed:"+local_val);
				}
				local_val++;
			}	
		}
	}
	static class ChangeMaker implements Runnable{

		@Override
		public void run() {
			System.out.println("Maker");
			int local_val=value;
			while(value<5)
			{
				System.out.println("incrementing value by 1");
				value=++local_val;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
