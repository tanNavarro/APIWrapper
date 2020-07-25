package com.mallplanet.clienttoolbox.request;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionRequest {
	@JsonProperty("API")
	private String api;
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("user_password")
	private String userPassword;
	@JsonProperty("user_api_key")
	private String userApiKey;
	@JsonProperty("account_id")
	private String accountId;
	private String code;
	@JsonProperty("card_number")
	private String cardNumber;
	@JsonProperty("campaign_id")
	private String campaignId;
	private String amount;
	@JsonProperty("promo_id")
	private String promoId;
	private String authorization;
	@JsonProperty("send_transaction_email")
	private String sendTransactionEmail;
	@JsonProperty("serviceProduct")
	private String service_product;
	@JsonProperty("buyx_quantity")
	private String buyxQuantity;
	@JsonProperty("campaignId")
	private String campaign_id;
	@JsonProperty("custom_points_redeem")
	private String customPointsRedeem;
	@JsonProperty("custom_dollars_redeem")
	private String customDollarsRedeem;
	@JsonProperty("reward_to_redeem")
	private String rewardToRedeem;	
	private String delimiter;
	@JsonProperty("apply_ratio")
	private String applyRatio;
	@JsonProperty("allow-undo")
	private String allowUndo;
	@JsonProperty("Visits_Data")
	private String visitData;
	@JsonProperty("transaction_id")
	private String transactionId;	
	private String type;
	private String output;
	private String callback;
	private String condensed;
	
	private Map<String, String> visitsHeader;
	private Map<String, String> customFields;
	
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
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPromoId() {
		return promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}
	public String getAuthorization() {
		return authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}
	public String getSendTransactionEmail() {
		return sendTransactionEmail;
	}
	public void setSendTransactionEmail(String sendTransactionEmail) {
		this.sendTransactionEmail = sendTransactionEmail;
	}
	public String getService_product() {
		return service_product;
	}
	public void setService_product(String service_product) {
		this.service_product = service_product;
	}
	public String getBuyxQuantity() {
		return buyxQuantity;
	}
	public void setBuyxQuantity(String buyxQuantity) {
		this.buyxQuantity = buyxQuantity;
	}
	public String getCampaign_id() {
		return campaign_id;
	}
	public void setCampaign_id(String campaign_id) {
		this.campaign_id = campaign_id;
	}
	public String getCustomPointsRedeem() {
		return customPointsRedeem;
	}
	public void setCustomPointsRedeem(String customPointsRedeem) {
		this.customPointsRedeem = customPointsRedeem;
	}
	public String getCustomDollarsRedeem() {
		return customDollarsRedeem;
	}
	public void setCustomDollarsRedeem(String customDollarsRedeem) {
		this.customDollarsRedeem = customDollarsRedeem;
	}
	public String getRewardToRedeem() {
		return rewardToRedeem;
	}
	public void setRewardToRedeem(String rewardToRedeem) {
		this.rewardToRedeem = rewardToRedeem;
	}
	public String getDelimiter() {
		return delimiter;
	}
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
	public String getApplyRatio() {
		return applyRatio;
	}
	public void setApplyRatio(String applyRatio) {
		this.applyRatio = applyRatio;
	}
	public String getAllowUndo() {
		return allowUndo;
	}
	public void setAllowUndo(String allowUndo) {
		this.allowUndo = allowUndo;
	}
	public String getVisitData() {
		return visitData;
	}
	public void setVisitData(String visitData) {
		this.visitData = visitData;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public Map<String, String> getVisitsHeader() {
		return visitsHeader;
	}
	public void setVisitsHeader(Map<String, String> visitsHeader) {
		this.visitsHeader = visitsHeader;
	}
	public Map<String, String> getCustomFields() {
		return customFields;
	}
	public void setCustomFields(Map<String, String> customFields) {
		this.customFields = customFields;
	}
}
