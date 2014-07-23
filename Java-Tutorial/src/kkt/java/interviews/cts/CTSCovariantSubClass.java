package kkt.java.interviews.cts;

public class CTSCovariantSubClass extends CTSCovarirntSuperClass{

	public CTSCovariantSubClass someMethod(String name)
	{
		System.out.println("this is a method in sub class:"+CTSCovariantSubClass.class +" param: "+name);
		return new CTSCovariantSubClass();
	}
	public static void main(String[] args) {
		System.out.println(new CTSCovariantSubClass().someMethod("kartheek"));
	}

}
