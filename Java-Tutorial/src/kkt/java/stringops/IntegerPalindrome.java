package kkt.java.stringops;

public class IntegerPalindrome {

	public static void main(String[] args) {

		int number=10011;
		int mod;
		int reverse = 0;
		while(number>0)
		{
			mod=number%10;
			reverse=reverse*10+mod;
			number=number/10;
		}
		System.out.println(reverse);
	}

}
