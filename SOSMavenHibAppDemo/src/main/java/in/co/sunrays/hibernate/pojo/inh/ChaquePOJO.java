package in.co.sunrays.hibernate.pojo.inh;

/**
 * Contains Chaque attributes and accessor methods.
 *
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS 
 */
public class ChaquePOJO extends PaymentPOJO {
	private int chaquenumber;
	private String bankname;

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public int getChaquenumber() {
		return chaquenumber;
	}

	public void setChaquenumber(int chaquenumber) {
		this.chaquenumber = chaquenumber;
	}
}
