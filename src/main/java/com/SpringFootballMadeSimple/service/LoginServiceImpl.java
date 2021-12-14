package com.SpringFootballMadeSimple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringFootballMadeSimple.model.Login;
import com.SpringFootballMadeSimple.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	@Transactional
	@Override
	public Login addUser(Login login) {
		// TODO Auto-generated method stub
		return loginRepository.addUser(login);
	}

	public boolean checkLogin(Login login) {
		// TODO Auto-generated method stub
		List<Login> users = loginRepository.getUser(login.getUsername());
		return users.get(0).getPassword().equals(login.getPassword());
	}

}
