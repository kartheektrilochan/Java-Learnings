package kkt.java.overload;

public class OverRideExample1 {

	/**
	 * @param args
	 */
	public int operaInteger(int a,int b)
	{
		System.out.println("Calling with int"); 
		return a+b;
	}
	public Integer operaInteger(int a,int b,int c)
	{
		System.out.println("Integer Return type");
		return a+b+c;
		
	}
	
	public int operaInteger(Integer a,Integer b)
	{
		System.out.println("Calling with Integer");
		return a+b;
	}
	
	public int operaInteger(Number a,Number b)
	{
		System.out.println("Calling with Number");
		int c=a.intValue()+b.intValue();
		return c;
	}	
	
	public static void main(String[] args) {
		OverRideExample1 eg1=new OverRideExample1();
		int a=10;
		int b=9;
		Number a1=10;
		Number b1=11;
		Integer a2=11;
		Integer b2=12;
		eg1.operaInteger(a1, b1);
	}

}
