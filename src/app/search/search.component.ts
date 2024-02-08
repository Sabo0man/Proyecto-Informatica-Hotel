import { Component } from '@angular/core';
import { SearchService } from './search.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {
  searchTerm: string = '';

  constructor(private searchService: SearchService) {}

  search(): void {
    if (this.searchTerm) {
      this.searchService.search(this.searchTerm).subscribe(
        (results) => {
          // Haz algo con los resultados, como guardarlos en una variable
          console.log(results);
        },
        (error) => {
          // Maneja el error
          console.error(error);
        }
      );
    }
  }
}






