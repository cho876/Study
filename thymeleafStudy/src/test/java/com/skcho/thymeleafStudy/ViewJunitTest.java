package com.skcho.thymeleafStudy;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ViewJunitTest {

	@Autowired
	MockMvc mockMvc;

	
	/*
	 * View 동작 여부 확인 Junit Test
	 * 
	 * Method: GET
	 * url: /main/hello
	 * view name: hello
	 * model attribute: {"name": "skcho"}
	 * 
	 */
	@Test
	public void helloTest() throws Exception {
		mockMvc.perform(get("/main/hello"))
				.andExpect(status().isOk())
				.andExpect(view().name("hello"))
				.andExpect(model().attribute("name", "skcho"))
				.andDo(print());
	}
}
