package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	@Autowired
	public UserService userService;
	
	@PostMapping(path = "/post")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
}
