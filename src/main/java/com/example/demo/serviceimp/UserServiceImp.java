package com.example.demo.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	public UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		return this.userRepository.save(user);
	}
}
