package com.mallplanet.clienttoolbox.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;
import com.mallplanet.clienttoolbox.model.User;

@JsonInclude(Include.NON_NULL)
public class UsersListAPIResponse {

	private String status;
	private List<String> errors;
	private List<User> users;
	@SerializedName("users_added")
	private Object usersAdded;
	@SerializedName("users_removed")
	private Object usersRemoved;
	@SerializedName("campaigns_added")
	private Object campaignsAdded;
	private String message;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Object getUsersAdded() {
		return usersAdded;
	}
	public void setUsersAdded(Object usersAdded) {
		this.usersAdded = usersAdded;
	}
	public Object getUsersRemoved() {
		return usersRemoved;
	}
	public void setUsersRemoved(Object usersRemoved) {
		this.usersRemoved = usersRemoved;
	}
	public Object getCampaignsAdded() {
		return campaignsAdded;
	}
	public void setCampaignsAdded(Object campaignsAdded) {
		this.campaignsAdded = campaignsAdded;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
