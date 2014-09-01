package kkt.java.logical.programs;

import com.sun.org.apache.regexp.internal.recompile;

public class FactorialProgram {

	public static void main(String[] args) {
		FactorialProgram obj=new FactorialProgram();
		System.out.println(obj.factorialNumber(5));
	}
	
	public int factorialNumber(int num)
	{
		int factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}

}
