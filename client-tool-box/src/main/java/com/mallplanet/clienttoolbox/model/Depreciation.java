package com.mallplanet.clienttoolbox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class Depreciation {
	private String status;
	private String id;
	private String type;
	@SerializedName(value = "depreciation_interval", alternate = "interval")
	private String depreciationInterval;
	@SerializedName(value = "depreciation_interval_type", alternate = "interval_type")
	private String depreciationIntervalType;
	@SerializedName(value = "depreciation_percentage", alternate = "precentage")
	private String depreciationPercentage;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDepreciationInterval() {
		return depreciationInterval;
	}
	public void setDepreciationInterval(String depreciationInterval) {
		this.depreciationInterval = depreciationInterval;
	}
	public String getDepreciationIntervalType() {
		return depreciationIntervalType;
	}
	public void setDepreciationIntervalType(String depreciationIntervalType) {
		this.depreciationIntervalType = depreciationIntervalType;
	}
	public String getDepreciationPercentage() {
		return depreciationPercentage;
	}
	public void setDepreciationPercentage(String depreciationPercentage) {
		this.depreciationPercentage = depreciationPercentage;
	}	
}
