import { Component } from '@angular/core';
import { AuthService } from './servicios/auth.service';
import { LoginData } from './models/login-data.model';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  tittle = 'PI';
  adultos: number = 1; // Valor inicial para adultos
  ninos: number = 0;  // Valor inicial para niños
  habitaciones: number = 1; // Valor inicial para habitaciones

  constructor(private authService: AuthService) { }

  onLogin(form: NgForm) {
    if (form.invalid) {
      return;
    }
    const loginData: LoginData = {
      username: form.value.username,
      password: form.value.password
    };
    this.authService.login(loginData).subscribe(
      response => {
        console.log('Login successful', response);
      },
      error => {
        console.error('Login failed', error);
      }
    );
  }

  // Métodos para incrementar
  incrementarAdultos() {
    this.adultos++;
  }

  incrementarNinos() {
    this.ninos++;
  }

  incrementarHabitaciones() {
    this.habitaciones++;
  }

  // Métodos para decrementar
  decrementarAdultos() {
    if (this.adultos > 1) { // mínimo 1
      this.adultos--;
    }
  }

  decrementarNinos() {
    if (this.ninos > 0) { // mínimo 0
      this.ninos--;
    }
  }

  decrementarHabitaciones() {
    if (this.habitaciones > 1) { // mínimo 1
      this.habitaciones--;
    }
  }
}
