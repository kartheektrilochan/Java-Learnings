package kkt.java.stringops;

public class PalindromeString {

	public static void main(String[] args) {
		int x=10010;
		String s1=Integer.toString(x);
		StringBuffer bf=new StringBuffer(s1);
		String s2=bf.reverse().toString();
		int y=Integer.parseInt(s2);
		if(y==x)
		{
			System.out.println("both are equal");
		}
		
	}

}
