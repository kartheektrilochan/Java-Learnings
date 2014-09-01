/**
 * @author:TERMINATOR
 */
package kkt.java.classrelated;

/**
 * @author TERMINATOR
 *
 */
public class StaticBlockExample {

	/**
	 * @param args
	 * 
	 */
	static String name;
	
	static{
		name="kartheek";
		System.out.println("this is called in static block");
		String arg[]={name,"jadsd"};
		main(arg);
	}
	public static void main(String[] args) {
		StaticBlockExample staticBlockExample=new StaticBlockExample();
		staticBlockExample.display();
		
	}
	
	void display()
	{
		System.out.println("this is in display method:"+name);
	}

}
