package com.mallplanet.clienttoolbox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class Reward {
	private String status;
	private String id;
	private String name;
	private String level;
	private String description;
	@SerializedName("needed_to_redeem")
	private String neededToRedeem;
	@SerializedName("reward_id")
	private String rewardId;
	@SerializedName("earn_ratio")
	private String earnRatio;
	@SerializedName("item_id")
	private String itemId;	
	@SerializedName("reward_url")
	private String rewardUrl;
	@SerializedName("reward_long_description")
	private String rewardLongDescription;
	@SerializedName("reward_conditions")
	private String rewardConditions;
	@SerializedName("reward_dates_available")
	private String rewardDatesAvailable;
	@SerializedName("reward_quantity_available")
	private String rewardQuantityAvailable;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNeededToRedeem() {
		return neededToRedeem;
	}
	public void setNeededToRedeem(String neededToRedeem) {
		this.neededToRedeem = neededToRedeem;
	}
	public String getRewardId() {
		return rewardId;
	}
	public void setRewardId(String rewardId) {
		this.rewardId = rewardId;
	}
	public String getEarnRatio() {
		return earnRatio;
	}
	public void setEarnRatio(String earnRatio) {
		this.earnRatio = earnRatio;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getRewardUrl() {
		return rewardUrl;
	}
	public void setRewardUrl(String rewardUrl) {
		this.rewardUrl = rewardUrl;
	}
	public String getRewardLongDescription() {
		return rewardLongDescription;
	}
	public void setRewardLongDescription(String rewardLongDescription) {
		this.rewardLongDescription = rewardLongDescription;
	}
	public String getRewardConditions() {
		return rewardConditions;
	}
	public void setRewardConditions(String rewardConditions) {
		this.rewardConditions = rewardConditions;
	}
	public String getRewardDatesAvailable() {
		return rewardDatesAvailable;
	}
	public void setRewardDatesAvailable(String rewardDatesAvailable) {
		this.rewardDatesAvailable = rewardDatesAvailable;
	}
	public String getRewardQuantityAvailable() {
		return rewardQuantityAvailable;
	}
	public void setRewardQuantityAvailable(String rewardQuantityAvailable) {
		this.rewardQuantityAvailable = rewardQuantityAvailable;
	}
}
