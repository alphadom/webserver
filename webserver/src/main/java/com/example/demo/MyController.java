package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/sayHello")
	public String sayHello()
	{
		return "hello world!!!";
	}

}
