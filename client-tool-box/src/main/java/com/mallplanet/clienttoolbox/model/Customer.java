package com.mallplanet.clienttoolbox.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class Customer {
	@SerializedName("profile_uid")
	private String profileUid;
	private String code;
	private String status;
	@SerializedName("card_number")
	private String cardNumber;
	@SerializedName("first_name")
	private String firstName;
	@SerializedName("last_name")
	private String lastName;
	private String phone;
	private String email;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String postal_code;
	private String country;
	@SerializedName("custom_date")
	private String customDate;
	@SerializedName("custom_field")
	private String customField;
	@SerializedName(value = "customer_username", alternate = "username")
	private String customerUsername;	
	private String balance;
	@SerializedName("equivalent_cash_balance")
	private String equivalentCashBalance;
	@SerializedName("equivalent_cash_currency")
	private String equivalentCashCurrency;
	@SerializedName("equivalent_cash_glyph")
	private String equivalentCashGlyph;
	@SerializedName("last_transaction")
	private String lastTransaction;
	@SerializedName("last_redemption")
	private String lastRedemption;
	private String registered;
	@SerializedName("enrollment_stamp")
	private String enrollmentStamp;
	@SerializedName("record_timestamp")
	private String recordTimestamp;
	@SerializedName("new")
	private String newCust;
	private List<Item> balances;
	private List<Transaction> transactions;
	private ArrayList<Campaign> campaigns;
	
	public String getProfileUid() {
		return profileUid;
	}
	public void setProfileUid(String profileUid) {
		this.profileUid = profileUid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCustomDate() {
		return customDate;
	}
	public void setCustomDate(String customDate) {
		this.customDate = customDate;
	}
	public String getCustomField() {
		return customField;
	}
	public void setCustomField(String customField) {
		this.customField = customField;
	}
	public String getCustomerUsername() {
		return customerUsername;
	}
	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getEquivalentCashBalance() {
		return equivalentCashBalance;
	}
	public void setEquivalentCashBalance(String equivalentCashBalance) {
		this.equivalentCashBalance = equivalentCashBalance;
	}
	public String getEquivalentCashCurrency() {
		return equivalentCashCurrency;
	}
	public void setEquivalentCashCurrency(String equivalentCashCurrency) {
		this.equivalentCashCurrency = equivalentCashCurrency;
	}
	public String getEquivalentCashGlyph() {
		return equivalentCashGlyph;
	}
	public void setEquivalentCashGlyph(String equivalentCashGlyph) {
		this.equivalentCashGlyph = equivalentCashGlyph;
	}
	public String getLastTransaction() {
		return lastTransaction;
	}
	public void setLastTransaction(String lastTransaction) {
		this.lastTransaction = lastTransaction;
	}
	public String getLastRedemption() {
		return lastRedemption;
	}
	public void setLastRedemption(String lastRedemption) {
		this.lastRedemption = lastRedemption;
	}
	public String getRegistered() {
		return registered;
	}
	public void setRegistered(String registered) {
		this.registered = registered;
	}
	public String getEnrollmentStamp() {
		return enrollmentStamp;
	}
	public void setEnrollmentStamp(String enrollmentStamp) {
		this.enrollmentStamp = enrollmentStamp;
	}
	public String getRecordTimestamp() {
		return recordTimestamp;
	}
	public void setRecordTimestamp(String recordTimestamp) {
		this.recordTimestamp = recordTimestamp;
	}
	public String getNewCust() {
		return newCust;
	}
	public void setNewCust(String newCust) {
		this.newCust = newCust;
	}
	public List<Item> getBalances() {
		return balances;
	}
	public void setBalances(List<Item> balances) {
		this.balances = balances;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	public ArrayList<Campaign> getCampaigns() {
		return campaigns;
	}
	public void setCampaigns(ArrayList<Campaign> campaigns) {
		this.campaigns = campaigns;
	}
}
