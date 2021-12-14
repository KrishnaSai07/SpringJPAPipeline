package com.SpringFootballMadeSimple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringFootballMadeSimple.model.Fixtures;
import com.SpringFootballMadeSimple.repository.FixturesRepository;

@Service
public class FixturesServiceImpl implements FixturesService{

	@Autowired
	private FixturesRepository fixturesRepository; 
	
	@Override
	public List<Fixtures> getFixturesByDate(String date) {
		// TODO Auto-generated method stub
		return fixturesRepository.getFixturesByDate(date);
	}

}
