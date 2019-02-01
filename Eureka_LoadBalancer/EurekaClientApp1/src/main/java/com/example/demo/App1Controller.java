package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/")
public class App1Controller {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value="/show")
	public String helloApp1() {
		
		String url = "http://dbApp/emp/list";
		String result = restTemplate.getForObject( url, String.class);
		
		return "<h1> Hello App1 - Instance 2 </h1> " +
		        " <h3> " +  result + "</h3> ";
	}

}
