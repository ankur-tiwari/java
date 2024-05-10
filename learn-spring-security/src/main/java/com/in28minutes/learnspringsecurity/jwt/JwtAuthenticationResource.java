package com.in28minutes.learnspringsecurity.jwt;

import java.time.Instant;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimbusds.jwt.JWTClaimsSet;

//@RestController
public class JwtAuthenticationResource {
	
	private JwtEncoder jwtEncoder;
	
	public JwtAuthenticationResource(JwtEncoder jwtEncoder) {
		this.jwtEncoder = jwtEncoder;
	}

	@PostMapping("/authenticate")
	public jwtResponse authenticate(Authentication authentication) {
		return new jwtResponse(createToken(authentication));
	}

	private String createToken(Authentication authentication) {
		var claim = JwtClaimsSet
		.builder()
		.issuer("self")
		.issuedAt(Instant.now())
		.expiresAt(Instant.now().plusSeconds(60*60))
		.claim("scope", createScope(authentication))
		.build();
		return jwtEncoder.encode(JwtEncoderParameters.from(claim)).getTokenValue();
	}

	private String createScope(Authentication authentication) {
		return authentication
				.getAuthorities()
				.stream()
				.map(authority -> authority.getAuthority())
				.collect(Collectors.joining(" "));

	} 
}


record jwtResponse(String token) {}