import { Component, OnInit } from '@angular/core';
import { AuthService } from '../app/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  // username: string;
  // password: string;

  constructor(private authService: AuthService) {
    console.log("constructor login");
   }

  onLogin(username: string, password: string, event: Event) {
    event.preventDefault();
    console.log("entro login");
    console.log('Usuario:', username);
    console.log('Contraseña:', password);
    this.authService.login(username, password).subscribe(
      data => {
        console.log('Login exitoso', data);
        // Aquí podrías redirigir al usuario o guardar la información de la sesión
      },
      error => {
        console.log('Error en el login', error);
      }
    );
  }

}
