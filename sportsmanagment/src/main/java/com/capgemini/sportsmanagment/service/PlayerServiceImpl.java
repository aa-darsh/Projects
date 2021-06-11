package com.capgemini.sportsmanagment.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.sportsmanagment.entity.Player;
import com.capgemini.sportsmanagment.exception.DuplicatePlayerException;
import com.capgemini.sportsmanagment.exception.PlayerNotFoundException;
import com.capgemini.sportsmanagment.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Player savePlayer(Player player) throws DuplicatePlayerException  {
		
		Optional<Player> playerObj = playerRepository.findById(player.getPlayerId());
		
        if (playerObj.isPresent()) {
            throw new DuplicatePlayerException("Player Already Existing With Id: "+player.getPlayerId());
        }       
		
		return playerRepository.save(player);
			
	}

	@Override
	public void deletePlayer(int playerId) throws PlayerNotFoundException {
		
		Optional<Player> player = playerRepository.findById(playerId);
		if(player.isEmpty()) {
			throw new PlayerNotFoundException("No Player is Existing With id: "+playerId);
			
		}
		
		playerRepository.deleteById(playerId);
		
	}


	@Override
	public void modifyPlayer(Player player) {
		
		playerRepository.save(player);
		
	}

	@Override
	public Player fetchPlayerById(int playerId) throws PlayerNotFoundException {	
		
		Optional<Player> player = playerRepository.findById(playerId);
		if(player.isEmpty()) {
			throw new PlayerNotFoundException("No Player is Existing With id: "+playerId);
			
		}
		return playerRepository.findById(playerId).get();		
	}

	@Override
	public List<Player> fetchAllPlayer() {
		
		return playerRepository.findAll();
	}


}