/**
 * 
 */
package kkt.java.polymorphism;

/**
 * @author trilochan
 *
 */
public class PolyRuntimeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PolyParentBranch branch=new PolySubBranch1("bracnh1");
		branch.displayBranchDetailsatRuntime(branch);
		
	}

}
