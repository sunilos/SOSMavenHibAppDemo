package in.co.sunrays.hibernate.pojo.inh;

/**
 * Contains Payment attributes and accessor methods.
 *
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS 
 */
public class PaymentPOJO {
	private long paymentid;
	private int amount;

	public long getPaymentid() {
		return paymentid;
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
