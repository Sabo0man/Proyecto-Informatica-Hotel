package com.example.escaping.buscador;
import java.sql.Date;

public class BusquedaDTO {
    private Integer id_localidades;
    private Long id_provincia;
	
    
    
    public BusquedaDTO(Integer id_localidades, Long id_provincia) {
		super();
		this.id_localidades = id_localidades;
		this.id_provincia = id_provincia;
	}
	public Integer getId_localidades() {
		return id_localidades;
	}
	public void setId_localidades(Integer id_localidades) {
		this.id_localidades = id_localidades;
	}
	public Long getId_provincia() {
		return id_provincia;
	}
	public void setId_provincia(Long id_provincia) {
		this.id_provincia = id_provincia;
	}
	
   
    // Constructor, Getters y Setters
}

