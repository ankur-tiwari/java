package com.learnspring.games.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.games.game.GameRunner;
import com.learnspring.games.game.MarioGame;
import com.learnspring.games.game.PacMan;
import com.learnspring.games.game.SuperContra;

public class App01GamingClass {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("address"));
			System.out.println(context.getBean("education"));
			System.out.println(context.getBean(Address.class));
		}
	}

}
