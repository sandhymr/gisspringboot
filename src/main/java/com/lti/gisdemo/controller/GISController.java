package com.lti.gisdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gisdemo.entity.User;
import com.lti.gisdemo.service.GISService;

@RestController
@RequestMapping
public class GISController {
	
	@Autowired
	private GISService gisServiceImpl;
	
	@GetMapping("/hello")
	public String getUser() {
		return "Hello";
	}
	
	@GetMapping("/getUser")
	public User getUser(@RequestParam long userId) {
		return gisServiceImpl.getUser(userId);
	}
	
	@PostMapping("/registerUser")
	public User registerUser(@RequestBody User user) {
		return gisServiceImpl.registerUser(user);
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return gisServiceImpl.getAllUsers();
	}
}
