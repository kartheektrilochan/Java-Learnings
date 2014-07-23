package kkt.java.multithreading;

public class B implements Runnable{

	Thread_A Aobj;
	
	B(Thread_A a){
		this.Aobj=a;
		new Thread(this,"B").start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			Aobj.receive(String.valueOf(i));
		}
	}

}
