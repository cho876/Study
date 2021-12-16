package com.skcho.thymeleafStudy.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skcho.thymeleafStudy.constant.ReqMap;
import com.skcho.thymeleafStudy.vo.StudentVo;

@Controller
@RequestMapping(ReqMap.MAIN_PATH)
public class StudyController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// Prac 01. model로 넘겨 Hello World 찍기
	@RequestMapping(value="/prac1")
	public String prac1(Model model) {
		logger.info("prac1 called");
		
		model.addAttribute("title", "Hello World");
		
		return "prac1/index";
	}
	
	// Prac 02. List 데이터를 넘겨 table로 출력하기
	@RequestMapping(value="/prac2")
	public String prac2(Model model) {
		logger.info("prac2 called");
		
		List<StudentVo> studentList = new ArrayList<>();
		
		StudentVo studentVo1 = new StudentVo("12345","kwonnee1","28");
		StudentVo studentVo2 = new StudentVo("67890","kwonnee2","29");
		StudentVo studentVo3 = new StudentVo("00000","kwonnee3","30");
		
		studentList.add(studentVo1);
		studentList.add(studentVo2);
		studentList.add(studentVo3);
		
		model.addAttribute("studentList",studentList);
		
		return "prac2/index";
	}
}
