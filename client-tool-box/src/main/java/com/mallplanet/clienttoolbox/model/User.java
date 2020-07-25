package com.mallplanet.clienttoolbox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class User {
	@SerializedName("user_permissions")
	private UserPermission userPermissions;
	@SerializedName("allowed_campaigns")
	private AllowedCampaign allowedCampaigns;
	@SerializedName("user_id")
	private String userId;
	@SerializedName("user_api_key")
	private String userApiKey;
	@SerializedName("user_is_owner")
	private String userIsOwner;
	@SerializedName("user_first_name")
	private String userFirstName;
	@SerializedName("user_last_name")
	private String userLastName;
	@SerializedName("user_password")
	private String userPassword;
	@SerializedName("user_PIN")
	private String userPIN;
	@SerializedName("user_addtl_info")
	private String userAddtlInfo;
	@SerializedName("user_language")
	private String userLanguage;
	@SerializedName("user_language_custom")
	private String userLanguageCustom;
	@SerializedName("user_timezone")
	private String userTimezone;
	@SerializedName("user_level")
	private String userLevel;
	@SerializedName("account_c2t")
	private String accountC2t;
	@SerializedName("account_coalition")
	private String accountCoalition;
	
	public UserPermission getUserPermissions() {
		return userPermissions;
	}
	public void setUser_Permissions(UserPermission userPermissions) {
		this.userPermissions = userPermissions;
	}
	public AllowedCampaign getAllowedCampaigns() {
		return allowedCampaigns;
	}
	public void setAllowedCampaigns(AllowedCampaign allowedCampaigns) {
		this.allowedCampaigns = allowedCampaigns;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserApiKey() {
		return userApiKey;
	}
	public void setUserApiKey(String userApiKey) {
		this.userApiKey = userApiKey;
	}
	public String getUserIsOwner() {
		return userIsOwner;
	}
	public void setUserIsOwner(String userIsOwner) {
		this.userIsOwner = userIsOwner;
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPIN() {
		return userPIN;
	}
	public void setUserPIN(String userPIN) {
		this.userPIN = userPIN;
	}
	public String getUserAddtlInfo() {
		return userAddtlInfo;
	}
	public void setUserAddtlInfo(String userAddtlInfo) {
		this.userAddtlInfo = userAddtlInfo;
	}
	public String getUserLanguage() {
		return userLanguage;
	}
	public void setUserLanguage(String userLanguage) {
		this.userLanguage = userLanguage;
	}
	public String getUserLanguageCustom() {
		return userLanguageCustom;
	}
	public void setUserLanguageCustom(String userLanguageCustom) {
		this.userLanguageCustom = userLanguageCustom;
	}
	public String getUserTimezone() {
		return userTimezone;
	}
	public void setUserTimezone(String userTimezone) {
		this.userTimezone = userTimezone;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	public String getAccountC2t() {
		return accountC2t;
	}
	public void setAccountC2t(String accountC2t) {
		this.accountC2t = accountC2t;
	}
	public String getAccountCoalition() {
		return accountCoalition;
	}
	public void setAccountCoalition(String accountCoalition) {
		this.accountCoalition = accountCoalition;
	}
	
}
