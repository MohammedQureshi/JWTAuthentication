package com.mqureshi.JWTAuthentication;

import com.mqureshi.JWTAuthentication.auth.AuthenticationResponse;
import com.mqureshi.JWTAuthentication.auth.AuthenticationService;
import com.mqureshi.JWTAuthentication.auth.RegisterRequest;
import com.mqureshi.JWTAuthentication.config.JwtService;
import com.mqureshi.JWTAuthentication.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class JwtAuthenticationApplicationTests {


	@Autowired
	AuthenticationService authenticationService;
	@Autowired
	UserRepository repository;
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	JwtService jwtService;
	@Autowired
	AuthenticationManager authenticationManager;
	@Test
	void whenAUserDetailsAreInputAndRegisterAuthenticationServiceIsCalledReturnJwtToken() {

	}

}
