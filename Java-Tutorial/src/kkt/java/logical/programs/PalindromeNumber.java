package kkt.java.logical.programs;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println("Checking whether a number s armstrong or not");
		PalindromeNumber obj=new PalindromeNumber();
		int number = 102;
		//2*10+reminder
		obj.checkPalindrome(number);
	}
	public void checkPalindrome(int number)
	{
		int src=number;
		int reverse=0;
		int x=0;
		int modularnum;
		while(number>0)
		{	
			 	modularnum=number%10;
			
			 	reverse = reverse * 10;
			 	reverse = reverse + modularnum;

			 	number= number/10;
			
		}
		System.out.println("refroming:"+reverse);
		if(src==reverse)
		{
			System.out.println("arms");
		}
	}

}
