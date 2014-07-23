package kkt.java.classrelated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Example3WithPrivate {

	private String name;
	
	private final Date remindDate;

	private Example3WithPrivate(String name, Date remindDate) {
		this.name = name;
		this.remindDate = remindDate;
	}

	public String getName() {
		return name;
	}


	public Date getRemindDate() {
		return (Date) remindDate.clone();
		//return remindDate;
	}
	
	public static Example3WithPrivate createObj(String nam,Date d)
	{
		return new Example3WithPrivate(nam, d);
	}
}
