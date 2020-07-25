package com.mallplanet.clienttoolbox.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mallplanet.clienttoolbox.configuration.APIConfiguration;
import com.mallplanet.clienttoolbox.repository.RepositoryInterface;
import com.mallplanet.clienttoolbox.request.AccountRequest;
import com.mallplanet.clienttoolbox.request.CampaignRequest;
import com.mallplanet.clienttoolbox.request.CustomerFieldRequest;
import com.mallplanet.clienttoolbox.request.CustomerRequest;
import com.mallplanet.clienttoolbox.request.TokenRequest;
import com.mallplanet.clienttoolbox.request.TransactionFieldRequest;
import com.mallplanet.clienttoolbox.request.TransactionRequest;
import com.mallplanet.clienttoolbox.request.UserRequest;
import com.mallplanet.clienttoolbox.response.AccountAPIResponse;
import com.mallplanet.clienttoolbox.response.CampaignAPIResponse;
import com.mallplanet.clienttoolbox.response.CustomerAPIResponse;
import com.mallplanet.clienttoolbox.response.CustomerFieldAPIResponse;
import com.mallplanet.clienttoolbox.response.NullOnEmptyConverterFactory;
import com.mallplanet.clienttoolbox.response.TokenAPIResponse;
import com.mallplanet.clienttoolbox.response.TransactionAPIResponse;
import com.mallplanet.clienttoolbox.response.TransactionFieldAPIResponse;
import com.mallplanet.clienttoolbox.response.UserAPIResponse;
import com.mallplanet.clienttoolbox.response.UsersListAPIResponse;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class StickyFeetService implements APIConfiguration {

	private RepositoryInterface service;
	
	private static HashMap<String, String> mapObj;
	private static HashMap<String, String> userMapObj;
	
	public StickyFeetService(String userId, String userPassword, String accountId) {
		this();
		userMapObj.put(USER_ID_STRING, userId);
		userMapObj.put(USER_PASSWORD_STRING, userPassword);
		userMapObj.put(ACCOUNT_ID_STRING, accountId);
	}

	public StickyFeetService() {
		HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
		Gson gson = new GsonBuilder().setLenient().create();
		interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
		
		OkHttpClient client = new OkHttpClient.Builder()
	            .connectTimeout(1000, TimeUnit.SECONDS)
	            .readTimeout(1000,TimeUnit.SECONDS)
	            .addInterceptor(interceptor)
	            .build();	 

		Retrofit retrofit = new Retrofit.Builder().baseUrl(API_BASE_URL)
				.client(client)
				.addConverterFactory(new NullOnEmptyConverterFactory())
				.addConverterFactory(GsonConverterFactory.create(gson))
				.build();
				
		service = retrofit.create(RepositoryInterface.class);
		
		userMapObj = new HashMap<String, String>();
		userMapObj.put(OUTPUT_STRING, OUTPUT_TYPE);
	}

	public AccountAPIResponse accountInfo(AccountRequest accountRequest) throws IOException {
	    /*requestMap.put(USER_ID_STRING, accountRequest.getUserId());
	    requestMap.put(USER_PASSWORD_STRING, accountRequest.getUserPassword());
	    requestMap.put(TYPE_STRING, ACCOUNT_INFO);*/
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);		
		mapObj = objectMapper.convertValue(accountRequest, HashMap.class);
		mapObj.put(TYPE_STRING, ACCOUNT_INFO);
		mapObj.putAll(userMapObj);

		Call<AccountAPIResponse> retrofitCall = service.accountAPI(mapObj);
		Response<AccountAPIResponse> response = retrofitCall.execute();

		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}

	public AccountAPIResponse accountUpdate(AccountRequest accountRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);		
		
		mapObj = objectMapper.convertValue(accountRequest, HashMap.class);
		mapObj.put(TYPE_STRING, ACCOUNT_UPDATE);
		mapObj.putAll(userMapObj);
		
		Call<AccountAPIResponse> retrofitCall = service.accountAPI(mapObj);
		Response<AccountAPIResponse> response = retrofitCall.execute();

		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}

	public UserAPIResponse userInfo(UserRequest userRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);		
		
		mapObj = objectMapper.convertValue(userRequest, HashMap.class);
		mapObj.put(TYPE_STRING, USER_INFO);
		mapObj.putAll(userMapObj);
		
		Call<UserAPIResponse> retrofitCall = service.userAPI(mapObj);

		Response<UserAPIResponse> response = retrofitCall.execute();

		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public UserAPIResponse userUpdate(UserRequest userRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		
		mapObj = objectMapper.convertValue(userRequest, HashMap.class);
		mapObj.put(TYPE_STRING, USER_UPDATE);
		mapObj.putAll(userMapObj);
		
		Call<UserAPIResponse> retrofitCall = service.userAPI(mapObj);
		Response<UserAPIResponse> response = retrofitCall.execute();

		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public UserAPIResponse userNew(UserRequest userRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		
		mapObj = objectMapper.convertValue(userRequest, HashMap.class);
		mapObj.put(TYPE_STRING, USER_NEW);
		mapObj.putAll(userMapObj);
		
		Call<UserAPIResponse> retrofitCall = service.userAPI(mapObj);
		Response<UserAPIResponse> response = retrofitCall.execute();

		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public UserAPIResponse userDelete(UserRequest userRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		
		mapObj = objectMapper.convertValue(userRequest, HashMap.class);
		mapObj.put(TYPE_STRING, USER_DELETE);
		mapObj.putAll(userMapObj);
		
		Call<UserAPIResponse> retrofitCall = service.userAPI(mapObj);
		Response<UserAPIResponse> response = retrofitCall.execute();

		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public UsersListAPIResponse usersList(UserRequest userRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		
		mapObj = objectMapper.convertValue(userRequest, HashMap.class);
		mapObj.put(TYPE_STRING, USERS_LIST);
		mapObj.putAll(userMapObj);
		
		Call<UsersListAPIResponse> retrofitCall = service.usersListAPI(mapObj);
		Response<UsersListAPIResponse> response = retrofitCall.execute();

		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public UsersListAPIResponse usersAddToCampaign(UserRequest userRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		
		mapObj = objectMapper.convertValue(userRequest, HashMap.class);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, USERS_CAMPAIGN);
		mapObj.put(ACTION_STRING, ADD_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<UsersListAPIResponse> retrofitCall = service.usersListAPI(mapObj);
		Response<UsersListAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public UsersListAPIResponse usersRemoveFromCampaign(UserRequest userRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		
		mapObj = objectMapper.convertValue(userRequest, HashMap.class);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, USERS_CAMPAIGN);
		mapObj.put(ACTION_STRING, REMOVE_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<UsersListAPIResponse> retrofitCall = service.usersListAPI(mapObj);
		Response<UsersListAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}	
	
	public CustomerFieldAPIResponse customerFieldCreate(CustomerFieldRequest customerFieldRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerFieldRequest, HashMap.class);
		mapObj.remove(CUSTOM_FIELDS_STRING);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, MANAGE_FIELDS);
		mapObj.put(ACTION_STRING, ADD_ACTION);
		mapObj.putAll(userMapObj);
		mapObj.putAll(customerFieldRequest.getCustomFields());
		
		Call<CustomerFieldAPIResponse> retrofitCall = service.customerFieldAPI(mapObj);
		Response<CustomerFieldAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerFieldAPIResponse customerFieldList(CustomerFieldRequest customerFieldRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerFieldRequest, HashMap.class);
		mapObj.remove(CUSTOM_FIELDS_STRING);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, MANAGE_FIELDS);
		mapObj.put(ACTION_STRING, LIST_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CustomerFieldAPIResponse> retrofitCall = service.customerFieldAPI(mapObj);
		Response<CustomerFieldAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerFieldAPIResponse customerFieldUpdate(CustomerFieldRequest customerFieldRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerFieldRequest, HashMap.class);
		mapObj.remove(CUSTOM_FIELDS_STRING);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, MANAGE_FIELDS);
		mapObj.put(ACTION_STRING, UPDATE_ACTION);
		mapObj.putAll(userMapObj);
		mapObj.putAll(customerFieldRequest.getCustomFields());
		
		Call<CustomerFieldAPIResponse> retrofitCall = service.customerFieldAPI(mapObj);
		Response<CustomerFieldAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerFieldAPIResponse customerFieldDelete(CustomerFieldRequest customerFieldRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerFieldRequest, HashMap.class);
		mapObj.remove(CUSTOM_FIELDS_STRING);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, MANAGE_FIELDS);
		mapObj.put(ACTION_STRING, DELETE_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CustomerFieldAPIResponse> retrofitCall = service.customerFieldAPI(mapObj);
		Response<CustomerFieldAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public TransactionFieldAPIResponse transactionFieldCreate(TransactionFieldRequest transactionFieldRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(transactionFieldRequest, HashMap.class);
		mapObj.remove(CUSTOM_FIELDS_STRING);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, TRANSACTION_FIELDS);
		mapObj.put(ACTION_STRING, ADD_ACTION);
		mapObj.putAll(userMapObj);
		mapObj.putAll(transactionFieldRequest.getCustomFields());
		
		Call<TransactionFieldAPIResponse> retrofitCall = service.transactionFieldAPI(mapObj);
		Response<TransactionFieldAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public TransactionFieldAPIResponse transactionFieldList(TransactionFieldRequest transactionFieldRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(transactionFieldRequest, HashMap.class);
		mapObj.remove(CUSTOM_FIELDS_STRING);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, TRANSACTION_FIELDS);
		mapObj.put(ACTION_STRING, LIST_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<TransactionFieldAPIResponse> retrofitCall = service.transactionFieldAPI(mapObj);
		Response<TransactionFieldAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public TransactionFieldAPIResponse transactionFieldUpdate(TransactionFieldRequest transactionFieldRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(transactionFieldRequest, HashMap.class);
		mapObj.remove(CUSTOM_FIELDS_STRING);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, TRANSACTION_FIELDS);
		mapObj.put(ACTION_STRING, UPDATE_ACTION);
		mapObj.putAll(userMapObj);
		mapObj.putAll(transactionFieldRequest.getCustomFields());
		
		Call<TransactionFieldAPIResponse> retrofitCall = service.transactionFieldAPI(mapObj);
		Response<TransactionFieldAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public TransactionFieldAPIResponse transactionFieldDelete(TransactionFieldRequest transactionFieldRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(transactionFieldRequest, HashMap.class);
		mapObj.remove(CUSTOM_FIELDS_STRING);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, TRANSACTION_FIELDS);
		mapObj.put(ACTION_STRING, DELETE_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<TransactionFieldAPIResponse> retrofitCall = service.transactionFieldAPI(mapObj);
		Response<TransactionFieldAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}	
	
	public CustomerAPIResponse customerCreate(CustomerRequest customerRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerRequest, HashMap.class);
		mapObj.put(TYPE_STRING, RECORD_CUSTOMER);
		mapObj.put(CUSTOMER_ACTION_STRING, NEW_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CustomerAPIResponse> retrofitCall = service.customerAPI(mapObj);
		Response<CustomerAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(CUSTOMER_ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerAPIResponse customerUpdate(CustomerRequest customerRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerRequest, HashMap.class);
		mapObj.put(TYPE_STRING, RECORD_CUSTOMER);
		mapObj.put(CUSTOMER_ACTION_STRING, EDIT_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CustomerAPIResponse> retrofitCall = service.customerAPI(mapObj);
		Response<CustomerAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(CUSTOMER_ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerAPIResponse customerGenerateCardNum(CustomerRequest customerRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerRequest, HashMap.class);
		mapObj.put(TYPE_STRING, GENERATE_CARD_NUMBER);
		mapObj.putAll(userMapObj);
		
		Call<CustomerAPIResponse> retrofitCall = service.customerAPI(mapObj);
		Response<CustomerAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerAPIResponse customerDelete(CustomerRequest customerRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CUSTOMER_DELETE);
		mapObj.putAll(userMapObj);
		
		Call<CustomerAPIResponse> retrofitCall = service.customerAPI(mapObj);
		Response<CustomerAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerAPIResponse customerValidate(CustomerRequest customerRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerRequest, HashMap.class);
		mapObj.put(TYPE_STRING, VALIDATE_CUSTOMER_PASSWORD);
		mapObj.putAll(userMapObj);
		
		Call<CustomerAPIResponse> retrofitCall = service.customerAPI(mapObj);
		Response<CustomerAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerAPIResponse customerCardReplace(CustomerRequest customerRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CARD_REPLACE);
		mapObj.putAll(userMapObj);
		
		Call<CustomerAPIResponse> retrofitCall = service.customerAPI(mapObj);
		Response<CustomerAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerAPIResponse customerCampaignBalance(CustomerRequest customerRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CUSTOMER_BALANCE);
		mapObj.putAll(userMapObj);
		
		Call<CustomerAPIResponse> retrofitCall = service.customerAPI(mapObj);
		Response<CustomerAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerAPIResponse customerInfo(CustomerRequest customerRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CUSTOMER_INFO);
		mapObj.putAll(userMapObj);
		
		Call<CustomerAPIResponse> retrofitCall = service.customerAPI(mapObj);
		Response<CustomerAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerAPIResponse customerFind(CustomerRequest customerRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CUSTOMER_FIND);
		mapObj.putAll(userMapObj);
		
		Call<CustomerAPIResponse> retrofitCall = service.customerAPI(mapObj);
		Response<CustomerAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerAPIResponse customerSearch(CustomerRequest customerRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CUSTOMER_SEARCH);
		mapObj.putAll(userMapObj);
		
		Call<CustomerAPIResponse> retrofitCall = service.customerAPI(mapObj);
		Response<CustomerAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CustomerAPIResponse customerBatch(CustomerRequest customerRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(customerRequest, HashMap.class);
		mapObj.remove(PROFILE_HEADER_STRING);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, CUSTOMER_BATCH);
		mapObj.putAll(userMapObj);
		mapObj.putAll(customerRequest.getProfileHeaders());
		
		Call<CustomerAPIResponse> retrofitCall = service.customerAPI(mapObj);
		Response<CustomerAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public TransactionAPIResponse transactionRecord(TransactionRequest transactionRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(transactionRequest, HashMap.class);
		mapObj.put(TYPE_STRING, RECORD_ACTIVITY);
		mapObj.putAll(userMapObj);
		
		Call<TransactionAPIResponse> retrofitCall = service.transactionAPI(mapObj);
		Response<TransactionAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public TransactionAPIResponse transactionRedeem(TransactionRequest transactionRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(transactionRequest, HashMap.class);
		mapObj.put(TYPE_STRING, REDEEM);
		mapObj.putAll(userMapObj);
		
		Call<TransactionAPIResponse> retrofitCall = service.transactionAPI(mapObj);
		Response<TransactionAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public TransactionAPIResponse transactionDelete(TransactionRequest transactionRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(transactionRequest, HashMap.class);
		mapObj.put(TYPE_STRING, TRANSACTION_DELETE);
		mapObj.putAll(userMapObj);
		
		Call<TransactionAPIResponse> retrofitCall = service.transactionAPI(mapObj);
		Response<TransactionAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public TransactionAPIResponse transactionBatch(TransactionRequest transactionRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(transactionRequest, HashMap.class);
		mapObj.remove(VISITS_HEADER_STRING);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, BATCH_TRANSACTIONS);
		mapObj.putAll(userMapObj);
		mapObj.putAll(transactionRequest.getVisitsHeader());
				
		Call<TransactionAPIResponse> retrofitCall = service.transactionAPI(mapObj);
		Response<TransactionAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public TokenAPIResponse tokenGenerate(TokenRequest tokenRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		
		mapObj = objectMapper.convertValue(tokenRequest, HashMap.class);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, GENERATE_TIME_TOKEN);
		mapObj.putAll(userMapObj);
		
		Call<TokenAPIResponse> retrofitCall = service.tokenAPI(mapObj);
		Response<TokenAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public TokenAPIResponse tokenValidate(TokenRequest tokenRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		
		mapObj = objectMapper.convertValue(tokenRequest, HashMap.class);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, VALIDATE_TIME_TOKEN);
		mapObj.putAll(userMapObj);
		
		Call<TokenAPIResponse> retrofitCall = service.tokenAPI(mapObj);
		Response<TokenAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}	
	
	public CampaignAPIResponse campaignList(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, CAMPAIGNS_LIST);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		mapObj.remove(ACTION_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse inactiveCampaignList(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(API_STRING, API_V_6);
		mapObj.put(TYPE_STRING, CAMPAIGNS_INACTIVE_LIST);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignRewardList(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_REWARDS);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignPromoList(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_PROMOS);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignDeapreciationList(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_DEPRECIATIONS);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignFeeList(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_FEES);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignBuyXItemist(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, BUYX_ITEMS_LIST);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignDeactivate(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_DEACTIVATE);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignReactivate(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_REACTIVATE);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignNew(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_NEW);
		mapObj.put(ACTION_STRING, CAMPAIGN_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignNewReward(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_NEW);
		mapObj.put(ACTION_STRING, REWARD_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignNewPromo(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_NEW);
		mapObj.put(ACTION_STRING, PROMO_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignNewBuyXItem(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_NEW);
		mapObj.put(ACTION_STRING, ITEM_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignNewDepreciation(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, DEPRECIATION_NEW);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignNewFee(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_FEE_NEW);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignUpdate(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_UPDATE);
		mapObj.put(ACTION_STRING, CAMPAIGN_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignUpdateReward(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_UPDATE);
		mapObj.put(ACTION_STRING, REWARD_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignUpdatePromo(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_UPDATE);
		mapObj.put(ACTION_STRING, PROMO_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignUpdateBuyXItem(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_UPDATE);
		mapObj.put(ACTION_STRING, ITEM_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();
		
		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignUpdateDepreciation(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, DEPRECIATION_UPDATE);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();

		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignUpdateFee(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_FEE_UPDATE);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();

		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignDelete(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_DELETE);
		mapObj.put(ACTION_STRING, CAMPAIGN_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();

		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignDeleteReward(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_DELETE);
		mapObj.put(ACTION_STRING, REWARD_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();

		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignDeletePromo(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_DELETE);
		mapObj.put(ACTION_STRING, PROMO_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();

		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignDeleteBuyXItem(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_DELETE);
		mapObj.put(ACTION_STRING, ITEM_ACTION);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();

		mapObj.remove(ACTION_STRING);
		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignDeleteDepreciation(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, DEPRECIATION_DELETE);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();

		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}
	
	public CampaignAPIResponse campaignDeleteFee(CampaignRequest campaignRequest) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		mapObj = objectMapper.convertValue(campaignRequest, HashMap.class);
		mapObj.put(TYPE_STRING, CAMPAIGN_FEE_DELETE);
		mapObj.putAll(userMapObj);
		
		Call<CampaignAPIResponse> retrofitCall = service.campaignAPI(mapObj);
		Response<CampaignAPIResponse> response = retrofitCall.execute();

		mapObj.remove(API_STRING);
		if (!response.isSuccessful()) {
			throw new IOException(response.errorBody() != null ? response.errorBody().string() : "Unknown error");
		}

		return response.body();
	}	
}
