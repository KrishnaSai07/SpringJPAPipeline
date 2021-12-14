package com.SpringFootballMadeSimple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringFootballMadeSimple.model.Fixtures;
import com.SpringFootballMadeSimple.service.FixturesService;

@RestController
@CrossOrigin
public class FixturesController {
	
	@Autowired
	private FixturesService fixturesService;

	@GetMapping("/getFixtures")
	public List<Fixtures> getFixtures(@RequestParam String date)
	{
		return fixturesService.getFixturesByDate(date);
	}
	
	
}
