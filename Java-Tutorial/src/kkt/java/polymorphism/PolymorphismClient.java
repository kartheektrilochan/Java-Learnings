/**
 * 
 */
package kkt.java.polymorphism;

/**
 * @author trilochan
 *
 */
public class PolymorphismClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PolyParentBranch branch1=new PolySubBranch1("Branch1");
		PolyParentBranch branch2=new PolySubBranch1("Branch2");
		branch1.displayBranchDetails();
		branch2.displayBranchDetails();
		
	}

}
