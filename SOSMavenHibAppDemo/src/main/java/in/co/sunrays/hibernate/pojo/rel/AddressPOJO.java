package in.co.sunrays.hibernate.pojo.rel;

/**
 * Contains Address attributes and accessor methods. AddressPOJO has one-to-one
 * relation with EmployeePOJO
 *
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS 
 */

public class AddressPOJO {

	private long id;

	private String street;

	private String city;

	private String state;

	private String zip;

	private String email;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
