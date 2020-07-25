package com.mallplanet.clienttoolbox.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class Account {
	@SerializedName("account_id")
	private String accountId;
	@SerializedName("biz_name")
	private String bizName;
	@SerializedName("biz_address1")
	private String bizAddress1;
	@SerializedName("biz_address2")
	private String bizAddress2;
	@SerializedName("biz_city")
	private String bizCity;
	@SerializedName("biz_state")
	private String bizState;
	@SerializedName("biz_zip")
	private String bizZip;
	@SerializedName("biz_country")
	private String bizCountry;
	@SerializedName("contact_first_name")
	private String contactFirstName;
	@SerializedName("contact_last_name")
	private String contactLastName;
	@SerializedName("contact_phone")
	private String contactPhone;
	@SerializedName("contact_email")
	private String contactEmail;
	private String language;
	private String symbol;
	private String glyph;
	private String timezone;
	private String coalition;
	@SerializedName("mall_account")
	private String mallAccount;
	private String boost;
	private String memberships;
	@SerializedName("email_templates")
	private String emailTemplates;
	private String balance;
	@SerializedName("sms_service")
	private String smsService;
	@SerializedName("reward_inventory")
	private String rewardInventory;
	private String mailchimp;
	private String created;
	private List<Field> fields;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
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
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getGlyph() {
		return glyph;
	}
	public void setGlyph(String glyph) {
		this.glyph = glyph;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getCoalition() {
		return coalition;
	}
	public void setCoalition(String coalition) {
		this.coalition = coalition;
	}
	public String getMallAccount() {
		return mallAccount;
	}
	public void setMallAccount(String mallAccount) {
		this.mallAccount = mallAccount;
	}
	public String getBoost() {
		return boost;
	}
	public void setBoost(String boost) {
		this.boost = boost;
	}
	public String getMemberships() {
		return memberships;
	}
	public void setMemberships(String memberships) {
		this.memberships = memberships;
	}
	public String getEmailTemplates() {
		return emailTemplates;
	}
	public void setEmailTemplates(String emailTemplates) {
		this.emailTemplates = emailTemplates;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getSmsService() {
		return smsService;
	}
	public void setSmsService(String smsService) {
		this.smsService = smsService;
	}
	public String getRewardInventory() {
		return rewardInventory;
	}
	public void setRewardInventory(String rewardInventory) {
		this.rewardInventory = rewardInventory;
	}
	public String getMailchimp() {
		return mailchimp;
	}
	public void setMailchimp(String mailchimp) {
		this.mailchimp = mailchimp;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public List<Field> getFields() {
		return fields;
	}
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}		
	
	
}
