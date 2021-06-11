package com.capgemini.sportsmanagment.exception;

import com.capgemini.sportsmanagment.entity.Player;

public class DuplicatePlayerException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	private Player player;
    
    private String message;
    
    public DuplicatePlayerException(String message) {
        super(message);
    }

    public DuplicatePlayerException(Player player) {
        this.player = player;
    }

	public Player getPlayer() {
		return player;
	}	
	
}