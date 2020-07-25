package com.mallplanet.clienttoolbox.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mallplanet.clienttoolbox.request.CustomerFieldRequest;
import com.mallplanet.clienttoolbox.response.CustomerFieldAPIResponse;
import com.mallplanet.clienttoolbox.service.StickyFeetService;

@RestController
public class CustomerFieldController {
	@Autowired
    private StickyFeetService stickyFeetService;
	
	@PostMapping("/customerFieldCreate")
    public CustomerFieldAPIResponse customerFieldCreate(@RequestBody CustomerFieldRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerFieldCreate(customerFieldRequest);
    }

	@PostMapping("/customerFieldList")
    public CustomerFieldAPIResponse customerFieldList(@RequestBody CustomerFieldRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerFieldList(customerFieldRequest);
    }
	
	@PostMapping("/customerFieldUpdate")
    public CustomerFieldAPIResponse customerFieldUpdate(@RequestBody CustomerFieldRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerFieldUpdate(customerFieldRequest);
    }	
	
	@PostMapping("/customerFieldDelete")
    public CustomerFieldAPIResponse customerFieldDelete(@RequestBody CustomerFieldRequest customerFieldRequest) throws IOException {
        return stickyFeetService.customerFieldDelete(customerFieldRequest);
    }	
	
}
