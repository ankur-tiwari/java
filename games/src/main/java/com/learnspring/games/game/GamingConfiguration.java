package com.learnspring.games.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole gameConsole() {
		var game = new PacMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner() {
		var gameRunner = new GameRunner(gameConsole());
		return gameRunner;
	}
}
