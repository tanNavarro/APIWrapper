package com.mallplanet.clienttoolbox.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountRequest {
	@JsonProperty("API")
	private String api;
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("user_password")
	private String userPassword;
	@JsonProperty("user_api_key")
	private String userApiKey;
	private String type;
	private String output;
	private String agency;
	@JsonProperty("contact_email")
	private String contactEmail;
	@JsonProperty("contact_first_name")
	private String contactFirstName;
	@JsonProperty("contact_last_name")
	private String contactLastName;
	@JsonProperty("contact_phone")
	private String contactPhone;
	@JsonProperty("client_email")
	private String clientEmail;
	@JsonProperty("biz_name")
	private String bizName;
	@JsonProperty("biz_address1")
	private String bizAddress1;
	@JsonProperty("biz_address2")
	private String bizAddress2;
	@JsonProperty("biz_city")
	private String bizCity;
	@JsonProperty("biz_state")
	private String bizState;
	@JsonProperty("biz_zip")
	private String bizZip;
	@JsonProperty("biz_country")
	private String bizCountry;
	@JsonProperty("new_account_password")
	private String newAccountPassword;
	@JsonProperty("language_selector")
	private String languageSelector;
	@JsonProperty("symbol_selector")
	private String symbolSelector;
	@JsonProperty("timezone_selector")
	private String timezoneSelector;
	@JsonProperty("referrer_name")
	private String referrerName;
	private String activate;
	@JsonProperty("mailchimp_username")
	private String mailchimpUsername;
	@JsonProperty("mailchimp_password")
	private String mailchimpPassword;
	@JsonProperty("sms_username")
	private String smsUsername;
	@JsonProperty("sms_password")
	private String smsPassword;
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
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactFirstName() {
		return contactFirstName;
	}
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	public String getContactLastName() {
		return contactLastName;
	}
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getBizName() {
		return bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}
	public String getBizAddress1() {
		return bizAddress1;
	}
	public void setBizAddress1(String bizAddress1) {
		this.bizAddress1 = bizAddress1;
	}
	public String getBizAddress2() {
		return bizAddress2;
	}
	public void setBizAddress2(String bizAddress2) {
		this.bizAddress2 = bizAddress2;
	}
	public String getBizCity() {
		return bizCity;
	}
	public void setBizCity(String bizCity) {
		this.bizCity = bizCity;
	}
	public String getBizState() {
		return bizState;
	}
	public void setBizState(String bizState) {
		this.bizState = bizState;
	}
	public String getBizZip() {
		return bizZip;
	}
	public void setBizZip(String bizZip) {
		this.bizZip = bizZip;
	}
	public String getBizCountry() {
		return bizCountry;
	}
	public void setBizCountry(String bizCountry) {
		this.bizCountry = bizCountry;
	}
	public String getNewAccountPassword() {
		return newAccountPassword;
	}
	public void setNewAccountPassword(String newAccountPassword) {
		this.newAccountPassword = newAccountPassword;
	}
	public String getLanguageSelector() {
		return languageSelector;
	}
	public void setLanguageSelector(String languageSelector) {
		this.languageSelector = languageSelector;
	}
	public String getSymbolSelector() {
		return symbolSelector;
	}
	public void setSymbolSelector(String symbolSelector) {
		this.symbolSelector = symbolSelector;
	}
	public String getTimezoneSelector() {
		return timezoneSelector;
	}
	public void setTimezoneSelector(String timezoneSelector) {
		this.timezoneSelector = timezoneSelector;
	}
	public String getReferrerName() {
		return referrerName;
	}
	public void setReferrerName(String referrerName) {
		this.referrerName = referrerName;
	}
	public String getActivate() {
		return activate;
	}
	public void setActivate(String activate) {
		this.activate = activate;
	}
	public String getMailchimpUsername() {
		return mailchimpUsername;
	}
	public void setMailchimpUsername(String mailchimpUsername) {
		this.mailchimpUsername = mailchimpUsername;
	}
	public String getMailchimpPassword() {
		return mailchimpPassword;
	}
	public void setMailchimpPassword(String mailchimpPassword) {
		this.mailchimpPassword = mailchimpPassword;
	}
	public String getSmsUsername() {
		return smsUsername;
	}
	public void setSmsUsername(String smsUsername) {
		this.smsUsername = smsUsername;
	}
	public String getSmsPassword() {
		return smsPassword;
	}
	public void setSmsPassword(String smsPassword) {
		this.smsPassword = smsPassword;
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
