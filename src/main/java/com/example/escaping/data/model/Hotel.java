package com.example.escaping.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_hotel", nullable = false)
	private Integer id_hotel;

	@Column(name = "nombre", nullable = false, length = 255)
	private String nombre;

	@Column(name = "direccion", nullable = false, length = 255)
	private String direccion;

	@Column(name = "telefono", length = 20)
	private String telefono;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_localidades")
	@Column(name = "id_localidades", length = 20)
	private Localidades id_localidades;

	@Column(name = "id_categoria")
	private Integer id_categoria;

	// Constructor sin argumentos
	public Hotel() {
	}

	public Integer getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(Integer id_hotel) {
		this.id_hotel = id_hotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Localidades getId_localidades() {
		return id_localidades;
	}

	public void setId_localidades(Localidades id_localidades) {
		this.id_localidades = id_localidades;
	}

	public Integer getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}

	public Hotel(Integer id_hotel, String nombre, String direccion, String telefono, Localidades id_localidades,
			Integer id_categoria) {
		super();
		this.id_hotel = id_hotel;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.id_localidades = id_localidades;
		this.id_categoria = id_categoria;
	}

	// Getters y setters

	// toString, hashCode, equals methods can be added here if needed
}
