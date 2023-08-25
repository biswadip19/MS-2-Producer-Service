package com.mypoc.MS2.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MS1MS2DTO extends BaseDTO{
	
	@JsonProperty(value = "ID")
	private String id;
	
	@JsonProperty(value = "name")
	private String name;
	
	@JsonProperty(value = "addressLine1")
	private String addr1;
	
	@JsonProperty(value = "addressLine2")
	private String addr2;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	
	
	
	
	

}
