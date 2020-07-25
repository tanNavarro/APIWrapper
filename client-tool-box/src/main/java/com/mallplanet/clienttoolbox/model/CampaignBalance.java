package com.mallplanet.clienttoolbox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class CampaignBalance {
	@SerializedName("campaign_id")
	private String campaignid;
	@SerializedName("campaign_type")
	private String campaigntype;
	@SerializedName("campaign_name")
	private String campaignName;
	@SerializedName("reward_ratio")
	private String rewardRatio;
	private Customer customer;
	
	public String getCampaignid() {
		return campaignid;
	}
	public void setCampaignid(String campaignid) {
		this.campaignid = campaignid;
	}
	public String getCampaigntype() {
		return campaigntype;
	}
	public void setCampaigntype(String campaigntype) {
		this.campaigntype = campaigntype;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getRewardRatio() {
		return rewardRatio;
	}
	public void setRewardRatio(String rewardRatio) {
		this.rewardRatio = rewardRatio;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
