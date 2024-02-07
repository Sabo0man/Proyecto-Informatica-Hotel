package com.example.escaping.usuario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.example.escaping.usuario.model.UserRequest;
import com.example.escaping.usuario.repository.UsuarioRepository;
import com.example.escaping.usuario.service.UsuarioService;
import com.example.escaping.usuario.model.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserRequest addUser(UserRequest userData) {
        List<String> errores = new ArrayList<>();

        // Verificar si el correo electrónico ya existe
        usuarioRepository.findByEmail(userData.getEmail()).ifPresent(u -> errores.add("El usuario con este correo electrónico ya existe."));

        // Si hay errores, retornar la lista de errores
        if (!errores.isEmpty()) {
            return null;
        }

        // Guardar el usuario en la base de datos si no hay errores
        return usuarioRepository.save(userData);
         // Lista vacía indica que no hubo errores
    }
}

