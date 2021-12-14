package com.SpringFootballMadeSimple.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringFootballMadeSimple.model.Login;

public interface LoginRepository {
	Login addUser(Login login);
	
	List<Login> getUser(String username);
	
}
