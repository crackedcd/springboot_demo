package com.cc_testj.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexContoller {

	@RequestMapping("/index")
	public String index() {
		return "hello world!";
	}
	
}
