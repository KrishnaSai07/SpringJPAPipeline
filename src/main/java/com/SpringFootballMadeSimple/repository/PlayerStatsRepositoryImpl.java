package com.SpringFootballMadeSimple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.SpringFootballMadeSimple.model.Login;
import com.SpringFootballMadeSimple.model.PlayerStats;

@Repository
public class PlayerStatsRepositoryImpl implements PlayerStatsRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<PlayerStats> getPlayer(String name) {
		// TODO Auto-generated method stub
		Query q = entityManager.createNativeQuery("SELECT L.player_id, L.player_name,L.age,L.club,L.position,L.country,L.matches,L.goals,L.assists,L.cleansheets FROM player_stats L WHERE L.player_name = ? ",PlayerStats.class);
		q.setParameter(1, name);
		
		List<PlayerStats> players = q.getResultList();
		
		return players;
	}

}
