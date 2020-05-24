package com.accenture.demo.project3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.demo.dto.DTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Controller3 {
	
	@RequestMapping("/method3")
	public DTO method3(@RequestBody DTO dto) {
		log.debug("Start method3" + dto);
	
		log.debug("End method3" + dto);
		return dto;
	}
}
