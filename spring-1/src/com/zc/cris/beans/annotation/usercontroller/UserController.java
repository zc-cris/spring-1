package com.zc.cris.beans.annotation.usercontroller;

import org.springframework.stereotype.Controller;

import com.zc.cris.beans.annotation.userservice.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	
	public void execute() {
		System.out.println("controller's execute");
		userService.add();
	}
}
