package com.zensar.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebService {
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Welcom to Zensar Web Service using Spring Boot";
	}
}
