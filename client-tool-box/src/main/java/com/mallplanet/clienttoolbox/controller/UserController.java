package com.mallplanet.clienttoolbox.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mallplanet.clienttoolbox.request.UserRequest;
import com.mallplanet.clienttoolbox.response.UserAPIResponse;
import com.mallplanet.clienttoolbox.response.UsersListAPIResponse;
import com.mallplanet.clienttoolbox.service.StickyFeetService;

@RestController
public class UserController {	
	@Autowired
    private StickyFeetService stickyFeetService;
	
	@PostMapping("/userInfo")
    public UserAPIResponse userInfo(@RequestBody UserRequest userRequest) throws IOException {
        return stickyFeetService.userInfo(userRequest);
    }
	
	@PostMapping("/userUpdate")
    public UserAPIResponse userUpdate(@RequestBody UserRequest userRequest) throws IOException {
        return stickyFeetService.userUpdate(userRequest);
    }
	
	@PostMapping("/userNew")
    public UserAPIResponse userNew(@RequestBody UserRequest userRequest) throws IOException {
        return stickyFeetService.userNew(userRequest);
    }
	
	@PostMapping("/userDelete")
    public UserAPIResponse userDelete(@RequestBody UserRequest userRequest) throws IOException {
        return stickyFeetService.userDelete(userRequest);
    }
	
	@PostMapping("/usersList")
    public UsersListAPIResponse usersList(@RequestBody UserRequest userRequest) throws IOException {
        return stickyFeetService.usersList(userRequest);
    }
	
	@PostMapping("/usersAddToCampaign")
    public UsersListAPIResponse usersAddToCampaign(@RequestBody UserRequest userRequest) throws IOException {
        return stickyFeetService.usersAddToCampaign(userRequest);
    }
	
	@PostMapping("/usersRemoveFromCampaign")
    public UsersListAPIResponse usersRemoveFromCampaign(@RequestBody UserRequest userRequest) throws IOException {
        return stickyFeetService.usersRemoveFromCampaign(userRequest);
    }
}
	