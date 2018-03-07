package com.zc.cris.beans.annotation.usercontroller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zc.cris.beans.annotation.userservice.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public void execute() {
		System.out.println("controller's execute");
		userService.add();
	}
}
