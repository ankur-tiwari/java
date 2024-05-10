package com.in28minutes.rest.webservices.restfulwebservices.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.net.URI;
import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserResource {
	private UserDaoService userDaoSerivce;
	
	
	public UserResource(UserDaoService userDaoSerivce) {
		super();
		this.userDaoSerivce = userDaoSerivce;
	}

	@GetMapping("/users")
	public List<User> retirirveAllUsers() {
		return userDaoSerivce.findAll();
	}
	
	@GetMapping("/users/{id}")
	public EntityModel<User> retirirveUser(@PathVariable int id) {
		User user = userDaoSerivce.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("Id: "+ id);
		}
		
		EntityModel<User> entityModel = EntityModel.of(user);
		
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retirirveAllUsers());
		entityModel.add(link.withRel("all-users"));
		return entityModel;
	}
	
		@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userDaoSerivce.deleteById(id);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User savedUser = userDaoSerivce.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
//	@PutMapping("/users")
//	public User updateUser(@RequestBody User user) {
//		return userDaoSerivce.update(user);
//	}
}
