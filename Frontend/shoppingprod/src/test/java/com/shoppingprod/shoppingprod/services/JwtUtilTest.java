package com.shoppingprod.shoppingprod.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

class JwtUtilTest {

	private static String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcnZpbnRoQGdtYWlsLmNvbSIsImV4cCI6MTY3Mjc0OTAwMywiaWF0IjoxNjcyNzQwMDAzfQ.k3bOoD4qOKpwoS3NPZAwZ5msHocjlvS7NbD0WCZUbCo";

	@InjectMocks
	JwtUtil jwtUtil;

	@SuppressWarnings("deprecation")
	@Test
	public void validateTokenTest() {
		MockitoAnnotations.initMocks(this);
//        token = new Token("admin", "admin", new ArrayList<>());
//        String generateToken = jwtUtil.generateToken(token);

		Boolean validateToken = jwtUtil.validateToken(null);
		assertEquals(false, validateToken);
	}

    @Test
   public void validateTokenTestSuccess() {
	   MockitoAnnotations.initMocks(this);
	   Boolean validateToken = jwtUtil.validateToken(token);
	   assertEquals(true, validateToken);	   
   }


	@Test
    public void extractUsernameTestSuccess() {
    	MockitoAnnotations.initMocks(this);
    	assertEquals("arvinth@gmail.com", jwtUtil.extractUsername(token));
    }

	@Test
    public void extractUsernameTestFail() {
    	MockitoAnnotations.initMocks(this);
    	assertEquals("arvinth@gmail.com", jwtUtil.extractUsername(token));
    	}

}
