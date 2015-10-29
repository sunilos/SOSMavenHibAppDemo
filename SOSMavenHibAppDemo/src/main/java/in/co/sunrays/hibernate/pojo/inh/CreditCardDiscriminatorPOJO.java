package in.co.sunrays.hibernate.pojo.inh;

/**
 * Contains CreditCardDiscriminator attributes and accessor methods.
 *
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS 
 */
public class CreditCardDiscriminatorPOJO extends PaymentDiscriminatorPOJO {
	private int cctype;

	public int getCctype() {
		return cctype;
	}

	public void setCctype(int cctype) {
		this.cctype = cctype;
	}
}
