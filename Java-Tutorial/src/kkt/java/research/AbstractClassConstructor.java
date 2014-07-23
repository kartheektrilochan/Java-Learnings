/**
 * 
 */
package kkt.java.research;

/**
 * @author trilochan
 *
 */
public abstract class AbstractClassConstructor {
	
	public void displayName(String name) {
		System.out.println("Hellow world");
	}
	public AbstractClassConstructor() {
		System.out.println("this is in constructor");
	}
	public abstract String calculateBudget(String value);
}
