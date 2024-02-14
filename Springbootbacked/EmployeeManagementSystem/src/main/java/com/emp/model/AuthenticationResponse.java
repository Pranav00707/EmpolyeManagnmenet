package com.emp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthenticationResponse {
	    // Constructor
    public AuthenticationResponse(String token, String role) {
        this.token = token;
        this.role = role;
    }


	private String token;
	private String role;
}
