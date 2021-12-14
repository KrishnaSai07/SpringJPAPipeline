package com.SpringFootballMadeSimple.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="standings")
public class Standings {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="club")
	private String club;
	@Column(name="matches")
	private int matches;
	@Column(name="won")
	private int won;
	@Column(name="draws")
	private int draws;
	@Column(name="loss")
	private int loss;
	@Column(name="GF")
	private int gf;
	@Column(name="GA")
	private int ga;
	@Column(name="GD")
	private int gd;
	@Column(name="points")
	private int points;
	
	
	public Standings() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getClub() {
		return club;
	}


	public void setClub(String club) {
		this.club = club;
	}


	public int getMatches() {
		return matches;
	}


	public void setMatches(int matches) {
		this.matches = matches;
	}


	public int getWon() {
		return won;
	}


	public void setWon(int won) {
		this.won = won;
	}


	public int getDraws() {
		return draws;
	}


	public void setDraws(int draws) {
		this.draws = draws;
	}


	public int getLoss() {
		return loss;
	}


	public void setLoss(int loss) {
		this.loss = loss;
	}


	public int getGf() {
		return gf;
	}


	public void setGf(int gf) {
		this.gf = gf;
	}


	public int getGa() {
		return ga;
	}


	public void setGa(int ga) {
		this.ga = ga;
	}


	public int getGd() {
		return gd;
	}


	public void setGd(int gd) {
		this.gd = gd;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}
	
	
	
	
	
}
