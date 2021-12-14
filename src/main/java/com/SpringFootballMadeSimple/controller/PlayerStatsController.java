package com.SpringFootballMadeSimple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringFootballMadeSimple.model.PlayerStats;
import com.SpringFootballMadeSimple.service.PlayerStatsService;

@RestController
@CrossOrigin
public class PlayerStatsController {
		
	@Autowired
	private PlayerStatsService playerStatsService;
	
	
	@GetMapping("/getPlayer")
	public PlayerStats getPlayer(@RequestParam String name)
	{
		List<PlayerStats> players = playerStatsService.getPlayer(name);
		
		return players.get(0);
		
	}
}
