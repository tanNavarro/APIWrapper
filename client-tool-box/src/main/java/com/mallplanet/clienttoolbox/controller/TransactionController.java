package com.mallplanet.clienttoolbox.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mallplanet.clienttoolbox.request.TransactionRequest;
import com.mallplanet.clienttoolbox.response.TransactionAPIResponse;
import com.mallplanet.clienttoolbox.service.StickyFeetService;

@RestController
public class TransactionController {
	@Autowired
    private StickyFeetService stickyFeetService;
		
	@PostMapping("/transactionRecord")
    public TransactionAPIResponse transactionRecord(@RequestBody TransactionRequest transactionRequest) throws IOException {
        return stickyFeetService.transactionRecord(transactionRequest);
    }
	
	@PostMapping("/transactionRedeem")
    public TransactionAPIResponse transactionRedeem(@RequestBody TransactionRequest transactionRequest) throws IOException {
        return stickyFeetService.transactionRedeem(transactionRequest);
    }
	
	@PostMapping("/transactionDelete")
    public TransactionAPIResponse transactionDelete(@RequestBody TransactionRequest transactionRequest) throws IOException {
        return stickyFeetService.transactionDelete(transactionRequest);
    }
	
	@PostMapping("/transactionBatch")
    public TransactionAPIResponse transactionBatch(@RequestBody TransactionRequest transactionRequest) throws IOException {
        return stickyFeetService.transactionBatch(transactionRequest);
    }
}
