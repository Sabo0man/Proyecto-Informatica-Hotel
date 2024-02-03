package com.example.escaping.buscador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlojamientoService {

	@Autowired
	private LocalidadRepository localidadRepository;
	@Autowired
	private ProvinciaRepository provinciaRepository;

	public List<AlojamientoDTO> buscarPorLocalidadOProvincia(BusquedaDTO busquedaDTO) {
		List<AlojamientoDTO> resultados = new ArrayList<>();

		if (busquedaDTO.getLocalidadId() != null) {
			// Buscar "hoteles" por localidad
			resultados.addAll(localidadRepository.findAlojamientosByLocalidadId(busquedaDTO.getLocalidadId()));
		} else if (busquedaDTO.getProvinciaId() != null) {
			// Buscar "hoteles" por provincia
			// resultados.addAll(provinciaRepository.findAlojamientosByProvinciaId(busquedaDTO.getProvinciaId()));
		}

		return resultados;
	}
}
