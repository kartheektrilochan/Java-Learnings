package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PARTY database table.
 * 
 */
@Entity
@NamedQuery(name="Party.findAll", query="SELECT p FROM Party p")
public class Party implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String partyid;

	private BigDecimal addid;

	private String address3;

	private String address4;

	private String status;

	private String types;

	public Party() {
	}

	public String getPartyid() {
		return this.partyid;
	}

	public void setPartyid(String partyid) {
		this.partyid = partyid;
	}

	public BigDecimal getAddid() {
		return this.addid;
	}

	public void setAddid(BigDecimal addid) {
		this.addid = addid;
	}

	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return this.address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

}