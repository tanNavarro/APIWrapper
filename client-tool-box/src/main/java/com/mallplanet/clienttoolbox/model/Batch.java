package com.mallplanet.clienttoolbox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class Batch {
	private String status;
	@SerializedName("new_customers")
	private String newCustomers;
	private Object customers;
	private Object transactions;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getCustomers() {
		return customers;
	}
	public void setCustomers(Object customers) {
		this.customers = customers;
	}
	public Object getTransactions() {
		return transactions;
	}
	public void setTransactions(Object transactions) {
		this.transactions = transactions;
	}
}
