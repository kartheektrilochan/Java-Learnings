package kkt.java.interviews.cts;

public class CTSSubClass extends CTSSuperClass{
	public CTSSuperClass someMethod(String name) throws Exception{
		System.out.println("this is in sub class:"+name);
		return new CTSSubClass();
	}
 
}
