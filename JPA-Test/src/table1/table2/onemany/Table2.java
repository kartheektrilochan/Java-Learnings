package table1.table2.onemany;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TABLE2 database table.
 * 
 */
@Entity
@NamedQuery(name="Table2.findAll", query="SELECT t FROM Table2 t")
public class Table2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String table2id;

	private String size2;

	//bi-directional many-to-one association to Tableone
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="GENERIC2ID", referencedColumnName="GENERICONEID")
	private Tableone tableone;

	public Table2() {
	}

	public String getTable2id() {
		return this.table2id;
	}

	public void setTable2id(String table2id) {
		this.table2id = table2id;
	}

	public String getSize2() {
		return this.size2;
	}

	public void setSize2(String size2) {
		this.size2 = size2;
	}

	public Tableone getTableone() {
		return this.tableone;
	}

	public void setTableone(Tableone tableone) {
		this.tableone = tableone;
	}

}