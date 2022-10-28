package com.example.demo;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HoomeController {
	
	@GetMapping("/")
	public String home() {
		return "Welcome abroad ... you don't need to login";
	}
	
	@GetMapping("/prevent")
	public Principal prevent(Principal principal) {
		return principal;
	}

}
