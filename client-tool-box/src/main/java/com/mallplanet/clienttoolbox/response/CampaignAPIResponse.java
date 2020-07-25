package com.mallplanet.clienttoolbox.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;
import com.mallplanet.clienttoolbox.model.Campaign;
import com.mallplanet.clienttoolbox.model.Depreciation;
import com.mallplanet.clienttoolbox.model.Fee;
import com.mallplanet.clienttoolbox.model.Item;
import com.mallplanet.clienttoolbox.model.Pagination;
import com.mallplanet.clienttoolbox.model.Promotion;
import com.mallplanet.clienttoolbox.model.Reward;

@JsonInclude(Include.NON_NULL)
public class CampaignAPIResponse {
	private String status;
	private String error;
	private List<String> errors;
	private Campaign campaign;
	private Pagination pagination;
	private Reward reward;
	private Promotion promo;
	private Item item;
	private Depreciation depreciation;
	private Fee fee;
	private List<Campaign> campaigns;
	private List<Reward> rewards;
	private List<Promotion> promotions;
	private List<Depreciation> depreciations;	
	@SerializedName("buyx_items")
	private List<Item> buyXItems;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	public Reward getReward() {
		return reward;
	}
	public void setReward(Reward reward) {
		this.reward = reward;
	}
	public Promotion getPromo() {
		return promo;
	}
	public void setPromo(Promotion promo) {
		this.promo = promo;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Depreciation getDepreciation() {
		return depreciation;
	}
	public void setDepreciation(Depreciation depreciation) {
		this.depreciation = depreciation;
	}
	public Fee getFee() {
		return fee;
	}
	public void setFee(Fee fee) {
		this.fee = fee;
	}
	public List<Campaign> getCampaigns() {
		return campaigns;
	}
	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}
	public List<Reward> getRewards() {
		return rewards;
	}
	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}
	public List<Promotion> getPromotions() {
		return promotions;
	}
	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}
	public List<Depreciation> getDepreciations() {
		return depreciations;
	}
	public void setDepreciations(List<Depreciation> depreciations) {
		this.depreciations = depreciations;
	}
	public List<Item> getBuyXItems() {
		return buyXItems;
	}
	public void setBuyXItems(List<Item> buyXItems) {
		this.buyXItems = buyXItems;
	}	
}
