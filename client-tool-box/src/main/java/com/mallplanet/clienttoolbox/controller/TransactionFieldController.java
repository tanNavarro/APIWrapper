package com.mallplanet.clienttoolbox.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mallplanet.clienttoolbox.request.TransactionFieldRequest;
import com.mallplanet.clienttoolbox.response.TransactionFieldAPIResponse;
import com.mallplanet.clienttoolbox.service.StickyFeetService;

@RestController
public class TransactionFieldController {
	@Autowired
    private StickyFeetService stickyFeetService;
	
	@PostMapping("/transactionFieldCreate")
    public TransactionFieldAPIResponse transactionFieldCreate(@RequestBody TransactionFieldRequest transactionFieldRequest) throws IOException {
        return stickyFeetService.transactionFieldCreate(transactionFieldRequest);
    }

	@PostMapping("/transactionFieldList")
    public TransactionFieldAPIResponse transactionFieldList(@RequestBody TransactionFieldRequest transactionFieldRequest) throws IOException {
        return stickyFeetService.transactionFieldList(transactionFieldRequest);
    }
	
	@PostMapping("/transactionFieldUpdate")
    public TransactionFieldAPIResponse transactionFieldUpdate(@RequestBody TransactionFieldRequest transactionFieldRequest) throws IOException {
        return stickyFeetService.transactionFieldUpdate(transactionFieldRequest);
    }	
	
	@PostMapping("/transactionFieldDelete")
    public TransactionFieldAPIResponse transactionFieldDelete(@RequestBody TransactionFieldRequest transactionFieldRequest) throws IOException {
        return stickyFeetService.transactionFieldDelete(transactionFieldRequest);
    }		
}
