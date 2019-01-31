package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class App1Controller {
	
	
	@GetMapping(value="/show")
	public String helloApp1() {
		
		return "<h1> Hello App1 </h1>";
	}

}
