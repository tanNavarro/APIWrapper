package com.mallplanet.clienttoolbox.repository;

import java.util.HashMap;

import com.mallplanet.clienttoolbox.response.AccountAPIResponse;
import com.mallplanet.clienttoolbox.response.CampaignAPIResponse;
import com.mallplanet.clienttoolbox.response.CustomerAPIResponse;
import com.mallplanet.clienttoolbox.response.CustomerFieldAPIResponse;
import com.mallplanet.clienttoolbox.response.TokenAPIResponse;
import com.mallplanet.clienttoolbox.response.TransactionAPIResponse;
import com.mallplanet.clienttoolbox.response.TransactionFieldAPIResponse;
import com.mallplanet.clienttoolbox.response.UserAPIResponse;
import com.mallplanet.clienttoolbox.response.UsersListAPIResponse;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RepositoryInterface {

	@FormUrlEncoded
	@POST("/")
	Call<AccountAPIResponse> accountAPI(@FieldMap HashMap<String, String> hashFields);

	@FormUrlEncoded
	@POST("/")
	Call<UserAPIResponse> userAPI(@FieldMap HashMap<String, String> hashFields);
	
	@FormUrlEncoded
	@POST("/")
	Call<UsersListAPIResponse> usersListAPI(@FieldMap HashMap<String, String> hashFields);
	
	@FormUrlEncoded
	@POST("/")
	Call<CustomerFieldAPIResponse> customerFieldAPI(@FieldMap HashMap<String, String> hashFields);
	
	@FormUrlEncoded
	@POST("/")
	Call<TransactionFieldAPIResponse> transactionFieldAPI(@FieldMap HashMap<String, String> hashFields);
	
	@FormUrlEncoded
	@POST("/")
	Call<CustomerAPIResponse> customerAPI(@FieldMap HashMap<String, String> hashFields);
	
	@FormUrlEncoded
	@POST("/")
	Call<TransactionAPIResponse> transactionAPI(@FieldMap HashMap<String, String> hashFields);
	
	@FormUrlEncoded
	@POST("/")
	Call<TokenAPIResponse> tokenAPI(@FieldMap HashMap<String, String> hashFields);
	
	@FormUrlEncoded
	@POST("/")
	Call<CampaignAPIResponse> campaignAPI(@FieldMap HashMap<String, String> hashFields);

}
