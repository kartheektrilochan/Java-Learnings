package kkt.java.multithreading;

public class InterThreadExample_B implements Runnable{

	/**
	 * @param args
	 */
	private String threadname;
	private boolean flag=true;
	private int array[]=new int[10];
	
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public static void main(String[] args) {
		InterThreadExample_B exampleA=new InterThreadExample_B();
		int a[]=new int[10];
		a[0]=10;
		a[1]=9;
		a[2]=8;
		a[3]=7;
		a[4]=6;
		a[5]=5;
		a[6]=4;
		a[7]=3;
		a[8]=2;
		a[9]=1;
		exampleA.setArray(a);
	}

	@Override
	public void run() {
		System.out.println("Executing the run method of "+threadname);
		int count=0;
		for(int k=0;k<array.length;k++)
		{
			send(array[k]);
		}
	}

	private synchronized void send(int i) {
			if(flag)
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("sent value:"+i);
			flag=false;
			notify();
	}

}
