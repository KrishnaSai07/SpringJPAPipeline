package com.SpringFootballMadeSimple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.SpringFootballMadeSimple.model.Fixtures;

@Repository
public class FixturesRepositoryImpl implements FixturesRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Fixtures> getFixturesByDate(String date) {
		// TODO Auto-generated method stub
		Query q = entityManager.createNativeQuery("SELECT L.match_id,L.teamA,L.teamB,L.scoreA,L.scoreB,L.competition,L.date FROM fixtures L WHERE L.date = ? ",Fixtures.class);
		q.setParameter(1, date);
		
		List<Fixtures> fixtures = q.getResultList();
		
		return fixtures;
	}

}
