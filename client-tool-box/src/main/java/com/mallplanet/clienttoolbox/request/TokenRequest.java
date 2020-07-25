package com.mallplanet.clienttoolbox.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenRequest {
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
	@JsonProperty("token_interval")
	private String tokenInterval;
	private String token;
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
	public String getTokenInterval() {
		return tokenInterval;
	}
	public void setTokenInterval(String tokenInterval) {
		this.tokenInterval = tokenInterval;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
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
