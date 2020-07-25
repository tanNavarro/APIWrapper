package com.mallplanet.clienttoolbox.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {
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
	private String type;
	@JsonProperty("user_name")
	private String userName;
	@JsonProperty("user_new_password")
	private String userNewPassword;
	@JsonProperty("user_first_name")
	private String userFirstName;
	@JsonProperty("user_last_name")
	private String userLastName;
	@JsonProperty("user_custom1")
	private String userCustom1;
	@JsonProperty("user_PIN")
	private String userPIN;
	@JsonProperty("language_selector")
	private String languageSelector;
	@JsonProperty("language_custom")
	private String languageCustom;
	@JsonProperty("timezone_selector")
	private String timezoneSelector;
	@JsonProperty("user_role")
	private String userRole;
	@JsonProperty("allowed_campaigns")
	private String allowedCampaigns;
	private String action;
	private String searchField;
	private String searchOper;
	private String searchValue;
	private String sortField;
	private String sortOrder;
	private String offset;
	private String length;
	@JsonProperty("show_permissions")
	private String showPermissions;
	@JsonProperty("campaign_id")
	private String campaignId;
	@JsonProperty("users_list")
	private String usersList;
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
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNewPassword() {
		return userNewPassword;
	}
	public void setUserNewPassword(String userNewPassword) {
		this.userNewPassword = userNewPassword;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserCustom1() {
		return userCustom1;
	}
	public void setUserCustom1(String userCustom1) {
		this.userCustom1 = userCustom1;
	}
	public String getUserPIN() {
		return userPIN;
	}
	public void setUserPIN(String userPIN) {
		this.userPIN = userPIN;
	}
	public String getLanguageSelector() {
		return languageSelector;
	}
	public void setLanguageSelector(String languageSelector) {
		this.languageSelector = languageSelector;
	}
	public String getLanguageCustom() {
		return languageCustom;
	}
	public void setLanguageCustom(String languageCustom) {
		this.languageCustom = languageCustom;
	}
	public String getTimezoneSelector() {
		return timezoneSelector;
	}
	public void setTimezoneSelector(String timezoneSelector) {
		this.timezoneSelector = timezoneSelector;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getAllowedCampaigns() {
		return allowedCampaigns;
	}
	public void setAllowedCampaigns(String allowedCampaigns) {
		this.allowedCampaigns = allowedCampaigns;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
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
	public String getShowPermissions() {
		return showPermissions;
	}
	public void setShowPermissions(String showPermissions) {
		this.showPermissions = showPermissions;
	}
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getUsersList() {
		return usersList;
	}
	public void setUsersList(String usersList) {
		this.usersList = usersList;
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
