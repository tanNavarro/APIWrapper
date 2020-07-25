package com.mallplanet.clienttoolbox.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mallplanet.clienttoolbox.request.TokenRequest;
import com.mallplanet.clienttoolbox.response.TokenAPIResponse;
import com.mallplanet.clienttoolbox.service.StickyFeetService;

@RestController
public class TokenController {
	@Autowired
    private StickyFeetService stickyFeetService;
		
	@PostMapping("/tokenGenerate")
    public TokenAPIResponse tokenGenerate(@RequestBody TokenRequest tokenRequest) throws IOException {
        return stickyFeetService.tokenGenerate(tokenRequest);
    }
	
	@PostMapping("/tokenValidate")
    public TokenAPIResponse tokenValidate(@RequestBody TokenRequest tokenRequest) throws IOException {
        return stickyFeetService.tokenValidate(tokenRequest);
    }
}
