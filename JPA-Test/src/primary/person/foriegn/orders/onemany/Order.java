package primary.person.foriegn.orders.onemany;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ORDERS database table.
 * 
 */
@Entity
@Table(name="ORDERS")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String orderid;

	private String itemname;

	//bi-directional many-to-one association to Person
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="PERSONID")
	private Person person;

	public Order() {
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}