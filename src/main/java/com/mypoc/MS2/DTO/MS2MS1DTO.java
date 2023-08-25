package com.mypoc.MS2.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MS2MS1DTO extends BaseDTO {
	
	@JsonProperty(value = "ID")
	private String id;
	
	@JsonProperty(value = "detailsOfWork")
	private String detailsOfWork;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDetailsOfWork() {
		return detailsOfWork;
	}

	public void setDetailsOfWork(String detailsOfWork) {
		this.detailsOfWork = detailsOfWork;
	}
	
	

}
