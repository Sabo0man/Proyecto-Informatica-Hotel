package com.example.escaping.usuario.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.escaping.usuario.model.UserRequest;
import com.example.escaping.usuario.service.UsuarioService;

@RestController
@RequestMapping("/user")
public class UsuarioController {
	
	private UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping("/register")
	public ResponseEntity<List<String>> registroUsuario(@RequestBody UserRequest userData) {
		
		List<String> response = usuarioService.addUser(userData);
		if(response.size() == 0) {
			return ResponseEntity.ok(null);
		}
		else {
			return ResponseEntity.badRequest().body(null);
		}
		
	}
	
	

}
