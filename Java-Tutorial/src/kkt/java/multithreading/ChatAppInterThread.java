package kkt.java.multithreading;

public class ChatAppInterThread {
	
	private String vale;
	private int number;
	boolean flag=false;
	public String getVale() {
		return vale;
	}

	public void setVale(String vale) {
		this.vale = vale;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public synchronized void displayBlock1()
	{
		if(flag)
		{
			System.out.println("Block-1 is executing");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Integer value for block1:"+number++);
		flag=true;
		notify();
	}
	public synchronized void displayBlock2()
	{
		if(!flag)
		{
			System.out.println("Block-2 is executing");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Integer value for block2:"+number++);
		flag=false;
		notify();
	}

}
