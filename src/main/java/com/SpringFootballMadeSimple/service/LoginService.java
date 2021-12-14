package com.SpringFootballMadeSimple.service;

import java.util.List;

import com.SpringFootballMadeSimple.model.Login;

public interface LoginService {
	
	Login addUser(Login login);
	
	boolean checkLogin(Login login);

}
