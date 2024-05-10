package com.learnspring.games.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingClass {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).down();
			context.getBean(GameRunner.class).run();
		}
		

	}

}
