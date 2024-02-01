package com.sample.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class Controller {
	
	@GetMapping
	String sample() {
		return "Hello world";
	}

}
