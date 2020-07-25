package com.mallplanet.clienttoolbox.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mallplanet.clienttoolbox.request.CustomerRequest;
import com.mallplanet.clienttoolbox.response.CustomerAPIResponse;
import com.mallplanet.clienttoolbox.service.StickyFeetService;

@RestController
public class CustomerController {
	@Autowired
    private StickyFeetService stickyFeetService;
	
	@PostMapping("/customerCreate")
    public CustomerAPIResponse customerCreate(@RequestBody CustomerRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerCreate(customerFieldRequest);
    }
	
	@PostMapping("/customerUpdate")
    public CustomerAPIResponse customerUpdate(@RequestBody CustomerRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerUpdate(customerFieldRequest);
    }
	
	@PostMapping("/customerGenerateCardNum")
    public CustomerAPIResponse customerGenerateCardNum(@RequestBody CustomerRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerGenerateCardNum(customerFieldRequest);
    }
	
	@PostMapping("/customerDelete")
    public CustomerAPIResponse customerDelete(@RequestBody CustomerRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerDelete(customerFieldRequest);
    }
	
	@PostMapping("/customerValidate")
    public CustomerAPIResponse customerValidate(@RequestBody CustomerRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerValidate(customerFieldRequest);
    }
	
	@PostMapping("/customerCardReplace")
    public CustomerAPIResponse customerCardReplace(@RequestBody CustomerRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerCardReplace(customerFieldRequest);
    }
	
	@PostMapping("/customerCampaignBalance")
    public CustomerAPIResponse customerCampaignBalance(@RequestBody CustomerRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerCampaignBalance(customerFieldRequest);
    }
	
	@PostMapping("/customerInfo")
    public CustomerAPIResponse customerInfo(@RequestBody CustomerRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerInfo(customerFieldRequest);
    }
	
	@PostMapping("/customerFind")
    public CustomerAPIResponse customerFind(@RequestBody CustomerRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerFind(customerFieldRequest);
    }
	
	@PostMapping("/customerSearch")
    public CustomerAPIResponse customerSearch(@RequestBody CustomerRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerSearch(customerFieldRequest);
    }
	
	@PostMapping("/customerBatch")
    public CustomerAPIResponse customerBatch(@RequestBody CustomerRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerBatch(customerFieldRequest);
    }
}
