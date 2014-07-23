package kkt.java.polymorphism;

public class PolyParentBranch {
	
	private String name;
	
	public PolyParentBranch(String name) {
	
		this.name=name;
	}
	
	public void displayBranchDetails()
	{
		System.out.println("this is the branch name:"+name);
	}
	
	public void displayBranchDetailsatRuntime(PolyParentBranch branch)
	{
		System.out.println("this is branch:"+branch);
	}

}
