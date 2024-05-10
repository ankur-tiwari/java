package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	@GetMapping("v1/persons")
	public PersonV1 getVersionOne() {
		return new PersonV1("Ankur Tiwari");
	}
	
	@GetMapping("v2/persons")
	public PersonV2 getVersionTwo() {
		return new PersonV2("Ankur", "Tiwari");
	}
}
