package com.SpringFootballMadeSimple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringFootballMadeSimple.model.Standings;
import com.SpringFootballMadeSimple.service.StandingsService;

@RestController
@CrossOrigin
public class StandingsController {

	@Autowired
	private StandingsService standingsService;
	
	@GetMapping("/standings")
	public List<Standings> getStandings()
	{
		return standingsService.getAllStandings();
	}
	
}
