package com.mypoc.MS2.DTO;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseDTO {
	
	@JsonProperty(value = "serviceURI")
	private String serviceURL;
	
	@JsonProperty(value = "correlationID")
	private String correlationID;
	
	@JsonProperty(value = "status")
	private String status;
	
	@JsonProperty(value = "errorDetails")
	private String errorDetails;
	
	
	private Map<String,String> customHeader;

	public String getServiceURL() {
		return serviceURL;
	}

	public void setServiceURL(String serviceURL) {
		this.serviceURL = serviceURL;
	}

	public String getCorrelationID() {
		return correlationID;
	}

	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}

	public Map<String,String> getCustomHeader() {
		return customHeader;
	}

	public void setCustomHeader(Map<String,String> customHeader) {
		this.customHeader = customHeader;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	
	
}
