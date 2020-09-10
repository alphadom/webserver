package com.example.webservermysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	MyRepo myrepo;
	
	@GetMapping("/sayMsg")
	public String sayMsg()
	{
		return "hello saymsg !!!";
	}

}
