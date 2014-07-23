package kkt.java.interviews.cts;

public class CTSSuperClass {
	
	public CTSSuperClass someMethod(String name) throws Exception{
		
		System.out.println("this is in super class:"+name);
		return new CTSSuperClass();
		
	}

}
