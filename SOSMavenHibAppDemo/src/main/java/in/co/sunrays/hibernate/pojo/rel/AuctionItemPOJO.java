package in.co.sunrays.hibernate.pojo.rel;

import java.util.Set;

/**
 * Contains AuctionItem attributes and accessor methods. AuctionItemPOJO has
 * one-to-many relation with BidPOJO
 *
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS 
 */

public class AuctionItemPOJO {

	private long id;
	private Set<BidPOJO> bids;
	private String description;
	private BidPOJO successfulBid;

	public Set<BidPOJO> getBids() {
		return bids;
	}

	public void setBids(Set<BidPOJO> bids) {
		this.bids = bids;
	}

	public BidPOJO getSuccessfulBid() {
		return successfulBid;
	}

	public void setSuccessfulBid(BidPOJO successfulBid) {
		this.successfulBid = successfulBid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
