package com.mallplanet.clienttoolbox.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CumulativeBalance {
	private String points;

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}	
}
