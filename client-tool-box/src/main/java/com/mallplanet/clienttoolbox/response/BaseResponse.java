package com.mallplanet.clienttoolbox.response;

public class BaseResponse {

	private String status;
	private Object responseBody ;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Object getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(Object responseBody) {
		this.responseBody = responseBody;
	}
}
