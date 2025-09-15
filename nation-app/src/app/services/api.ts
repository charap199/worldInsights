import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class Api {
    base = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  getCountries() { return this.http.get<any[]>(`${this.base}/countries`); }
  getCountryLanguages(countryId: number) { return this.http.get<any[]>(`${this.base}/countries/${countryId}/languages`); }
  getMaxGdpPerPop() { return this.http.get<any[]>(`${this.base}/stats/max-gdp-per-pop`); }
  filterStats(regionId?: number, yearFrom?: number, yearTo?: number, page = 0, size = 50) {
    let params = new HttpParams().set('page', page.toString()).set('size', size.toString());
    if (regionId != null) params = params.set('regionId', regionId.toString());
    if (yearFrom != null) params = params.set('yearFrom', yearFrom.toString());
    if (yearTo != null) params = params.set('yearTo', yearTo.toString());
    return this.http.get<any[]>(`${this.base}/stats/filter`, { params });
  }

  getRegions() { return this.http.get<any[]>(`${this.base}/regions`); }
}
