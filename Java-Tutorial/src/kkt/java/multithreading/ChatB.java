package kkt.java.multithreading;

public class ChatB implements Runnable{

	ChatAppInterThread obj;
	
	ChatB(ChatAppInterThread obj)
	{
		this.obj=obj;
		new Thread(this,"chatb").start();
	}
	@Override
	public void run() {
		obj.displayBlock2();
	}

}
