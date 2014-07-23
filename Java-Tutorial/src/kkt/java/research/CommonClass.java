/**
 * 
 */
package kkt.java.research;

/**
 * @author trilochan
 *
 */
public class CommonClass extends AbstractClassConstructor{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommonClass comObj=new CommonClass();
		comObj.displayName("Kartheek");
		/*AbstractClassConstructor abstObj=new CommonClass();
		abstObj.displayName("hello");
		abstObj.calculateBudget("buget");*/
	}

	@Override
	public String calculateBudget(String value) {
		System.out.println(value);
		
		return null;
	}

}
