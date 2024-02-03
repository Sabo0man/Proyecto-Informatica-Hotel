package com.example.escaping.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "nombre", length = 34)
    private String nombre;

    @Column(name = "id_categoria_ref")
    private Integer idCategoriaRef;

    // Constructor por defecto
    public Categoria() {
    }

    // Constructor con parámetros
    public Categoria(Integer idCategoria, String nombre, Integer idCategoriaRef) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.idCategoriaRef = idCategoriaRef;
    }

    // Getters y setters
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoriaRef() {
        return idCategoriaRef;
    }

    public void setIdCategoriaRef(Integer idCategoriaRef) {
        this.idCategoriaRef = idCategoriaRef;
    }

    // toString, hashCode y equals métodos pueden ser incluidos aquí si son necesarios
}

