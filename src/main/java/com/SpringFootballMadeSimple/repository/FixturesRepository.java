package com.SpringFootballMadeSimple.repository;

import java.util.List;

import com.SpringFootballMadeSimple.model.Fixtures;

public interface FixturesRepository {

	List<Fixtures> getFixturesByDate(String date);
	
}
