package com.mallplanet.clienttoolbox.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mallplanet.clienttoolbox.request.AccountRequest;
import com.mallplanet.clienttoolbox.response.AccountAPIResponse;
import com.mallplanet.clienttoolbox.service.StickyFeetService;

@RestController
public class AccountController {	
	@Autowired
    private StickyFeetService stickyFeetService;
		
	@PostMapping("/accountInfo")
    public AccountAPIResponse accountInfo(@RequestBody AccountRequest accountRequest) throws IOException {
        return stickyFeetService.accountInfo(accountRequest);
    }
	
	@PostMapping("/accountUpdate")
    public AccountAPIResponse accountUpdate(@RequestBody AccountRequest accountRequest) throws IOException {
        return stickyFeetService.accountUpdate(accountRequest);
    }
}
	