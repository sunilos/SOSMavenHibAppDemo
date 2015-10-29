package in.co.sunrays.hibernate.pojo.rel;

/**
 * Contains Supplier attributes and accessor methods. SupplierPOJO has
 * many-to-many relation with OrganizationPOJO
 *
 *  * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS */
public class SupplierPOJO {

	private Long supplierId;
	private String name;
	private String adrress;
	private String phoneNo;

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdrress() {
		return adrress;
	}

	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
