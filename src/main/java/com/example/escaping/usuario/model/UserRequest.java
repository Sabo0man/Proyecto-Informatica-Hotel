package com.example.escaping.usuario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class UserRequest {
    @Id
    @NotBlank(message = "El DNI no puede estar vacío")
    @Pattern(regexp = "\\d{8}[A-HJ-NP-TV-Z]", message = "Formato de DNI no válido")
    private String dni;

    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @NotBlank(message = "Los apellidos no pueden estar vacíos")
    private String apellidos;

    @NotBlank(message = "La dirección no puede estar vacía")
    private String direccion;

    @NotBlank(message = "El teléfono no puede estar vacío")
    @Pattern(regexp = "^\\+?\\d{9,15}$", message = "Formato de teléfono no válido")
    private String telefono;

    @NotBlank(message = "El sexo no puede estar vacío")
    private String sexo;

    @Email(message = "Formato de email no válido")
    private String email;

    @NotBlank(message = "El usuario no puede estar vacío")
    private String usuario;

    @NotBlank(message = "La contraseña no puede estar vacía")
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;

    @NotBlank(message = "La localidad no puede estar vacía")
    private String localidad;

    @NotBlank(message = "La provincia no puede estar vacía")
    private String provincia;

    // Constructor por defecto necesario para JPA
    public UserRequest() {
    }

    // Constructor con todos los argumentos, omitiendo fecha_nacimiento
    public UserRequest(String dni, String nombre, String apellidos, String direccion, String telefono, String sexo,
                       String email, String usuario, String password, String localidad, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.email = email;
        this.usuario = usuario;
        this.password = password;
        this.localidad = localidad;
        this.provincia = provincia;
    }

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
    
    

    // Getters y setters, hashCode, equals, toString pueden ser generados por Lombok
}
