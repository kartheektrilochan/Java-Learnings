package kkt.java.logical.programs;

public class ArmStrongNumber {

	public static void main(String[] args) {

		ArmStrongNumber number=new ArmStrongNumber();
		number.checkArmStrongNumber(123);
	}

	public void checkArmStrongNumber(int number)
	{
		int src=number;
		int modularnumber;
		int sum=0;
		while(number>0)
		{
			modularnumber=number%10;
			
			sum=sum+(modularnumber*modularnumber*modularnumber);
			
			number=number/10;
		}
		System.out.println(sum);
	}
}
