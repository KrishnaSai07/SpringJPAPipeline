package com.SpringFootballMadeSimple.repository;

import java.util.List;

import com.SpringFootballMadeSimple.model.PlayerStats;

public interface PlayerStatsRepository {

	List<PlayerStats> getPlayer(String name);
	
}
