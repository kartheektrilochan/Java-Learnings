package kkt.java.multithreading;

public class InterThreadExample_A implements Runnable{

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
		InterThreadExample_A exampleA=new InterThreadExample_A();
		int a[]=new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
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
