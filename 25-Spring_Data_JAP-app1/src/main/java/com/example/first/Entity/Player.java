package com.example.first.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CRICKET_PLAYERS")
public class Player {

	@Id
	private Integer playerId;
	@Column(name="Name")
	private String playerName;
	
	private String teamname;

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

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	
	@Override
	public String toString() {
		return "player[id="+playerId+"player name ="+playerName+
				"player team ="+teamname+"]";
		
	}

	
	
}
