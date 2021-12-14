package com.SpringFootballMadeSimple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.SpringFootballMadeSimple.model.PlayerStats;
import com.SpringFootballMadeSimple.model.Standings;

@Repository 
public class StandingsRepositoryImpl implements StandingsRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Standings> getAllStandings() {
		// TODO Auto-generated method stub
		Query q = entityManager.createNativeQuery("SELECT S.id,S.club,S.matches,S.won,S.draws,S.loss,S.GF,S.GA,S.GD,S.points  FROM standings S",Standings.class);
		
		List<Standings> standings = q.getResultList();
		
		return standings;
	}

}
