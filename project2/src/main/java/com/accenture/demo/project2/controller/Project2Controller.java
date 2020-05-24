package com.accenture.demo.project2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.demo.dto.DTO;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class Project2Controller {
	
	@Value("${project3.url}")
	private String project3Url;

	@RequestMapping("/method2")
	public DTO method2(@RequestBody DTO dto) {
		log.debug("Start method2" + dto);
		
		log.debug("Call URL: " + project3Url);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(project3Url, dto, DTO.class);
		
		log.debug("End method2" + dto);
		return dto;
	}
}
