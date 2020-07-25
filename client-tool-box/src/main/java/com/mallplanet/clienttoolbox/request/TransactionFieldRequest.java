package com.mallplanet.clienttoolbox.request;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionFieldRequest {
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
	private String action;
	@JsonProperty("web_update")
	private String webUpdate;
	@JsonProperty("field_list")
	private String fieldList;
	private String output;
	private String callback;
	private String condensed;
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
	public String getWebUpdate() {
		return webUpdate;
	}
	public void setWebUpdate(String webUpdate) {
		this.webUpdate = webUpdate;
	}
	public String getFieldList() {
		return fieldList;
	}
	public void setFieldList(String fieldList) {
		this.fieldList = fieldList;
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
	public Map<String, String> getCustomFields() {
		return customFields;
	}
	public void setCustomFields(Map<String, String> customFields) {
		this.customFields = customFields;
	}
}
