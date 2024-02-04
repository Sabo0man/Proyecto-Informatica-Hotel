package com.example.escaping.usuario.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.example.escaping.usuario.model.UserRequest;
import com.example.escaping.usuario.repository.UsuarioRepository;
import com.example.escaping.usuario.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioRepository usuarioRepository;

	@Override
	public List<String> addUser(UserRequest userData) {

		// Agregar validaciones necesarias como dni etc
		List<String> errores = new ArrayList<>();

		if (validacionDNI(userData.getDni())) {
			errores.add("DNI no valido.");
		}

		if (validacionEmail(userData.getEmail())) {
			errores.add("Email no valido.");
		}

		if (validacionTelefono(userData.getTelefono())) {
			errores.add("Telefono no valido.");
		}

		if (validacionPassword(userData.getPassword())) {
			errores.add(
					"Contraseña no valida, debe contener 8 caracteres minimo, un caracter numerico y un caracter especial.");
		}

		if (userData.getNombre() != null || userData.getNombre().isEmpty()) {
			errores.add("Nombre no valido.");
		}
		
		if (userData.getApellidos() != null || userData.getApellidos().isEmpty()) {
			errores.add("Apellidos no valido.");
		}
		
		if (userData.getDireccion() != null || userData.getDireccion().isEmpty()) {
			errores.add("Direccion no valido.");
		}
		
		if (errores.size() != 0) {
			return errores;
		}
		
		

		// si validaciones empty / size = 0 / null
		return errores;

	}

	private boolean validacionPassword(String password) {

		final Pattern CONTRASENA_PATTERN = Pattern.compile("^(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$");

		if (password == null) {
			return false;
		}
		Matcher matcher = CONTRASENA_PATTERN.matcher(password);
		return matcher.matches();
	}

	private boolean validacionTelefono(String telefono) {

		final Pattern TELEFONO_PATTERN = Pattern.compile(
				"^\\+?([0-9]{1,3})?[-.\\s]?([(][0-9]{1,4}[)])?[-.\\s]?([0-9]{1,4})?[-.\\s]?([0-9]{1,4})?[-.\\s]?([0-9]{1,9})$");

		if (telefono == null) {
			return false;
		}
		Matcher matcher = TELEFONO_PATTERN.matcher(telefono);
		return matcher.matches();
	}

	private boolean validacionEmail(String email) {

		final Pattern EMAIL_PATTERN = Pattern
				.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");

		if (email == null) {
			return false;
		}
		Matcher matcher = EMAIL_PATTERN.matcher(email);
		return matcher.matches();

	}

	private boolean validacionDNI(String dni) {

		final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

		boolean esValido = false;
		if (dni != null && dni.length() == 9) {
			String parteNumericaDNI = dni.substring(0, 8);
			char letraDNI = dni.charAt(8);
			try {
				int dniNumeros = Integer.parseInt(parteNumericaDNI);
				int indiceLetra = dniNumeros % 23;
				if (LETRAS_DNI.charAt(indiceLetra) == letraDNI) {
					esValido = true;
				}
			} catch (NumberFormatException e) {
				esValido = false;
			}
		}
		return esValido;

	}

}
