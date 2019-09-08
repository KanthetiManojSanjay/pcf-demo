package com.pcf.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pcf")
public class DemoController {
	
	@GetMapping("/demo")
	public String getMessage() {
		return "My App in PCF!!";
	}
	
	
	@GetMapping("/feature")
	public String getFeatureMessage() {
		return "New Feature Added";
	}
	
	@GetMapping("/develop")
	public String getDevelopMessage() {
		return "New Develop Added";
	}

}
