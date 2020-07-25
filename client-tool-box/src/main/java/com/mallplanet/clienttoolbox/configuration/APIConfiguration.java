package com.mallplanet.clienttoolbox.configuration;

public interface APIConfiguration {	
    static final String API_BASE_URL = "https://api.clienttoolbox.com";
    static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    
    static final String USER_ID_STRING = "user_id";
    static final String USER_PASSWORD_STRING = "user_password";
    static final String USER_API_KEY_STRING = "user_api_key";
    static final String ACCOUNT_ID_STRING = "account_id";
    static final String API_STRING = "API";
    static final String API_V_6 = "1.6";
    
    static final String OUTPUT_STRING = "output";
    static final String OUTPUT_TYPE = "json";
    
    static final String TYPE_STRING = "type";
    static final String ACCOUNT_INFO = "account_info";
    static final String ACCOUNT_UPDATE = "account_update";
    static final String USER_INFO = "user_info";
    static final String USER_UPDATE = "user_update";
    static final String USER_NEW = "user_new";
    static final String USER_DELETE = "user_delete";
    static final String USERS_LIST = "users_list";
    static final String USERS_CAMPAIGN = "campaign_users";
    static final String MANAGE_FIELDS = "manage_fields";
    static final String RECORD_CUSTOMER = "record_customer";
    static final String GENERATE_CARD_NUMBER = "generate_card_number";
    static final String CUSTOMER_DELETE = "customer_delete";
    static final String VALIDATE_CUSTOMER_PASSWORD = "validate_customer_password";
    static final String CARD_REPLACE = "card_replace";
    static final String CUSTOMER_BALANCE = "customer_balance";
    static final String CUSTOMER_INFO = "customer_info";
    static final String CUSTOMER_FIND = "customer_find";
    static final String CUSTOMER_SEARCH = "customer_search";
    static final String CUSTOMER_BATCH= "customers_batch";
    static final String RECORD_ACTIVITY = "record_activity";
    static final String REDEEM = "redeem";
    static final String BATCH_TRANSACTIONS = "batch_transactions";
    static final String TRANSACTION_DELETE = "transaction_delete";
    static final String TRANSACTION_FIELDS = "transaction_fields";
    static final String GENERATE_TIME_TOKEN = "generate_time_token";
    static final String VALIDATE_TIME_TOKEN = "validate_time_token";
    static final String CAMPAIGN_NEW = "campaign_new";
    static final String DEPRECIATION_NEW = "depreciation_new";
    static final String CAMPAIGN_FEE_NEW = "campaign_fee_new";
    static final String CAMPAIGN_UPDATE = "campaign_update";
    static final String DEPRECIATION_UPDATE = "depreciation_update";
    static final String CAMPAIGN_FEE_UPDATE = "campaign_fee_update";
    static final String CAMPAIGNS_LIST = "campaigns_list";
    static final String CAMPAIGNS_INACTIVE_LIST = "campaigns_inactive_list";
    static final String CAMPAIGN_REWARDS = "campaign_rewards";
    static final String CAMPAIGN_PROMOS = "campaign_promos";
    static final String CAMPAIGN_DEPRECIATIONS = "campaign_depreciations";
    static final String CAMPAIGN_FEES = "campaign_fees";
    static final String BUYX_ITEMS_LIST = "buyx_items_list"; 
    static final String CAMPAIGN_DELETE = "campaign_delete";
    static final String DEPRECIATION_DELETE = "depreciation_delete";
    static final String CAMPAIGN_FEE_DELETE = "campaign_fee_delete";
    static final String CAMPAIGN_DEACTIVATE = "campaign_deactivate";
    static final String CAMPAIGN_REACTIVATE = "campaign_reactivate";
    
    static final String ACTION_STRING = "action";
    static final String CUSTOMER_ACTION_STRING = "customer_action";
    
    static final String ADD_ACTION = "add";
    static final String NEW_ACTION = "new";
    static final String REGISTER_ACTION = "register";
    static final String LIST_ACTION = "list";
    static final String EDIT_ACTION = "edit";
    static final String UPDATE_ACTION = "update";
    static final String DELETE_ACTION = "delete";
    static final String REMOVE_ACTION = "remove";
    static final String CAMPAIGN_ACTION = "campaign";
    static final String REWARD_ACTION = "reward";
    static final String PROMO_ACTION = "promo";
    static final String ITEM_ACTION = "item";
    
    static final String CUSTOM_FIELDS_STRING = "customFields";
    static final String PROFILE_HEADER_STRING = "profileHeaders";
    static final String VISITS_HEADER_STRING = "visitsHeader";
}
