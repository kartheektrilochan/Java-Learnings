package kkt.java.design.patterns;

public class SingleTonDesignPattern {
	
	private static SingleTonDesignPattern singletoninstance;

	/**
	 * 
	 */
	public SingleTonDesignPattern() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static SingleTonDesignPattern getsigletoninstance()
	{
		if(null==singletoninstance)
		{
			singletoninstance=new SingleTonDesignPattern();
		}
		return singletoninstance;
	}

}
