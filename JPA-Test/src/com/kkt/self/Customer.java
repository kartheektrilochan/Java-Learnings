package com.kkt.self;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CUSTOMER database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String customerid;

	private String customername;

	//bi-directional one-to-one association to Address
	@OneToOne(mappedBy="customer",cascade=CascadeType.ALL,fetch=FetchType.EAGER,targetEntity=Address.class,orphanRemoval=true)
	private Address address;

	public Customer() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return this.customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}