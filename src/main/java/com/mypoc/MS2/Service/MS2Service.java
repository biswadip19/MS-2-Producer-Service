package com.mypoc.MS2.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mypoc.MS2.DTO.MS1MS2DTO;
import com.mypoc.MS2.DTO.MS2MS1DTO;

@Service
public class MS2Service {
	
	Logger logger = LoggerFactory.getLogger(MS2Service.class);


	public void fetchUserDetails(MS1MS2DTO ms1ms2dto, MS2MS1DTO ms2ms1dto) {
		logger.debug("fetchUserDetails Method started");
		
		// DO compute or data fetch operations..
		
		ms2ms1dto.setId(ms1ms2dto.getId());
		ms2ms1dto.setDetailsOfWork("IT Workder");
		
	}
	
}
