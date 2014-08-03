package kkt.java.multithreading;

public class ThreadJoinExample implements Runnable{

	public static void main(String[] args) {
		System.out.println("Thread Join Example");
		Thread t1=new Thread(new ThreadJoinExample());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t2=new Thread(new ThreadJoinExample());
		t2.start();
	}

	@Override
	public void run() {
		System.out.println("In run method");
		for(int i=0;i<10;i++)
		{
			System.out.println("i:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
