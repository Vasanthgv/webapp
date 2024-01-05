package com.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApp {
	@GetMapping("/jen")
	public String getW() {
		return "hellooo....";
	}

}
