package com.poc.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the STUBTAB database table.
 * 
 */
@Entity
@NamedQuery(name="Stubtab.findAll", query="SELECT s FROM Stubtab s")
public class Stubtab implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String datatype;

	private String destination;

	private String source;

	public Stubtab() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDatatype() {
		return this.datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}