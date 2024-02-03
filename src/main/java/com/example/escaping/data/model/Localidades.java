package com.example.escaping.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "localidades")
public class Localidades {

    @Id
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localidades")
    private Integer id_localidades;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "id_provincia")
    private Integer id_provincia;

	public Integer getIdLocalidades() {
		return id_localidades;
	}

	public void setIdLocalidades(Integer idLocalidades) {
		this.id_localidades = idLocalidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdProvincia() {
		return id_provincia;
	}

	public void setIdProvincia(Integer idProvincia) {
		this.id_provincia = idProvincia;
	}

    // Getters and setters (you can generate them automatically)

    // toString, hashCode, and equals methods can be included here if needed
}
