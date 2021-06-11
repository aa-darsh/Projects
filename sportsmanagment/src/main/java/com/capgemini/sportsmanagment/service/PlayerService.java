package com.capgemini.sportsmanagment.service;

import java.util.List;
import com.capgemini.sportsmanagment.entity.Player;
import com.capgemini.sportsmanagment.exception.DuplicatePlayerException;
import com.capgemini.sportsmanagment.exception.PlayerNotFoundException;

public interface PlayerService {	

	public Player savePlayer(Player player) throws DuplicatePlayerException;
	
	public void deletePlayer(int playerId) throws PlayerNotFoundException ;
	
	public void modifyPlayer(Player player) throws PlayerNotFoundException;
	
	public Player fetchPlayerById(int playerId) throws PlayerNotFoundException;
	
	public List<Player> fetchAllPlayer();
	
}
