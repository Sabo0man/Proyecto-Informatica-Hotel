package com.example.escaping.usuario.controller;

import java.util.List;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.escaping.usuario.model.UserRequest;
import com.example.escaping.usuario.service.UsuarioService;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    @PostMapping("/register")
    public ResponseEntity<?> registroUsuario(@Valid @RequestBody UserRequest userData, BindingResult result) {
        if (result.hasErrors()) {
            List<String> errors = result.getAllErrors().stream()
                                        .map(err -> err.getDefaultMessage())
                                        .toList();
            return ResponseEntity.badRequest().body(errors);
        }
        
        UserRequest response = usuarioService.addUser(userData);
        if(response==null) {
            return ResponseEntity.ok("Usuario registrado con éxito");
        } else {
            return ResponseEntity.badRequest().body(response);
        }
    }
}
