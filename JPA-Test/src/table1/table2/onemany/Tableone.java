package table1.table2.onemany;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TABLEONE database table.
 * 
 */
@Entity
@NamedQuery(name="Tableone.findAll", query="SELECT t FROM Tableone t")
public class Tableone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String tableoneid;

	private String sizeone;

	/*
	 * the below field is added
	 * */
	
	@Column(name="GENERICONEID")
	private String genericoneId;
	

	public String getGenericoneId() {
		return genericoneId;
	}

	public void setGenericoneId(String genericoneId) {
		this.genericoneId = genericoneId;
	}

	//bi-directional many-to-one association to Table2
	@OneToMany(mappedBy="tableone",cascade=CascadeType.ALL,orphanRemoval=true,fetch=FetchType.EAGER,targetEntity=Table2.class)
	private List<Table2> table2s;

	public Tableone() {
	}

	public String getTableoneid() {
		return this.tableoneid;
	}

	public void setTableoneid(String tableoneid) {
		this.tableoneid = tableoneid;
	}

	public String getSizeone() {
		return this.sizeone;
	}

	public void setSizeone(String sizeone) {
		this.sizeone = sizeone;
	}

	public List<Table2> getTable2s() {
		return this.table2s;
	}

	public void setTable2s(List<Table2> table2s) {
		this.table2s = table2s;
	}

	public Table2 addTable2(Table2 table2) {
		getTable2s().add(table2);
		table2.setTableone(this);

		return table2;
	}

	public Table2 removeTable2(Table2 table2) {
		getTable2s().remove(table2);
		table2.setTableone(null);

		return table2;
	}

}