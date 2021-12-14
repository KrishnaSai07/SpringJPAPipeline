package com.SpringFootballMadeSimple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringFootballMadeSimple.model.PlayerStats;
import com.SpringFootballMadeSimple.repository.PlayerStatsRepository;

@Service
public class PlayerStatsServiceImpl implements PlayerStatsService {

	
	@Autowired
	private PlayerStatsRepository playerStatsRepository;
	
	@Override
	public List<PlayerStats> getPlayer(String name) {
		// TODO Auto-generated method stub
		return playerStatsRepository.getPlayer(name);
	}

}
