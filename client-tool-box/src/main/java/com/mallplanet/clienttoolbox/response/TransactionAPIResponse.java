package com.mallplanet.clienttoolbox.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;
import com.mallplanet.clienttoolbox.model.Batch;
import com.mallplanet.clienttoolbox.model.Receipt;

@JsonInclude(Include.NON_NULL)
public class TransactionAPIResponse {
	private String status;
	@SerializedName(value = "errors", alternate = "error")
	private Object errors;
	private Receipt receipt;
	private Batch batch;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getErrors() {
		return errors;
	}
	public void setErrors(Object errors) {
		this.errors = errors;
	}
	public Receipt getReceipt() {
		return receipt;
	}
	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	
}
