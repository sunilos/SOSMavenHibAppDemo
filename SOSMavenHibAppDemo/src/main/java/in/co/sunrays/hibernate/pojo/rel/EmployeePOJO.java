package in.co.sunrays.hibernate.pojo.rel;

/**
 * Contains Employee attributes and accessor methods. EmployeePOJO has
 * one-to-one relation with AddressPOJO
 *
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS 
 */
public class EmployeePOJO {

	private long id;

	private String firstName;

	private String lastName;

	private AddressPOJO address;

	public AddressPOJO getAddress() {
		return address;
	}

	public void setAddress(AddressPOJO address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getKey() {
		return id + "";
	}

	public String getValue() {
		return firstName + " " + lastName;
	}

}
