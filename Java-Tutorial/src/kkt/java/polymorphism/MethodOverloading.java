package kkt.java.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading overload=new MethodOverloading();
		overload.overloadTest();
	}
	
	void overloadTest()
	{
		System.out.println("this is with no parameter");
	}
	void overloadTest(int i)
	{
		System.out.println("this is with no parameter");
	}
	public String overloadTest(String i)
	{
		System.out.println("this is with no parameter but with different return type");
		return null;
	}
}
