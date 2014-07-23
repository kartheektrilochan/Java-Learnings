package kkt.java.research;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		String s="getAddress";
	//	String pattern=
		/*Pattern p=Pattern.compile(arg0)
		 * inputVal.substring(0,1).toUpperCase()
        + inputVal.substring(1).toLowerCase();
		 * */
		//System.out.println(s.toLowerCase());
		String value="Address";
		System.out.println(value.substring(1).toLowerCase());
		value=value.substring(0,1).toUpperCase() + value.substring(1).toLowerCase();
		
		
		System.out.println(s.contains(value));
	}

}
