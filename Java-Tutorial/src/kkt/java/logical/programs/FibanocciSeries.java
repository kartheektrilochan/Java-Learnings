package kkt.java.logical.programs;

public class FibanocciSeries {

	public static void main(String[] args) {
		FibanocciSeries series=new FibanocciSeries();
		series.printFibanocciSeries(10);
		
	}
	
	public void printFibanocciSeries(int num)
	{
		int a=0;
		int b=1;
		int sum;
		System.out.println(a);
		for(int i=0;i<10;i++)
		{
			sum =a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
			
		}
	}

}
