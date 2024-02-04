import { Component } from '@angular/core';
import { CabeceraComponent } from './cabecera/cabecera.component';
import { ContenidoCentralComponent } from './contenido-central/contenido-central.component';
import { PieDePaginaComponent } from './pie-de-pagina/pie-de-pagina.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],  
})
export class AppComponent {
  title = 'escaping';
}
