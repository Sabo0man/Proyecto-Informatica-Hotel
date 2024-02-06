package com.example.escaping.usuario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.escaping.usuario.model.UserRequest;
import com.example.escaping.usuario.repository.UsuarioRepository;
import com.example.escaping.usuario.service.UsuarioService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<String> addUser(UserRequest userData) {
        List<String> errores = new ArrayList<>();

        // Verificar si el correo electrónico ya existe
        usuarioRepository.findByEmail(userData.getEmail()).ifPresent(u -> errores.add("El usuario con este correo electrónico ya existe."));

        // Si hay errores, retornar la lista de errores
        if (!errores.isEmpty()) {
            return errores;
        }

        // Codificar la contraseña antes de guardar el usuario
        userData.setPassword(passwordEncoder.encode(userData.getPassword()));

        // Guardar el usuario en la base de datos si no hay errores
        usuarioRepository.save(userData);
        return new ArrayList<>(); // Lista vacía indica que no hubo errores
    }
}
