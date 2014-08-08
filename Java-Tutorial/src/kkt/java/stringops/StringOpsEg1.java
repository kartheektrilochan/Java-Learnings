package kkt.java.stringops;

import java.util.HashSet;
import java.util.Set;

import com.sun.xml.internal.ws.util.StringUtils;

public class StringOpsEg1 {

	public static void main(String[] args) {
		String var="kartheek Trilochan";
		//StringUtils st=new StringUtils();
		char[] charray=var.toCharArray();
		Set<Character> set=new HashSet<>();
		for(int i=0;i<charray.length;i++)
		{
			set.add(charray[i]);
		}
		System.out.println(set);
	}

}
