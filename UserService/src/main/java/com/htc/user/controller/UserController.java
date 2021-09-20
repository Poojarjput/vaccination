package com.htc.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.user.dao.IUserInterface;
import com.htc.user.entity.User;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private IUserInterface userinterface;
	

	@PostMapping("/users")
	User createUserdetails(@RequestBody User user)
	{
		return userinterface.save(user);
		
	}
	
	 @GetMapping("/users")
	  public List<User> getAllUserdetails() {
	   
	    List<User> list = new ArrayList<>();
	    Iterable<User> users = userinterface.findAll();
	 
	    users.forEach(list::add);
	    return list;
	  }

}
