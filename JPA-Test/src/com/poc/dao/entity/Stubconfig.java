package com.poc.dao.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the STUBCONFIG database table.
 * 
 */
@Entity
@NamedQuery(name="Stubconfig.findAll", query="SELECT s FROM Stubconfig s")
public class Stubconfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String destination;

	private String source;

	public Stubconfig() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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