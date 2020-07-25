package com.mallplanet.clienttoolbox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class Item {	
	@SerializedName(value = "item_id", alternate = "id")
	private String itemId;
	private String status;
	private String name;
	private String description;
	private String quantity;
	private String balance;
	private String earned;
	private String cumulative;
	private String redeemed;
	@SerializedName("earn_ratio")
	private String earnRatio;
	@SerializedName("reward_id")
	private String rewardId;
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getEarned() {
		return earned;
	}
	public void setEarned(String earned) {
		this.earned = earned;
	}
	public String getCumulative() {
		return cumulative;
	}
	public void setCumulative(String cumulative) {
		this.cumulative = cumulative;
	}
	public String getRedeemed() {
		return redeemed;
	}
	public void setRedeemed(String redeemed) {
		this.redeemed = redeemed;
	}
	public String getEarnRatio() {
		return earnRatio;
	}
	public void setEarnRatio(String earnRatio) {
		this.earnRatio = earnRatio;
	}
	public String getRewardId() {
		return rewardId;
	}
	public void setRewardId(String rewardId) {
		this.rewardId = rewardId;
	}
}
