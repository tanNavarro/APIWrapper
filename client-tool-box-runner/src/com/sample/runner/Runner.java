package com.sample.runner;

import java.io.IOException;

import com.google.gson.Gson;
import com.mallplanet.clienttoolbox.controller.AccountController;
import com.mallplanet.clienttoolbox.request.AccountRequest;
import com.mallplanet.clienttoolbox.request.UserRequest;
import com.mallplanet.clienttoolbox.response.UserAPIResponse;
import com.mallplanet.clienttoolbox.service.StickyFeetService;

public class Runner {

	public static void main(String[] args) {
		// Ways to use the API Wrapper
		Gson g = new Gson(); 
		
		//Converting Json to Request Object
		//AccountRequest ar = g.fromJson("{userId:BL_Shopping_Cart,userPassword:0fd957c52ae1aa95e416131065d66efc185325a3}", AccountRequest.class);
		
		// Or Set Request Object's data through setter methods
		/*AccountRequest ar = new AccountRequest();
		ar.setUserId("BL_Shopping_Cart");
		ar.setUserPassword("0fd957c52ae1aa95e416131065d66efc185325a3");*/
		AccountRequest ar = new AccountRequest();
		UserRequest ur = new UserRequest();
		ur.setUserName("cnavarro");
		ur.setUserLastName("NavarUpdated");
		
		AccountController ac = new AccountController();
		StickyFeetService sfs = new StickyFeetService("BL_Shopping_Cart", "0fd957c52ae1aa95e416131065d66efc185325a3", "IQ_BrandLoyalty");
		
		try {
			UserAPIResponse aResponse = sfs.userInfo(ur);
			System.out.println("Response"+g.toJson(aResponse));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
