package com.mypoc.MS2;

import java.util.HashMap;
import java.util.Map;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mypoc.MS2.DTO.MS1MS2DTO;
import com.mypoc.MS2.DTO.MS2MS1DTO;
import com.mypoc.MS2.Service.MS2Service;

@RestController
public class MS2Controller {

    Logger logger = LoggerFactory.getLogger(MS2Controller.class);
    
    @Autowired
    MS2Service ms2Service;

    MS2Controller(){
    	logger.info("MS2Controller started..");
    }

 	@GetMapping(value = "/producer")
    public String producer(HttpServletRequest request) {
 		logger.debug("I am in producer service" + request.getRequestURL().toString());
        return request.getRequestURL().toString();
    }

    @PostMapping(value = "/userDetails",consumes = { MediaType.APPLICATION_JSON_VALUE })
    public MS2MS1DTO userDetails(HttpServletRequest request, @RequestBody MS1MS2DTO ms1ms2dto) {
    	logger.debug("userDetails Method started");
    	logger.debug("UserDetails on service URI :" + request.getRequestURL().toString());
		// Custom Headers can also be added as a Map
		Map<String, String> customHeaders = new HashMap<>();
		customHeaders.put("Authorization", "Basic secretkey123");
    	
		MS2MS1DTO ms2ms1dto = new MS2MS1DTO();
		ms2ms1dto.setServiceURL( ms1ms2dto.getServiceURL());
		ms2ms1dto.setCorrelationID( ms1ms2dto.getCorrelationID());
		ms2ms1dto.setId(ms1ms2dto.getId());
        
        ms2Service.fetchUserDetails(ms1ms2dto, ms2ms1dto);
        logger.debug("userDetails Method ended");
        return ms2ms1dto;
    }

}
