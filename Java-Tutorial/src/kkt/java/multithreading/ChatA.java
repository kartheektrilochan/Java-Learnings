package kkt.java.multithreading;

public class ChatA implements Runnable{

	ChatAppInterThread obj;
	
	ChatA(ChatAppInterThread obj)
	{
		this.obj=obj;
		new Thread(this,"chata").start();
	}
	@Override
	public void run() {
		obj.displayBlock1();
	}

}
