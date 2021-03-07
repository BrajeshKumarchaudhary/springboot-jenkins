package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	
	@GetMapping(value = "getAllUser")
	public String getAllUser() {
		return "Brajesh Kumar";
	}
}
