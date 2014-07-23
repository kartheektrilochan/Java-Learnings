package com.kkt.self;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ADDRESS database table.
 * 
 */
@Entity
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String addressid;

	private String address1;

	private String address2;

	//bi-directional one-to-one association to Customer
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="ADDRESSID",insertable=false,updatable=false)
	private Customer customer;

	public Address() {
	}

	public String getAddressid() {
		return this.addressid;
	}

	public void setAddressid(String addressid) {
		this.addressid = addressid;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}