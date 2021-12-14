package com.SpringFootballMadeSimple.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="player_stats")
public class PlayerStats {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="player_id")
	private Integer playerId;
	@Column(name="player_name")
	private String playerName;
	@Column(name="age")
	private int age;
	@Column(name="club")
	private String club;
	@Column(name="position")
	private String position;
	@Column(name="country")
	private String country;
	@Column(name="matches")
	private int matches;
	@Column(name="goals")
	private int goals;
	@Column(name="assists")
	private int assists;
	@Column(name="cleansheets")
	private int cleansheets;
	
	
	public PlayerStats() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public int getCleansheets() {
		return cleansheets;
	}
	public void setCleansheets(int cleansheets) {
		this.cleansheets = cleansheets;
	}
	
	
	
}
