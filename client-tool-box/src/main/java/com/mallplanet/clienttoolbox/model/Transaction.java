package com.mallplanet.clienttoolbox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class Transaction {
	private String id;
	private String date;
	private String amount;
	@SerializedName("orig_amount")
	private String origAmount;
	private String redeemed;
	private String authorization;
	@SerializedName("user_name")
	private String userName;
	private String activation;
	
	@SerializedName("custom_field_2")
	private Field customField2;
	private Purchase purchase;
	private Record recorded;
	private Balance balance;	
	@SerializedName("cummulative_balance")
	private CumulativeBalance cumulativeBalance;
	@SerializedName("coalition_cumulative_balance")
	private CoalitionCummulativeBalance coalitionCumulativeBalance;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getOrigAmount() {
		return origAmount;
	}
	public void setOrigAmount(String origAmount) {
		this.origAmount = origAmount;
	}
	public String getRedeemed() {
		return redeemed;
	}
	public void setRedeemed(String redeemed) {
		this.redeemed = redeemed;
	}
	public String getAuthorization() {
		return authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getActivation() {
		return activation;
	}
	public void setActivation(String activation) {
		this.activation = activation;
	}
	public Field getCustomField2() {
		return customField2;
	}
	public void setCustomField2(Field customField2) {
		this.customField2 = customField2;
	}
	public Purchase getPurchase() {
		return purchase;
	}
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}
	public Record getRecorded() {
		return recorded;
	}
	public void setRecorded(Record recorded) {
		this.recorded = recorded;
	}
	public Balance getBalance() {
		return balance;
	}
	public void setBalance(Balance balance) {
		this.balance = balance;
	}
	public CumulativeBalance getCumulativeBalance() {
		return cumulativeBalance;
	}
	public void setCumulativeBalance(CumulativeBalance cumulativeBalance) {
		this.cumulativeBalance = cumulativeBalance;
	}
	public CoalitionCummulativeBalance getCoalitionCumulativeBalance() {
		return coalitionCumulativeBalance;
	}
	public void setCoalitionCumulativeBalance(CoalitionCummulativeBalance coalitionCumulativeBalance) {
		this.coalitionCumulativeBalance = coalitionCumulativeBalance;
	}	
}
