package com.capgemini.sportsmanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.capgemini.sportsmanagment.entity.Player;

public interface PlayerRepository extends JpaRepository<Player,Integer> {

	
}