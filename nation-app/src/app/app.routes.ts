import { Routes } from '@angular/router';
import { Home } from './pages/home/home';
import { Countries } from './pages/countries/countries';
import { MaxGdpTable } from './pages/max-gdp-table/max-gdp-table';
import { FilterTable } from './pages/filter-table/filter-table';
import { CountryLanguages } from './pages/country-languages/country-languages';

export const routes: Routes = [
  { path: '', component: Home },
  { path: 'countries', component: Countries },
  { path: 'countries/:id/languages', component: CountryLanguages },
  { path: 'max-gdp', component: MaxGdpTable },
  { path: 'filter-table', component: FilterTable }
];
