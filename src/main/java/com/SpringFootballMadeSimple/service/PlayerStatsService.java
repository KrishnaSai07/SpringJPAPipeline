package com.SpringFootballMadeSimple.service;

import java.util.List;

import com.SpringFootballMadeSimple.model.PlayerStats;

public interface PlayerStatsService {

	List<PlayerStats> getPlayer(String name);
}
