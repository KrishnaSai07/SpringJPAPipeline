package com.SpringFootballMadeSimple.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fixtures")
public class Fixtures {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="match_id")
	private Integer matchId;
	@Column(name="teamA")
	private String teamA;
	@Column(name="teamB")
	private String teamB;
	@Column(name="scoreA")
	private int scoreA;
	@Column(name="scoreB")
	private int scoreB;
	@Column(name="competition")
	private String competition;
	@Column(name="date")
	private String date;
	
	
	public Fixtures() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getMatchId() {
		return matchId;
	}
	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}
	public String getTeamA() {
		return teamA;
	}
	public void setTeamA(String teamA) {
		this.teamA = teamA;
	}
	public String getTeamB() {
		return teamB;
	}
	public void setTeamB(String teamB) {
		this.teamB = teamB;
	}
	public int getScoreA() {
		return scoreA;
	}
	public void setScoreA(int scoreA) {
		this.scoreA = scoreA;
	}
	public int getScoreB() {
		return scoreB;
	}
	public void setScoreB(int scoreB) {
		this.scoreB = scoreB;
	}
	public String getCompetition() {
		return competition;
	}
	public void setCompetition(String competition) {
		this.competition = competition;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
