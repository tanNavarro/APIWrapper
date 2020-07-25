package com.mallplanet.clienttoolbox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class UserPermission {
	@SerializedName("activate_account")
	private String activateAccount;
	@SerializedName("view_account_info")
	private String viewAccountInfo;
	@SerializedName("edit_account_info")
	private String editAccountInfo;
	@SerializedName("manage_campaign_fields")
	private String manageCampaignFields;
	@SerializedName("api_user_long_account_info")
	private String apiUserLongAccountInfo;
	@SerializedName("manage_email_templates")
	private String manageEmailTemplates;
	@SerializedName("manage_sms_templates")
	private String manageSmsTemplates;
	@SerializedName("manage_memberships")
	private String manageMemberships;
	@SerializedName("manage_triggers")
	private String manageTriggers;
	@SerializedName("add_campaign")
	private String addCmpaign;
	@SerializedName("delete_campaign")
	private String deleteCampaign;
	@SerializedName("activate_campaign")
	private String activateCampaign;
	@SerializedName("deactivate_campaign")
	private String deactivateCampaign;
	@SerializedName("open_campaign")
	private String openCampaign;
	@SerializedName("access_campaign_settings")
	private String accessCampaignSettings;
	@SerializedName("update_campaign")
	private String updateCampaign;
	@SerializedName("edit_campaign_name")
	private String editCampaignName;
	@SerializedName("view_gift_card_prefs")
	private String viewGiftCardPrefs;
	@SerializedName("edit_gift_card_prefs")
	private String editGiftCardPrefs;
	@SerializedName("view_points_prefs")
	private String viewPointsPrefs;
	@SerializedName("edit_events_prefs")
	private String editEventsPrefs;
	@SerializedName("view_buyx_prefs")
	private String viewBuyxPrefs;
	@SerializedName("edit_buyx_prefs")
	private String editBuyxPrefs;
	@SerializedName("view_earn_prefs")
	private String viewEarnPrefs;
	@SerializedName("edit_earn_prefs")
	private String editEarnPrefs;
	@SerializedName("view_campaign_email")
	private String viewCampaignEmail;
	@SerializedName("edit_campaign_email")
	private String editCampaignEmail;
	@SerializedName("view_point_to_dollar_ratio")
	private String viewPointToDollarRatio;
	@SerializedName("edit_point_to_dollar_ratio")
	private String editPointToDollarRatio;
	@SerializedName("view_profit_ratio")
	private String viewProfitRatio;
	@SerializedName("edit_profit_ratio")
	private String editProfitRatio;
	@SerializedName("view_campaign_points_expiration")
	private String viewCampaignPointsExpiration;
	@SerializedName("add_campaign_points_expiration")
	private String addCampaignPointsExpiration;
	@SerializedName("edit_campaign_points_expiration")
	private String editCampaignPointsExpiration;
	@SerializedName("delete_campaign_points_expiration")
	private String deleteCampaignPointsExpiration;
	@SerializedName("view_promotions")
	private String viewPromotions;
	@SerializedName("edit_promotions")
	private String editPromotions;
	@SerializedName("add_promotions")
	private String addPromotions;
	@SerializedName("delete_promotions")
	private String deletePromotions;
	@SerializedName("view_rewards")
	private String viewRewards;
	@SerializedName("edit_rewards")
	private String editRewards;
	@SerializedName("add_rewards")
	private String addRewards;
	@SerializedName("delete_rewards")
	private String deleteRewards;
	@SerializedName("show_dollars_earned")
	private String showDollarsEarned;
	@SerializedName("edit_dollars_earned")
	private String editDollarsEarned;
	@SerializedName("view_buyx_items")
	private String viewBuyxItems;
	@SerializedName("edit_buyx_items")
	private String editBuyxItems;
	@SerializedName("add_buyx_items")
	private String addBuyxItems;
	@SerializedName("delete_buyx_items")
	private String deleteBuyxItems;
	@SerializedName("view_buyx_default")
	private String viewBuyxDefault;
	@SerializedName("edit_buyx_default")
	private String editBuyxDefault;
	@SerializedName("view_depreciations")
	private String viewDepreciations;
	@SerializedName("add_depreciation")
	private String addDepreciation;
	@SerializedName("add_depreciations")
	private String addDepreciations;
	@SerializedName("edit_depreciation")
	private String editDepreciation;
	@SerializedName("edit_depreciations")
	private String editDepreciations;
	@SerializedName("delete_depreciation")
	private String deleteDepreciation;
	@SerializedName("delete_depreciations")
	private String deleteDepreciations;
	@SerializedName("view_recurring_fee")
	private String viewRecurringFee;
	@SerializedName("add_recurring_fee")
	private String addRecurringFee;
	@SerializedName("edit_recurring_fee")
	private String editRecurringFee;
	@SerializedName("delete_recurring_fee")
	private String deleteRecurringFee;
	@SerializedName("view_customer_search")
	private String viewCustomerSearch;
	@SerializedName("add_customer")
	private String addCustomer;
	@SerializedName("edit_customer_card_number")
	private String editCustomerCardNumber;
	@SerializedName("print_customer_transactions")
	private String printCustomerTransactions;
	@SerializedName("edit_customer_info")
	private String editCustomerInfo;
	@SerializedName("customer_visit_add")
	private String customerVisitAdd;
	@SerializedName("customer_visit_redeem")
	private String customerVisitRedeem;
	@SerializedName("customer_visit_delete")
	private String customerVisitDelete;
	@SerializedName("customer_visits_view")
	private String customerVisitsView;
	@SerializedName("manage_cards")
	private String manageCards;
	@SerializedName("manage_fields")
	private String manageFields;
	@SerializedName("list_fields")
	private String listFields;
	@SerializedName("import_customers")
	private String importCustomers;
	@SerializedName("import_transactions")
	private String importTransactions;
	@SerializedName("api_batch_customers")
	private String apiBatchCustomers;
	@SerializedName("api_batch_transactions")
	private String apiBatchTransactions;
	@SerializedName("view_user")
	private String viewUser;
	@SerializedName("edit_user")
	private String editUser;
	@SerializedName("delete_user")
	private String deleteUser;
	@SerializedName("add_user")
	private String addUser;
	@SerializedName("edit_users_campaigns_list")
	private String editUsersCampaignsList;
	@SerializedName("edit_my_info")
	private String editMyInfo;
	@SerializedName("report_on_users")
	private String reportOnUsers;
	@SerializedName("show_administrator_option")
	private String showAdministratorOption;
	@SerializedName("show_manager_option")
	private String showManagerOption;
	@SerializedName("show_coaltion_store_manager_option")
	private String showCoaltionStoreManagerOption;
	@SerializedName("show_agency_client_import_option")
	private String showAgencyClientImportOption;
	@SerializedName("show_agency_client_option")
	private String showAgencyClientOption;
	@SerializedName("show_campaign_manager_option")
	private String showCampaignManagerOption;
	@SerializedName("show_fulfillment_contractor_option")
	private String showFulfillmentContractorOption;
	@SerializedName("show_accountant_option")
	private String showAccountantOption;
	@SerializedName("show_observer_option")
	private String showObserverOption;
	@SerializedName("access_reports")
	private String accessReports;
	@SerializedName("export_apex")
	private String exportApex;
	@SerializedName("export_excel")
	private String exportExcel;
	@SerializedName("export_csv")
	private String exportCsv;
	@SerializedName("export_mailchimp")
	private String exportMailchimp;
	@SerializedName("makeBookmarks")
	private String make_bookmarks;
	private String affiliate;
	
	public String getActivateAccount() {
		return activateAccount;
	}
	public void setActivateAccount(String activateAccount) {
		this.activateAccount = activateAccount;
	}
	public String getViewAccountInfo() {
		return viewAccountInfo;
	}
	public void setViewAccountInfo(String viewAccountInfo) {
		this.viewAccountInfo = viewAccountInfo;
	}
	public String getEditAccountInfo() {
		return editAccountInfo;
	}
	public void setEditAccountInfo(String editAccountInfo) {
		this.editAccountInfo = editAccountInfo;
	}
	public String getManageCampaignFields() {
		return manageCampaignFields;
	}
	public void setManageCampaignFields(String manageCampaignFields) {
		this.manageCampaignFields = manageCampaignFields;
	}
	public String getApiUserLongAccountInfo() {
		return apiUserLongAccountInfo;
	}
	public void setApiUserLongAccountInfo(String apiUserLongAccountInfo) {
		this.apiUserLongAccountInfo = apiUserLongAccountInfo;
	}
	public String getManageEmailTemplates() {
		return manageEmailTemplates;
	}
	public void setManageEmailTemplates(String manageEmailTemplates) {
		this.manageEmailTemplates = manageEmailTemplates;
	}
	public String getManageSmsTemplates() {
		return manageSmsTemplates;
	}
	public void setManageSmsTemplates(String manageSmsTemplates) {
		this.manageSmsTemplates = manageSmsTemplates;
	}
	public String getManageMemberships() {
		return manageMemberships;
	}
	public void setManageMemberships(String manageMemberships) {
		this.manageMemberships = manageMemberships;
	}
	public String getManageTriggers() {
		return manageTriggers;
	}
	public void setManageTriggers(String manageTriggers) {
		this.manageTriggers = manageTriggers;
	}
	public String getAddCmpaign() {
		return addCmpaign;
	}
	public void setAddCmpaign(String addCmpaign) {
		this.addCmpaign = addCmpaign;
	}
	public String getDeleteCampaign() {
		return deleteCampaign;
	}
	public void setDeleteCampaign(String deleteCampaign) {
		this.deleteCampaign = deleteCampaign;
	}
	public String getActivateCampaign() {
		return activateCampaign;
	}
	public void setActivateCampaign(String activateCampaign) {
		this.activateCampaign = activateCampaign;
	}
	public String getDeactivateCampaign() {
		return deactivateCampaign;
	}
	public void setDeactivateCampaign(String deactivateCampaign) {
		this.deactivateCampaign = deactivateCampaign;
	}
	public String getOpenCampaign() {
		return openCampaign;
	}
	public void setOpenCampaign(String openCampaign) {
		this.openCampaign = openCampaign;
	}
	public String getAccessCampaignSettings() {
		return accessCampaignSettings;
	}
	public void setAccessCampaignSettings(String accessCampaignSettings) {
		this.accessCampaignSettings = accessCampaignSettings;
	}
	public String getUpdateCampaign() {
		return updateCampaign;
	}
	public void setUpdateCampaign(String updateCampaign) {
		this.updateCampaign = updateCampaign;
	}
	public String getEditCampaignName() {
		return editCampaignName;
	}
	public void setEditCampaignName(String editCampaignName) {
		this.editCampaignName = editCampaignName;
	}
	public String getViewGiftCardPrefs() {
		return viewGiftCardPrefs;
	}
	public void setViewGiftCardPrefs(String viewGiftCardPrefs) {
		this.viewGiftCardPrefs = viewGiftCardPrefs;
	}
	public String getEditGiftCardPrefs() {
		return editGiftCardPrefs;
	}
	public void setEditGiftCardPrefs(String editGiftCardPrefs) {
		this.editGiftCardPrefs = editGiftCardPrefs;
	}
	public String getViewPointsPrefs() {
		return viewPointsPrefs;
	}
	public void setViewPointsPrefs(String viewPointsPrefs) {
		this.viewPointsPrefs = viewPointsPrefs;
	}
	public String getEditEventsPrefs() {
		return editEventsPrefs;
	}
	public void setEditEventsPrefs(String editEventsPrefs) {
		this.editEventsPrefs = editEventsPrefs;
	}
	public String getViewBuyxPrefs() {
		return viewBuyxPrefs;
	}
	public void setViewBuyxPrefs(String viewBuyxPrefs) {
		this.viewBuyxPrefs = viewBuyxPrefs;
	}
	public String getEditBuyxPrefs() {
		return editBuyxPrefs;
	}
	public void setEditBuyxPrefs(String editBuyxPrefs) {
		this.editBuyxPrefs = editBuyxPrefs;
	}
	public String getViewEarnPrefs() {
		return viewEarnPrefs;
	}
	public void setViewEarnPrefs(String viewEarnPrefs) {
		this.viewEarnPrefs = viewEarnPrefs;
	}
	public String getEditEarnPrefs() {
		return editEarnPrefs;
	}
	public void setEditEarnPrefs(String editEarnPrefs) {
		this.editEarnPrefs = editEarnPrefs;
	}
	public String getViewCampaignEmail() {
		return viewCampaignEmail;
	}
	public void setViewCampaignEmail(String viewCampaignEmail) {
		this.viewCampaignEmail = viewCampaignEmail;
	}
	public String getEditCampaignEmail() {
		return editCampaignEmail;
	}
	public void setEditCampaignEmail(String editCampaignEmail) {
		this.editCampaignEmail = editCampaignEmail;
	}
	public String getViewPointToDollarRatio() {
		return viewPointToDollarRatio;
	}
	public void setViewPointToDollarRatio(String viewPointToDollarRatio) {
		this.viewPointToDollarRatio = viewPointToDollarRatio;
	}
	public String getEditPointToDollarRatio() {
		return editPointToDollarRatio;
	}
	public void setEditPointToDollarRatio(String editPointToDollarRatio) {
		this.editPointToDollarRatio = editPointToDollarRatio;
	}
	public String getViewProfitRatio() {
		return viewProfitRatio;
	}
	public void setViewProfitRatio(String viewProfitRatio) {
		this.viewProfitRatio = viewProfitRatio;
	}
	public String getEditProfitRatio() {
		return editProfitRatio;
	}
	public void setEditProfitRatio(String editProfitRatio) {
		this.editProfitRatio = editProfitRatio;
	}
	public String getViewCampaignPointsExpiration() {
		return viewCampaignPointsExpiration;
	}
	public void setViewCampaignPointsExpiration(String viewCampaignPointsExpiration) {
		this.viewCampaignPointsExpiration = viewCampaignPointsExpiration;
	}
	public String getAddCampaignPointsExpiration() {
		return addCampaignPointsExpiration;
	}
	public void setAddCampaignPointsExpiration(String addCampaignPointsExpiration) {
		this.addCampaignPointsExpiration = addCampaignPointsExpiration;
	}
	public String getEditCampaignPointsExpiration() {
		return editCampaignPointsExpiration;
	}
	public void setEditCampaignPointsExpiration(String editCampaignPointsExpiration) {
		this.editCampaignPointsExpiration = editCampaignPointsExpiration;
	}
	public String getDeleteCampaignPointsExpiration() {
		return deleteCampaignPointsExpiration;
	}
	public void setDeleteCampaignPointsExpiration(String deleteCampaignPointsExpiration) {
		this.deleteCampaignPointsExpiration = deleteCampaignPointsExpiration;
	}
	public String getViewPromotions() {
		return viewPromotions;
	}
	public void setViewPromotions(String viewPromotions) {
		this.viewPromotions = viewPromotions;
	}
	public String getEditPromotions() {
		return editPromotions;
	}
	public void setEditPromotions(String editPromotions) {
		this.editPromotions = editPromotions;
	}
	public String getAddPromotions() {
		return addPromotions;
	}
	public void setAddPromotions(String addPromotions) {
		this.addPromotions = addPromotions;
	}
	public String getDeletePromotions() {
		return deletePromotions;
	}
	public void setDeletePromotions(String deletePromotions) {
		this.deletePromotions = deletePromotions;
	}
	public String getViewRewards() {
		return viewRewards;
	}
	public void setViewRewards(String viewRewards) {
		this.viewRewards = viewRewards;
	}
	public String getEditRewards() {
		return editRewards;
	}
	public void setEditRewards(String editRewards) {
		this.editRewards = editRewards;
	}
	public String getAddRewards() {
		return addRewards;
	}
	public void setAddRewards(String addRewards) {
		this.addRewards = addRewards;
	}
	public String getDeleteRewards() {
		return deleteRewards;
	}
	public void setDeleteRewards(String deleteRewards) {
		this.deleteRewards = deleteRewards;
	}
	public String getShowDollarsEarned() {
		return showDollarsEarned;
	}
	public void setShowDollarsEarned(String showDollarsEarned) {
		this.showDollarsEarned = showDollarsEarned;
	}
	public String getEditDollarsEarned() {
		return editDollarsEarned;
	}
	public void setEditDollarsEarned(String editDollarsEarned) {
		this.editDollarsEarned = editDollarsEarned;
	}
	public String getViewBuyxItems() {
		return viewBuyxItems;
	}
	public void setViewBuyxItems(String viewBuyxItems) {
		this.viewBuyxItems = viewBuyxItems;
	}
	public String getEditBuyxItems() {
		return editBuyxItems;
	}
	public void setEditBuyxItems(String editBuyxItems) {
		this.editBuyxItems = editBuyxItems;
	}
	public String getAddBuyxItems() {
		return addBuyxItems;
	}
	public void setAddBuyxItems(String addBuyxItems) {
		this.addBuyxItems = addBuyxItems;
	}
	public String getDeleteBuyxItems() {
		return deleteBuyxItems;
	}
	public void setDeleteBuyxItems(String deleteBuyxItems) {
		this.deleteBuyxItems = deleteBuyxItems;
	}
	public String getViewBuyxDefault() {
		return viewBuyxDefault;
	}
	public void setViewBuyxDefault(String viewBuyxDefault) {
		this.viewBuyxDefault = viewBuyxDefault;
	}
	public String getEditBuyxDefault() {
		return editBuyxDefault;
	}
	public void setEditBuyxDefault(String editBuyxDefault) {
		this.editBuyxDefault = editBuyxDefault;
	}
	public String getViewDepreciations() {
		return viewDepreciations;
	}
	public void setViewDepreciations(String viewDepreciations) {
		this.viewDepreciations = viewDepreciations;
	}
	public String getAddDepreciation() {
		return addDepreciation;
	}
	public void setAddDepreciation(String addDepreciation) {
		this.addDepreciation = addDepreciation;
	}
	public String getAddDepreciations() {
		return addDepreciations;
	}
	public void setAddDepreciations(String addDepreciations) {
		this.addDepreciations = addDepreciations;
	}
	public String getEditDepreciation() {
		return editDepreciation;
	}
	public void setEditDepreciation(String editDepreciation) {
		this.editDepreciation = editDepreciation;
	}
	public String getEditDepreciations() {
		return editDepreciations;
	}
	public void setEditDepreciations(String editDepreciations) {
		this.editDepreciations = editDepreciations;
	}
	public String getDeleteDepreciation() {
		return deleteDepreciation;
	}
	public void setDeleteDepreciation(String deleteDepreciation) {
		this.deleteDepreciation = deleteDepreciation;
	}
	public String getDeleteDepreciations() {
		return deleteDepreciations;
	}
	public void setDeleteDepreciations(String deleteDepreciations) {
		this.deleteDepreciations = deleteDepreciations;
	}
	public String getViewRecurringFee() {
		return viewRecurringFee;
	}
	public void setViewRecurringFee(String viewRecurringFee) {
		this.viewRecurringFee = viewRecurringFee;
	}
	public String getAddRecurringFee() {
		return addRecurringFee;
	}
	public void setAddRecurringFee(String addRecurringFee) {
		this.addRecurringFee = addRecurringFee;
	}
	public String getEditRecurringFee() {
		return editRecurringFee;
	}
	public void setEditRecurringFee(String editRecurringFee) {
		this.editRecurringFee = editRecurringFee;
	}
	public String getDeleteRecurringFee() {
		return deleteRecurringFee;
	}
	public void setDeleteRecurringFee(String deleteRecurringFee) {
		this.deleteRecurringFee = deleteRecurringFee;
	}
	public String getViewCustomerSearch() {
		return viewCustomerSearch;
	}
	public void setViewCustomerSearch(String viewCustomerSearch) {
		this.viewCustomerSearch = viewCustomerSearch;
	}
	public String getAddCustomer() {
		return addCustomer;
	}
	public void setAddCustomer(String addCustomer) {
		this.addCustomer = addCustomer;
	}
	public String getEditCustomerCardNumber() {
		return editCustomerCardNumber;
	}
	public void setEditCustomerCardNumber(String editCustomerCardNumber) {
		this.editCustomerCardNumber = editCustomerCardNumber;
	}
	public String getPrintCustomerTransactions() {
		return printCustomerTransactions;
	}
	public void setPrintCustomerTransactions(String printCustomerTransactions) {
		this.printCustomerTransactions = printCustomerTransactions;
	}
	public String getEditCustomerInfo() {
		return editCustomerInfo;
	}
	public void setEditCustomerInfo(String editCustomerInfo) {
		this.editCustomerInfo = editCustomerInfo;
	}
	public String getCustomerVisitAdd() {
		return customerVisitAdd;
	}
	public void setCustomerVisitAdd(String customerVisitAdd) {
		this.customerVisitAdd = customerVisitAdd;
	}
	public String getCustomerVisitRedeem() {
		return customerVisitRedeem;
	}
	public void setCustomerVisitRedeem(String customerVisitRedeem) {
		this.customerVisitRedeem = customerVisitRedeem;
	}
	public String getCustomerVisitDelete() {
		return customerVisitDelete;
	}
	public void setCustomerVisitDelete(String customerVisitDelete) {
		this.customerVisitDelete = customerVisitDelete;
	}
	public String getCustomerVisitsView() {
		return customerVisitsView;
	}
	public void setCustomerVisitsView(String customerVisitsView) {
		this.customerVisitsView = customerVisitsView;
	}
	public String getManageCards() {
		return manageCards;
	}
	public void setManageCards(String manageCards) {
		this.manageCards = manageCards;
	}
	public String getManageFields() {
		return manageFields;
	}
	public void setManageFields(String manageFields) {
		this.manageFields = manageFields;
	}
	public String getListFields() {
		return listFields;
	}
	public void setListFields(String listFields) {
		this.listFields = listFields;
	}
	public String getImportCustomers() {
		return importCustomers;
	}
	public void setImportCustomers(String importCustomers) {
		this.importCustomers = importCustomers;
	}
	public String getImportTransactions() {
		return importTransactions;
	}
	public void setImportTransactions(String importTransactions) {
		this.importTransactions = importTransactions;
	}
	public String getApiBatchCustomers() {
		return apiBatchCustomers;
	}
	public void setApiBatchCustomers(String apiBatchCustomers) {
		this.apiBatchCustomers = apiBatchCustomers;
	}
	public String getApiBatchTransactions() {
		return apiBatchTransactions;
	}
	public void setApiBatchTransactions(String apiBatchTransactions) {
		this.apiBatchTransactions = apiBatchTransactions;
	}
	public String getViewUser() {
		return viewUser;
	}
	public void setViewUser(String viewUser) {
		this.viewUser = viewUser;
	}
	public String getEditUser() {
		return editUser;
	}
	public void setEditUser(String editUser) {
		this.editUser = editUser;
	}
	public String getDeleteUser() {
		return deleteUser;
	}
	public void setDeleteUser(String deleteUser) {
		this.deleteUser = deleteUser;
	}
	public String getAddUser() {
		return addUser;
	}
	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}
	public String getEditUsersCampaignsList() {
		return editUsersCampaignsList;
	}
	public void setEditUsersCampaignsList(String editUsersCampaignsList) {
		this.editUsersCampaignsList = editUsersCampaignsList;
	}
	public String getEditMyInfo() {
		return editMyInfo;
	}
	public void setEditMyInfo(String editMyInfo) {
		this.editMyInfo = editMyInfo;
	}
	public String getReportOnUsers() {
		return reportOnUsers;
	}
	public void setReportOnUsers(String reportOnUsers) {
		this.reportOnUsers = reportOnUsers;
	}
	public String getShowAdministratorOption() {
		return showAdministratorOption;
	}
	public void setShowAdministratorOption(String showAdministratorOption) {
		this.showAdministratorOption = showAdministratorOption;
	}
	public String getShowManagerOption() {
		return showManagerOption;
	}
	public void setShowManagerOption(String showManagerOption) {
		this.showManagerOption = showManagerOption;
	}
	public String getShowCoaltionStoreManagerOption() {
		return showCoaltionStoreManagerOption;
	}
	public void setShowCoaltionStoreManagerOption(String showCoaltionStoreManagerOption) {
		this.showCoaltionStoreManagerOption = showCoaltionStoreManagerOption;
	}
	public String getShowAgencyClientImportOption() {
		return showAgencyClientImportOption;
	}
	public void setShowAgencyClientImportOption(String showAgencyClientImportOption) {
		this.showAgencyClientImportOption = showAgencyClientImportOption;
	}
	public String getShowAgencyClientOption() {
		return showAgencyClientOption;
	}
	public void setShowAgencyClientOption(String showAgencyClientOption) {
		this.showAgencyClientOption = showAgencyClientOption;
	}
	public String getShowCampaignManagerOption() {
		return showCampaignManagerOption;
	}
	public void setShowCampaignManagerOption(String showCampaignManagerOption) {
		this.showCampaignManagerOption = showCampaignManagerOption;
	}
	public String getShowFulfillmentContractorOption() {
		return showFulfillmentContractorOption;
	}
	public void setShowFulfillmentContractorOption(String showFulfillmentContractorOption) {
		this.showFulfillmentContractorOption = showFulfillmentContractorOption;
	}
	public String getShowAccountantOption() {
		return showAccountantOption;
	}
	public void setShowAccountantOption(String showAccountantOption) {
		this.showAccountantOption = showAccountantOption;
	}
	public String getShowObserverOption() {
		return showObserverOption;
	}
	public void setShowObserverOption(String showObserverOption) {
		this.showObserverOption = showObserverOption;
	}
	public String getAccessReports() {
		return accessReports;
	}
	public void setAccessReports(String accessReports) {
		this.accessReports = accessReports;
	}
	public String getExportApex() {
		return exportApex;
	}
	public void setExportApex(String exportApex) {
		this.exportApex = exportApex;
	}
	public String getExportExcel() {
		return exportExcel;
	}
	public void setExportExcel(String exportExcel) {
		this.exportExcel = exportExcel;
	}
	public String getExportCsv() {
		return exportCsv;
	}
	public void setExportCsv(String exportCsv) {
		this.exportCsv = exportCsv;
	}
	public String getExportMailchimp() {
		return exportMailchimp;
	}
	public void setExportMailchimp(String exportMailchimp) {
		this.exportMailchimp = exportMailchimp;
	}
	public String getMake_bookmarks() {
		return make_bookmarks;
	}
	public void setMake_bookmarks(String make_bookmarks) {
		this.make_bookmarks = make_bookmarks;
	}
	public String getAffiliate() {
		return affiliate;
	}
	public void setAffiliate(String affiliate) {
		this.affiliate = affiliate;
	}

}
