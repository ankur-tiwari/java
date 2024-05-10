package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResourceJPA {
	
	private TodoService todoService;
	private TodoRepository todoRepository;
	
	
	public TodoResourceJPA(TodoService todoService, TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
		this.todoService = todoService;
	}


	@GetMapping("/users/{username}/todos") 
	public List<Todo> retrieveTodos(@PathVariable String username) {
		return todoRepository.findByUsername(username);
	}
	
	
	@GetMapping("/users/{username}/todos/{id}") 
	public Optional<Todo> retrieveTodo(@PathVariable String username, @PathVariable int id) {
		return todoRepository.findById(id);
	}
	
	
	@DeleteMapping("/users/{username}/todos/{id}") 
	public void deleteTodo(@PathVariable String username, @PathVariable int id) {
		todoRepository.deleteById(id);
	}
	
	@PutMapping("/users/{username}/todos/{id}") 
	public Todo updateTodo(@PathVariable String username, @PathVariable int id, @RequestBody Todo todo) {
		todoRepository.save(todo);
		return todo;
		
	}
		
	@PostMapping("/users/{username}/todos") 
	public Todo createTodo(@PathVariable String username, @RequestBody Todo todo) {
		todo.setUsername(username);
		todo.setId(null);
		Todo createdTodo = todoRepository.save(todo);
		return createdTodo;
		
	}

}
