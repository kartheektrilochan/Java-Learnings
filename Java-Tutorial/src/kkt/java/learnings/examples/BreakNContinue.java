package kkt.java.learnings.examples;

public class BreakNContinue {

	public static void main(String[] args) {
		int x=0;
		for(int i=0;i<10;i++)
		{
			System.out.println("in for loop:"+i);
		if(x==0)
		{
			System.out.println("In if condition");
			x++;
			continue;
		}
		else if(x==1)
		{
			System.out.println("in else if");
			break;
			
		}
		else{
			System.out.println("Else statement");
		}
		}
	}

}
