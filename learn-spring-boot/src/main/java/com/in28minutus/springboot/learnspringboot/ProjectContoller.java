package com.in28minutus.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectContoller {
	
	@RequestMapping("/projects")
	public List<Project> index() {
		return Arrays.asList(
				new Project(1, "Chemical X", "Chemical to create power puff girls"),
				new Project(2, "Chemical Y", "Chemical to create MOJOJO"),
				new Project(2, "Chemical Z", "Chemical to create MOJOJO")
				);
	}
}
