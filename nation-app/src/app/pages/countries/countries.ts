import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Api } from '../../services/api'; // adjust path if needed


@Component({
  selector: 'app-countries',
  imports: [],
  templateUrl: './countries.html',
  styleUrl: './countries.scss'
})
export class CountriesComponent implements OnInit {
  countries: any[] = [];
  constructor(private api: Api, private router: Router) {}
  ngOnInit(){ this.api.getCountries().subscribe(c => this.countries = c); }
  openLanguages(country){ this.router.navigate(['/countries', country.countryId, 'languages']); }
}

