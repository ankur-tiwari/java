package com.learnspring.games.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) { };
record Address(String address, String city) { };
record Education(String degree, String school) { };

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ankur";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean 
	public Person person() {
		return new Person("Ranga", 15, new Address("Bhamori", "Indore"));
	}
	
	@Bean 
	public Person person2() {
		return new Person(name(), age(), address() );
	}
	
	@Bean 
	public Address address() {
		return new Address("Vijay Nagar", "Indore");
	}
	
	@Bean 
	@Primary
	public Address address2() {
		return new Address("Bhavour Kua", "Indore");
	}
	
	@Bean (name = "education")
	public Education getEducation() {
		return new Education("BE (Computer Science)", "MIT Indore");
	}
}
