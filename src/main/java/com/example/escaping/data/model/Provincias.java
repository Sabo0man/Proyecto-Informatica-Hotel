package com.example.escaping.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "provincias")
public class Provincias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categorias")
    private Integer idCategorias;

    @Column(name = "nombre", length = 50)
    private String nombre;

	public Integer getIdCategorias() {
		return idCategorias;
	}

	public void setIdCategorias(Integer idCategorias) {
		this.idCategorias = idCategorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

  

    // Getters and setters (you can generate them automatically)

    // toString, hashCode, and equals methods can be included here if needed
}

