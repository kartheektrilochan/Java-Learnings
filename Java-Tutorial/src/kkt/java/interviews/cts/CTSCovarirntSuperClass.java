package kkt.java.interviews.cts;

public class CTSCovarirntSuperClass {
	
	public CTSCovarirntSuperClass someMethod(String name){
		System.out.println("This is a method in suer class:"+CTSCovarirntSuperClass.class+" param"+name);
		return new CTSCovarirntSuperClass();
	}

}
