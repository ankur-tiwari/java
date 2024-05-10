package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int count = 0;
	
	static {
		users.add(new User(count++, "Adam", LocalDate.now().minusYears(23)));
		users.add(new User(count++, "Ankur", LocalDate.now().minusYears(50)));
		users.add(new User(count++, "Anvi", LocalDate.now().minusYears(85)));
		users.add(new User(count++, "Amit", LocalDate.now().minusYears(74)));
	}

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
		Predicate<? super User> Predicate = user -> user.getId() == id;
		return users.stream().filter(Predicate).findFirst().orElse(null);
		
	}
	
	public User save(@RequestBody User  user) {
		user.setId(count++);
		users.add(user);
		return user;
		
	}

	public void deleteById(int id) {
		Predicate<? super User> Predicate = user -> user.getId() == id;
		users.removeIf(Predicate);
	}
	
	public User update(@RequestBody User user1, int id) {
		Predicate<? super User> Predicate = user -> user.getId() == id;
		User userUpdate = users.stream().filter(Predicate).findFirst().get();
		 
		 return userUpdate;
	}
}
