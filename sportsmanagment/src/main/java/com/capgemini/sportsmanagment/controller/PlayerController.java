package com.capgemini.sportsmanagment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.sportsmanagment.entity.Player;
import com.capgemini.sportsmanagment.service.PlayerService;



@RestController
@RequestMapping("/players")
public class PlayerController 
{
	@Autowired
	private PlayerService playerService;
	
	@GetMapping("/getall")
	public List<Player> getAllPlayers() 
	{
		
		List<Player> players = playerService.fetchAllPlayer();
		
		return players;
	}
	
	@GetMapping("/{playerId}")
	public Player getPlayer(@PathVariable("playerId") int PlayerId) {
		
		Player player = playerService.fetchPlayerById(PlayerId);	
		return player;
	}
	
	@PostMapping("/save")
	public void savePlayer(@RequestBody Player player) {
		
		playerService.savePlayer(player);
	}
	
	@DeleteMapping("/{traineeId}")
	public void deleteTrainee(@PathVariable("traineeId") int traineeId) {
		playerService.deletePlayer(traineeId);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateTrainee(@RequestBody Player player) {		
		playerService.modifyPlayer(player);	
		return new ResponseEntity<>(player,HttpStatus.OK);
		
		
	}	
	
}

