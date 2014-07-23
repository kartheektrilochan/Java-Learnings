package kkt.java.classrelated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Example3WithPrivateClient {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args){
		Example3WithPrivate eg3=Example3WithPrivate.createObj("kartheek", new Date());
		System.out.println(eg3.getRemindDate());
		
	}

}
