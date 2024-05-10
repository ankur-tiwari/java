package com.in28minutes.learnspringsecurity.todo;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {
	
	private static final List<Todo> TODO_LIST = 
			List.of(new Todo("Learn AWS", "ankur"), 
					new Todo("Learn Java Core", "ankur"), 
					new Todo("Learn RDS", "ankur"));

	@GetMapping("/todos")
	public List<Todo> retriveTodo() {
		return TODO_LIST;
	}
	
	@GetMapping("/users/{username}/todos")
	@PreAuthorize("hasRole('USER')")
	public Todo retriveTodoByUsername(@PathVariable("username") String username) {
		
		return TODO_LIST.get(0);
	}
	
	@PostMapping("/users/{username}/todos")
	public Todo addTodo(@PathVariable("username") String username, @RequestBody Todo todo) {
		return todo;
	}
}

record Todo(String description, String username) {
	
}