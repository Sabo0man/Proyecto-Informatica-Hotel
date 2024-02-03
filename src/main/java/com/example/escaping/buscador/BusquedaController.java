package com.example.escaping.buscador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.escaping.buscador.BusquedaDTO;;

@RestController
@RequestMapping("/api")
public class BusquedaController {

    @Autowired
    private AlojamientoService alojamientoService;

    @PostMapping("/buscar")
    public ResponseEntity<?> buscar(@RequestBody BusquedaDTO busquedaDTO) {
        List<AlojamientoDTO> resultados = alojamientoService.buscarPorLocalidadOProvincia(busquedaDTO);
        return ResponseEntity.ok(resultados);
    }
}
