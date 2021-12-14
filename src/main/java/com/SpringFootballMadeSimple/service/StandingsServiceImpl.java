package com.SpringFootballMadeSimple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringFootballMadeSimple.model.Standings;
import com.SpringFootballMadeSimple.repository.StandingsRepository;

@Service
public class StandingsServiceImpl implements StandingsService {

	@Autowired
	private StandingsRepository standingsRepository;
	
	@Override
	public List<Standings> getAllStandings() {
		// TODO Auto-generated method stub
		return standingsRepository.getAllStandings();
	}

}
