package in.co.sunrays.hibernate.pojo.rel;

/**
 * Contains Bid attributes and accessor methods. BidPOJO has many-to-one
 * relation with AuctionItemPOJO
 *
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS 
 */

public class BidPOJO {

	long id;
	int amount;
	String timestamp;
	int itemId;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
