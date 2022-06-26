package com.apigateway.api_gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBack() {
		return "User Service is down at this time";
	}
	
	
	@GetMapping("/contactServiceFallBack")
	public String contactServiceFallBack() {
		return "Contact Service is down at this time";
	}
}
