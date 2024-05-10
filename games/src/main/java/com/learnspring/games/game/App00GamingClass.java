package com.learnspring.games.game;

public class App00GamingClass {

	public static void main(String[] args) {
		
		var pacMan = new PacMan();
		var gameRunner = new GameRunner(pacMan);
		gameRunner.run();

	}

}
