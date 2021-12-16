package com.skcho.thymeleafStudy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skcho.thymeleafStudy.constant.ReqMap;

@Controller
@RequestMapping(ReqMap.MAIN_PATH)
public class StudyController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// Prac 01. model로 넘겨 Hello World 찍기
	@RequestMapping(value="/prac1")
	public String prac1(Model model) {
		logger.info("in Index");
		
		model.addAttribute("title", "Hello World");
		
		return "prac1/index";
	}
}
