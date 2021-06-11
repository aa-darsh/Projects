package com.capgemini.sportsmanagment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player_tbl")
public class Player
{
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="player_Id")
	private int PlayerId;
    
    @Column(name="player_Name", length=20)
	private String playerName;
    
    @Column(name="player_Weight" ,length=20)
	private double playerWeight;
    
    @Column(name="player_Height", length=20)
	private Double playerHeight;
    
    @Column(name="player_Gender", length=8)
	private String playerGender;


	

	public String getPlayerGender() {
		return playerGender;
	}

	public void setPlayerGender(String playerGender) {
		this.playerGender = playerGender;
	}



	public int getPlayerId() {
		return PlayerId;
	}

	public void setPlayerId(int playerId) {
		PlayerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public double getPlayerWeight() {
		return playerWeight;
	}

	public void setPlayerWeight(double playerWeight) {
		this.playerWeight = playerWeight;
	}

	public Double getPlayerHeight() {
		return playerHeight;
	}

	public void setPlayerHeight(Double playerHeight) {
		this.playerHeight = playerHeight;
	}
    
	
	
	
}
