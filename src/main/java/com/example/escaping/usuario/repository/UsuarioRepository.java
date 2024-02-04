package com.example.escaping.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.escaping.usuario.model.UserRequest;

@Repository
public interface UsuarioRepository extends JpaRepository<UserRequest, String> {
	

}
