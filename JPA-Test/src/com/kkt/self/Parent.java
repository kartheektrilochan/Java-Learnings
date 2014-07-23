package com.kkt.self;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PARENT database table.
 * 
 */
@Entity
@NamedQuery(name="Parent.findAll", query="SELECT p FROM Parent p")
public class Parent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String parentid;

	@Column(name="CHILDREN_FORIEGN_ID")
	private String childrenForiegnId;

	private String childrenid;

	//bi-directional many-to-one association to Child
	@OneToMany(mappedBy="parent",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Child> childs;

	public Parent() {
	}

	public String getParentid() {
		return this.parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getChildrenForiegnId() {
		return this.childrenForiegnId;
	}

	public void setChildrenForiegnId(String childrenForiegnId) {
		this.childrenForiegnId = childrenForiegnId;
	}

	public String getChildrenid() {
		return this.childrenid;
	}

	public void setChildrenid(String childrenid) {
		this.childrenid = childrenid;
	}

	public List<Child> getChilds() {
		return this.childs;
	}

	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}

	public Child addChild(Child child) {
		getChilds().add(child);
		child.setParent(this);

		return child;
	}

	public Child removeChild(Child child) {
		getChilds().remove(child);
		child.setParent(null);

		return child;
	}

}