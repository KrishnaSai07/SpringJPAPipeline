package com.SpringFootballMadeSimple.service;

import java.util.List;

import com.SpringFootballMadeSimple.model.Fixtures;

public interface FixturesService {

	List<Fixtures> getFixturesByDate(String date);
}
