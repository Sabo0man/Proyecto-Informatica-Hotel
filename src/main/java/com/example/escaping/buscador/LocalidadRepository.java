package com.example.escaping.buscador;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.escaping.data.model.Hotel;
import com.example.escaping.data.model.Localidades;
@Repository
public interface LocalidadRepository extends JpaRepository<Hotel, Integer> {
    //@Query("FROM Hotel h WHERE h.id_localidades = ?1")
	
	@Query("FROM Hotel h WHERE h.localidadId = ?1")
	List<Hotel> findAlojamientosByLocalidad(Integer localidadId);
}

