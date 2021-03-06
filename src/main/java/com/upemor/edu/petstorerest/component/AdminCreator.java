package com.upemor.edu.petstorerest.component;




import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upemor.edu.petstorerest.model.User;
import com.upemor.edu.petstorerest.service.UserService;

@Component
public class AdminCreator {
	
	@Autowired
	private UserService userService;
	
	@PostConstruct
	public void adminCreate() {
		if(!userService.existsUserByEmail("admin@localhost.com")) {
			User user = new User("admin","admin","admin","admin@localhost.com","admin",true,"ADMIN");
			userService.createUser(user);
		}
	}

}