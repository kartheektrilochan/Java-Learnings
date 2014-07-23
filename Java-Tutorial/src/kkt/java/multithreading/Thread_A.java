package kkt.java.multithreading;

public class Thread_A {
	
	public boolean flag=true;
	public synchronized void send(String ques)
	{
		System.out.println("executing send method");
		if(flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag=false;
		System.out.println("flag set to false");
		notify();
	}
	public synchronized void receive(String ques)
	{
		System.out.println("Executing receive method");
		if(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag=true;
		System.out.println("flag set to true");
		notify();
	}
}
