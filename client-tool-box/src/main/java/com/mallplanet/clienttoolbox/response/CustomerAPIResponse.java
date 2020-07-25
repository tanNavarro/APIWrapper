package com.mallplanet.clienttoolbox.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mallplanet.clienttoolbox.model.Batch;
import com.mallplanet.clienttoolbox.model.Campaign;
import com.mallplanet.clienttoolbox.model.CampaignBalance;
import com.mallplanet.clienttoolbox.model.Customer;

@JsonInclude(Include.NON_NULL)
public class CustomerAPIResponse {
	private String status;
	private String code;
	private String account_name;
	private List<String> errors;
	private Batch batch;
	private Customer customer;
	private List<Customer> customers;
	private CampaignBalance campaign;
	private List<Campaign> campaigns;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public CampaignBalance getCampaign() {
		return campaign;
	}
	public void setCampaign(CampaignBalance campaign) {
		this.campaign = campaign;
	}
	public List<Campaign> getCampaigns() {
		return campaigns;
	}
	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}
}
