package kkt.java.polymorphism;

import kkt.java.research.ParentClass;


public class PolySubBranch2 extends PolyParentBranch{

	String name;
	
	public PolySubBranch2(String name) {
		super(name);
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public void displayBranchDetails()
	{
		super.displayBranchDetails();
	}
}
