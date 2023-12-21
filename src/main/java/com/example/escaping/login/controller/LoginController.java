package com.example.escaping.login.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.escaping.login.model.LoginData;

@RestController
@RequestMapping("/user")
public class LoginController {

	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody LoginData loginData) {
		
		String respuesta = "";
		
		Map<String, Object> response = new HashMap<>();
		
		if (loginData != null) {
			respuesta = "Login exitoso";
		} else {
			return ResponseEntity.badRequest().body(null);
		}
		
		
		response.put("message", respuesta);

		return ResponseEntity.ok(response);
	}
}
