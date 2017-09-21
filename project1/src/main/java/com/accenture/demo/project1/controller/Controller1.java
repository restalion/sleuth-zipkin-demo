package com.accenture.demo.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.demo.dto.DTO;
import com.accenture.demo.project1.config.AppConfiguration;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Controller1 {
	
	@Value("${project2.url}")
	private String project2Url;
	
	@Value("${project3.url}")
	private String project3Url;
	
	@Autowired
	AppConfiguration config;
	
	@RequestMapping("/method1")
	public void method1(@RequestBody DTO dto) {
		log.debug("Start method1" + dto);
		log.debug("Call URL: " + project2Url);
		config.restTemplate().postForObject(project2Url, dto, DTO.class);
		
		log.debug("Call URL: " + project3Url);
		config.restTemplate().postForObject(project3Url, dto, DTO.class);
		
		log.debug("End method1" + dto);
	}
}
