package com.mallplanet.clienttoolbox.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CampaignRequest {
	@JsonProperty("API")
	private String api;
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("user_password")
	private String userPassword;
	@JsonProperty("user_api_key")
	private String userApiKey;
	private String type;
	private String action;
	@JsonProperty("account_id")
	private String accountId;
	@JsonProperty("campaign_id")
	private String campaignId;
	@JsonProperty("campaign_name")
	private String campaignName;
	@JsonProperty("campaign_type")
	private String campaignType;
	private String latitude;
	private String longitude;
	private String description;
	@JsonProperty("reward_level")
	private String rewardLevel;
	@JsonProperty("reward_description")
	private String rewardDescription;
	@JsonProperty("reward_identifier")
	private String rewardIdentifier;
	@JsonProperty("promo_operation")
	private String promoOperation;
	@JsonProperty("promo_amount")
	private String promoAmount;
	@JsonProperty("promo_description")
	private String promoDescription;
	@JsonProperty("promo_custom_id")
	private String promoCustomId;
	@JsonProperty("promo_start_date")
	private String promoStartDate;
	@JsonProperty("promo_end_date")
	private String promoEndDate;
	@JsonProperty("item_description")
	private String itemDescription;
	@JsonProperty("item_identifier")
	private String itemIdentifier;
	@JsonProperty("depreciation_id")
	private String depreciationId;
	@JsonProperty("depreciation_type")
	private String depreciationType;
	@JsonProperty("depreciation_interval")
	private String depreciationInterval;
	@JsonProperty("depreciation_interval_type")
	private String depreciationIntervalType;
	@JsonProperty("depreciation_percentage")
	private String depreciationPercentage;
	@JsonProperty("fee_id")
	private String feeId;
	@JsonProperty("fee_interval")
	private String feeInterval;
	@JsonProperty("interval_type")
	private String intervalType;
	@JsonProperty("fee_amount")
	private String feeAmount;
	@JsonProperty("fee_description")
	private String feeDescription;
	@JsonProperty("new_campaign_name")
	private String newCampaignName;
	@JsonProperty("reward_id")
	private String rewardId;
	@JsonProperty("new_reward_level")
	private String newRewardLevel;
	@JsonProperty("new_reward_description")
	private String newRewardDescription;
	@JsonProperty("new_reward_identifier")
	private String newRewardIdentifier;
	@JsonProperty("promo_id")
	private String promoId;
	@JsonProperty("new_promo_operation")
	private String newPromoOperation;
	@JsonProperty("new_promo_amount")
	private String newPromoAmount;
	@JsonProperty("new_promo_description")
	private String newPromoDescription;
	@JsonProperty("new_promo_custom_id")
	private String newPromoCustomId;
	@JsonProperty("new_promo_start_date")
	private String newPromoStartDate;
	@JsonProperty("new_promo_end_date")
	private String newPromoEndDate;
	@JsonProperty("item_id")
	private String itemId;
	@JsonProperty("new_item_description")
	private String newItemDescription;
	@JsonProperty("new_item_identifier")
	private String newItemIdentifier;
	@JsonProperty("type_restrict")
	private String typeRestrict;
	private String searchField;
	private String searchOper;
	private String searchValue;
	private String sortField;
	private String sortOrder;
	private String offset;
	private String length;
	private String output;
	private String callback;
	private String condensed;
	
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserApiKey() {
		return userApiKey;
	}
	public void setUserApiKey(String userApiKey) {
		this.userApiKey = userApiKey;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignType() {
		return campaignType;
	}
	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRewardLevel() {
		return rewardLevel;
	}
	public void setRewardLevel(String rewardLevel) {
		this.rewardLevel = rewardLevel;
	}
	public String getRewardDescription() {
		return rewardDescription;
	}
	public void setRewardDescription(String rewardDescription) {
		this.rewardDescription = rewardDescription;
	}
	public String getRewardIdentifier() {
		return rewardIdentifier;
	}
	public void setRewardIdentifier(String rewardIdentifier) {
		this.rewardIdentifier = rewardIdentifier;
	}
	public String getPromoOperation() {
		return promoOperation;
	}
	public void setPromoOperation(String promoOperation) {
		this.promoOperation = promoOperation;
	}
	public String getPromoAmount() {
		return promoAmount;
	}
	public void setPromoAmount(String promoAmount) {
		this.promoAmount = promoAmount;
	}
	public String getPromoDescription() {
		return promoDescription;
	}
	public void setPromoDescription(String promoDescription) {
		this.promoDescription = promoDescription;
	}
	public String getPromoCustomId() {
		return promoCustomId;
	}
	public void setPromoCustomId(String promoCustomId) {
		this.promoCustomId = promoCustomId;
	}
	public String getPromoStartDate() {
		return promoStartDate;
	}
	public void setPromoStartDate(String promoStartDate) {
		this.promoStartDate = promoStartDate;
	}
	public String getPromoEndDate() {
		return promoEndDate;
	}
	public void setPromoEndDate(String promoEndDate) {
		this.promoEndDate = promoEndDate;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getItemIdentifier() {
		return itemIdentifier;
	}
	public void setItemIdentifier(String itemIdentifier) {
		this.itemIdentifier = itemIdentifier;
	}
	public String getDepreciationId() {
		return depreciationId;
	}
	public void setDepreciationId(String depreciationId) {
		this.depreciationId = depreciationId;
	}
	public String getDepreciationType() {
		return depreciationType;
	}
	public void setDepreciationType(String depreciationType) {
		this.depreciationType = depreciationType;
	}
	public String getDepreciationInterval() {
		return depreciationInterval;
	}
	public void setDepreciationInterval(String depreciationInterval) {
		this.depreciationInterval = depreciationInterval;
	}
	public String getDepreciationIntervalType() {
		return depreciationIntervalType;
	}
	public void setDepreciationIntervalType(String depreciationIntervalType) {
		this.depreciationIntervalType = depreciationIntervalType;
	}
	public String getDepreciationPercentage() {
		return depreciationPercentage;
	}
	public void setDepreciationPercentage(String depreciationPercentage) {
		this.depreciationPercentage = depreciationPercentage;
	}
	public String getFeeId() {
		return feeId;
	}
	public void setFeeId(String feeId) {
		this.feeId = feeId;
	}
	public String getFeeInterval() {
		return feeInterval;
	}
	public void setFeeInterval(String feeInterval) {
		this.feeInterval = feeInterval;
	}
	public String getIntervalType() {
		return intervalType;
	}
	public void setIntervalType(String intervalType) {
		this.intervalType = intervalType;
	}
	public String getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}
	public String getFeeDescription() {
		return feeDescription;
	}
	public void setFeeDescription(String feeDescription) {
		this.feeDescription = feeDescription;
	}
	public String getNewCampaignName() {
		return newCampaignName;
	}
	public void setNewCampaignName(String newCampaignName) {
		this.newCampaignName = newCampaignName;
	}
	public String getRewardId() {
		return rewardId;
	}
	public void setRewardId(String rewardId) {
		this.rewardId = rewardId;
	}
	public String getNewRewardLevel() {
		return newRewardLevel;
	}
	public void setNewRewardLevel(String newRewardLevel) {
		this.newRewardLevel = newRewardLevel;
	}
	public String getNewRewardDescription() {
		return newRewardDescription;
	}
	public void setNewRewardDescription(String newRewardDescription) {
		this.newRewardDescription = newRewardDescription;
	}
	public String getNewRewardIdentifier() {
		return newRewardIdentifier;
	}
	public void setNewRewardIdentifier(String newRewardIdentifier) {
		this.newRewardIdentifier = newRewardIdentifier;
	}
	public String getPromoId() {
		return promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}
	public String getNewPromoOperation() {
		return newPromoOperation;
	}
	public void setNewPromoOperation(String newPromoOperation) {
		this.newPromoOperation = newPromoOperation;
	}
	public String getNewPromoAmount() {
		return newPromoAmount;
	}
	public void setNewPromoAmount(String newPromoAmount) {
		this.newPromoAmount = newPromoAmount;
	}
	public String getNewPromoDescription() {
		return newPromoDescription;
	}
	public void setNewPromoDescription(String newPromoDescription) {
		this.newPromoDescription = newPromoDescription;
	}
	public String getNewPromoCustomId() {
		return newPromoCustomId;
	}
	public void setNewPromoCustomId(String newPromoCustomId) {
		this.newPromoCustomId = newPromoCustomId;
	}
	public String getNewPromoStartDate() {
		return newPromoStartDate;
	}
	public void setNewPromoStartDate(String newPromoStartDate) {
		this.newPromoStartDate = newPromoStartDate;
	}
	public String getNewPromoEndDate() {
		return newPromoEndDate;
	}
	public void setNewPromoEndDate(String newPromoEndDate) {
		this.newPromoEndDate = newPromoEndDate;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getNewItemDescription() {
		return newItemDescription;
	}
	public void setNewItemDescription(String newItemDescription) {
		this.newItemDescription = newItemDescription;
	}
	public String getNewItemIdentifier() {
		return newItemIdentifier;
	}
	public void setNewItemIdentifier(String newItemIdentifier) {
		this.newItemIdentifier = newItemIdentifier;
	}
	public String getTypeRestrict() {
		return typeRestrict;
	}
	public void setTypeRestrict(String typeRestrict) {
		this.typeRestrict = typeRestrict;
	}
	public String getSearchField() {
		return searchField;
	}
	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}
	public String getSearchOper() {
		return searchOper;
	}
	public void setSearchOper(String searchOper) {
		this.searchOper = searchOper;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	public String getSortField() {
		return sortField;
	}
	public void setSortField(String sortField) {
		this.sortField = sortField;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getOffset() {
		return offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getCallback() {
		return callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}
	public String getCondensed() {
		return condensed;
	}
	public void setCondensed(String condensed) {
		this.condensed = condensed;
	}

}
