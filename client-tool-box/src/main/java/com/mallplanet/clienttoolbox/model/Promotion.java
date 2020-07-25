package com.mallplanet.clienttoolbox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

@JsonInclude(Include.NON_NULL)
public class Promotion {
	private String status;
	private String id;
	private String operand;
	private String value;
	private String description;
	@SerializedName("promo_custom_id")
	private String promoCustomId;
	@SerializedName("promo_start_date")
	private String promoStartDate;
	@SerializedName("promo_end_date")
	private String promoEndDate;
	
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
	public String getOperand() {
		return operand;
	}
	public void setOperand(String operand) {
		this.operand = operand;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPromoCustomId() {
		return promoCustomId;
	}
	public void setPromoCustomId(String promoCustomId) {
		this.promoCustomId = promoCustomId;
	}
	public String getPromoStartDate() {
		return promoStartDate;
	}
	public void setPromoStartDate(String promoStartDate) {
		this.promoStartDate = promoStartDate;
	}
	public String getPromoEndDate() {
		return promoEndDate;
	}
	public void setPromoEndDate(String promoEndDate) {
		this.promoEndDate = promoEndDate;
	}
}
