package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/get_user/{userName}")
	public String getUser(@PathVariable(value = "userName") String userName) {
		return "User Returned : " + userName;
	}
	
	
}
