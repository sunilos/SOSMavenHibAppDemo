package in.co.sunrays.hibernate.pojo.inh;

/**
 * Contains PaymentHierarchy attributes and accessor methods.
 *
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS 
 */
public class PaymentHierarchyPOJO {
	private long paymentid;
	private int amount;
	private String paymentType;

	public long getPaymentid() {
		return paymentid;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public void setPaymentid(long paymentid) {
		this.paymentid = paymentid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
