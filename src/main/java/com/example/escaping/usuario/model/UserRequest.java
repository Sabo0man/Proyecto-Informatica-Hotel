package com.example.escaping.usuario.model;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserRequest {
	@Id
	private String dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private String sexo;
	private String email;
	private LocalDate fecha_nacimiento;
	private String usuario;
	private String password;
	private String localidad;
	private String provincia;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public UserRequest(String dni, String nombre, String apellidos, String direccion, String telefono, String sexo,
			String email, LocalDate fecha_nacimiento, String usuario, String password, String localidad,
			String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.sexo = sexo;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
		this.usuario = usuario;
		this.password = password;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, direccion, dni, email, fecha_nacimiento, localidad, nombre, password, provincia,
				sexo, telefono, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRequest other = (UserRequest) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(dni, other.dni) && Objects.equals(email, other.email)
				&& Objects.equals(fecha_nacimiento, other.fecha_nacimiento)
				&& Objects.equals(localidad, other.localidad) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(password, other.password) && Objects.equals(provincia, other.provincia)
				&& Objects.equals(sexo, other.sexo) && Objects.equals(telefono, other.telefono)
				&& Objects.equals(usuario, other.usuario);
	}

}
