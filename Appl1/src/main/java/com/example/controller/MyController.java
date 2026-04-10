package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	
	@GetMapping
	void retraiveall() {
		
		System.out.println("ahdsjh");
	}
	
	
	void newCreate()
	{
		System.out.println("Ram");
		System.out.println("shyam");
	}

}
