package in.co.sunrays.hibernate.pojo.rel;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains Organization attributes and accessor methods. OrganizationPOJO has
 * many-to-many relation with SupplierPOJO
 *
 * * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS  */
public class OrganizationPOJO {

	private Long organizationId;
	private String name;
	private String adrress;
	private String phoneNo;
	private Set<SupplierPOJO> suppliers = new HashSet<SupplierPOJO>();

	public Set<SupplierPOJO> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(Set<SupplierPOJO> suppliers) {
		this.suppliers = suppliers;
	}

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
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
