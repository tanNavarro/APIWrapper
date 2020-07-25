package com.mallplanet.clienttoolbox.request;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerRequest {
	@JsonProperty("API")
	private String api;
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("user_password")
	private String userPassword;
	@JsonProperty("user_api_key")
	private String userApiKey;
	private String type;
	@JsonProperty("customer_action")
	private String customerAction;
	@JsonProperty("account_id")
	private String accountId;
	@JsonProperty("campaign_id")
	private String campaignId;
	@JsonProperty("card_number")
	private String cardNumber;
	@JsonProperty("card_number_generate")
	private String cardNmberGenerate;
	@JsonProperty("how_many_digits")
	private String howManyDigits;
	private String code;
	@JsonProperty("new_code")
	private String newCode;
	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	private String phone;
	private String email;
	private String street1;
	private String street2;
	private String city;
	private String state;
	@JsonProperty("postal_code")
	private String postalCode;
	private String country;
	@JsonProperty("custom_date")
	private String customDate;
	@JsonProperty("custom_field")
	private String customField;
	@JsonProperty("customer_username")
	private String customerUsername;
	@JsonProperty("customer_password")
	private String customerPassword;
	@JsonProperty("customer_PIN")
	private String customerPIN;
	@JsonProperty("auto_add")
	private String autoAdd;
	@JsonProperty("send_no_email")
	private String sendNoEmail;
	private String delimiter;
	@JsonProperty("overwrite_duplicates")
	private String overwriteDuplicates;
	@JsonProperty("allow_undo")
	private String allowUndo;
	@JsonProperty("campaigns_to_include")
	private String campaignsToInclude;
	@JsonProperty("include_balances")
	private String includeBalances;
	@JsonProperty("exact_match")
	private String exactMatch;
	@JsonProperty("find_customer")
	private String findCustomer;
	@JsonProperty("hide_custom_field")
	private String hideCustomField;
	@JsonProperty("transactions_number")
	private String transactionsNumber;
	@JsonProperty("across_campaigns")
	private String acrossCampaigns;
	@JsonProperty("previous_code")
	private String previousCode;
	@JsonProperty("previous_card")
	private String previousCard;
	@JsonProperty("new_card_number")
	private String newCardNumber;
	@JsonProperty("keep_which")
	private String keepWhich;
	@JsonProperty("profile_uid")
	private String profileUid;
	@JsonProperty("check_override")
	private String checkOverride;	
	private String output;
	private String callback;
	private String condensed;
	@JsonProperty("profiles_data")
	private String profilesData;
	private Map<String, String> profileHeaders;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCustomerAction() {
		return customerAction;
	}
	public void setCustomerAction(String customerAction) {
		this.customerAction = customerAction;
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
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardNmberGenerate() {
		return cardNmberGenerate;
	}
	public void setCardNmberGenerate(String cardNmberGenerate) {
		this.cardNmberGenerate = cardNmberGenerate;
	}
	public String getHowManyDigits() {
		return howManyDigits;
	}
	public void setHowManyDigits(String howManyDigits) {
		this.howManyDigits = howManyDigits;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNewCode() {
		return newCode;
	}
	public void setNewCode(String newCode) {
		this.newCode = newCode;
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
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerPIN() {
		return customerPIN;
	}
	public void setCustomerPIN(String customerPIN) {
		this.customerPIN = customerPIN;
	}
	public String getAutoAdd() {
		return autoAdd;
	}
	public void setAutoAdd(String autoAdd) {
		this.autoAdd = autoAdd;
	}
	public String getSendNoEmail() {
		return sendNoEmail;
	}
	public void setSendNoEmail(String sendNoEmail) {
		this.sendNoEmail = sendNoEmail;
	}
	public String getDelimiter() {
		return delimiter;
	}
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
	public String getOverwriteDuplicates() {
		return overwriteDuplicates;
	}
	public void setOverwriteDuplicates(String overwriteDuplicates) {
		this.overwriteDuplicates = overwriteDuplicates;
	}
	public String getAllowUndo() {
		return allowUndo;
	}
	public void setAllowUndo(String allowUndo) {
		this.allowUndo = allowUndo;
	}
	public String getCampaignsToInclude() {
		return campaignsToInclude;
	}
	public void setCampaignsToInclude(String campaignsToInclude) {
		this.campaignsToInclude = campaignsToInclude;
	}
	public String getIncludeBalances() {
		return includeBalances;
	}
	public void setIncludeBalances(String includeBalances) {
		this.includeBalances = includeBalances;
	}
	public String getExactMatch() {
		return exactMatch;
	}
	public void setExactMatch(String exactMatch) {
		this.exactMatch = exactMatch;
	}
	public String getFindCustomer() {
		return findCustomer;
	}
	public void setFindCustomer(String findCustomer) {
		this.findCustomer = findCustomer;
	}
	public String getHideCustomField() {
		return hideCustomField;
	}
	public void setHideCustomField(String hideCustomField) {
		this.hideCustomField = hideCustomField;
	}
	public String getTransactionsNumber() {
		return transactionsNumber;
	}
	public void setTransactionsNumber(String transactionsNumber) {
		this.transactionsNumber = transactionsNumber;
	}
	public String getAcrossCampaigns() {
		return acrossCampaigns;
	}
	public void setAcrossCampaigns(String acrossCampaigns) {
		this.acrossCampaigns = acrossCampaigns;
	}
	public String getPreviousCode() {
		return previousCode;
	}
	public void setPreviousCode(String previousCode) {
		this.previousCode = previousCode;
	}
	public String getPreviousCard() {
		return previousCard;
	}
	public void setPreviousCard(String previousCard) {
		this.previousCard = previousCard;
	}
	public String getNewCardNumber() {
		return newCardNumber;
	}
	public void setNewCardNumber(String newCardNumber) {
		this.newCardNumber = newCardNumber;
	}
	public String getKeepWhich() {
		return keepWhich;
	}
	public void setKeepWhich(String keepWhich) {
		this.keepWhich = keepWhich;
	}
	public String getProfileUid() {
		return profileUid;
	}
	public void setProfileUid(String profileUid) {
		this.profileUid = profileUid;
	}
	public String getCheckOverride() {
		return checkOverride;
	}
	public void setCheckOverride(String checkOverride) {
		this.checkOverride = checkOverride;
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
	public String getProfilesData() {
		return profilesData;
	}
	public void setProfilesData(String profilesData) {
		this.profilesData = profilesData;
	}
	public Map<String, String> getProfileHeaders() {
		return profileHeaders;
	}
	public void setProfileHeaders(Map<String, String> profileHeaders) {
		this.profileHeaders = profileHeaders;
	}
	public Map<String, String> getCustomFields() {
		return customFields;
	}
	public void setCustomFields(Map<String, String> customFields) {
		this.customFields = customFields;
	}
}
