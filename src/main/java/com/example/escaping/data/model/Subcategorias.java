package com.example.escaping.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subcategorias")
public class Subcategorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subcat")
    private Integer idSubcat;

    @Column(name = "nombre", length = 36)
    private String nombre;
    
    @Column(name = "id_categoria", length = 36)
    private Integer idCategoria;

	public Integer getIdSubcat() {
		return idSubcat;
	}

	public void setIdSubcat(Integer idSubcat) {
		this.idSubcat = idSubcat;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	
    // Getters and setters (you can generate them automatically)

    // toString, hashCode, and equals methods can be included here if needed
}
