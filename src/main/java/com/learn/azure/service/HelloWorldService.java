package com.learn.azure.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldService {
	
	@RequestMapping("/helloWorld")
	public String sayHelowWorld()
	{
		return "Hey! Welcome to Helow world. Your first cloud app is ready";
	}

}
