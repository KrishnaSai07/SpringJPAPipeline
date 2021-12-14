package com.SpringFootballMadeSimple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.SpringFootballMadeSimple.model.Login;



@Repository
public class LoginRepositoryImpl implements LoginRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Login addUser(Login login) {
		// TODO Auto-generated method stub
		return entityManager.merge(login);
	}

	@Override
	public List<Login> getUser(String username) {
		// TODO Auto-generated method stub
		Query q = entityManager.createNativeQuery("SELECT L.id, L.username, L.password FROM logins L WHERE L.username = ? ",Login.class);
		q.setParameter(1, username);
		
		List<Login> users = q.getResultList();
		
		return users;
	}
	
	

}
