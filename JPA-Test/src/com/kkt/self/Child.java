package com.kkt.self;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CHILD database table.
 * 
 */
@Entity
@NamedQuery(name="Child.findAll", query="SELECT c FROM Child c")
public class Child implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String childid;

	private String childrenname;

	//bi-directional many-to-one association to Parent
	@ManyToOne
	@JoinColumn(name="REF_PARENT_ID")
	private Parent parent;

	public Child() {
	}

	public String getChildid() {
		return this.childid;
	}

	public void setChildid(String childid) {
		this.childid = childid;
	}

	public String getChildrenname() {
		return this.childrenname;
	}

	public void setChildrenname(String childrenname) {
		this.childrenname = childrenname;
	}

	public Parent getParent() {
		return this.parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

}