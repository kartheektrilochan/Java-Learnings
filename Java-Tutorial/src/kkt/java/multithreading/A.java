package kkt.java.multithreading;

public class A implements Runnable{
	
	Thread_A Aobj;
	
	A(Thread_A a){
		this.Aobj=a;
		new Thread(this,"A").start();
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			Aobj.send(String.valueOf(i));
		}
	}

}
