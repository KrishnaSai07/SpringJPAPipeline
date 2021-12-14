package com.SpringFootballMadeSimple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringFootballMadeSimple.model.Login;
import com.SpringFootballMadeSimple.service.LoginService;


@CrossOrigin()
@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping("/create")
	public Login addUser(@RequestBody Login login)
	{
		return loginService.addUser(login);
	}
	
	@PostMapping("/verify")
	public boolean verify(@RequestBody Login login)
	{
		return loginService.checkLogin(login);	
	}
	
}
