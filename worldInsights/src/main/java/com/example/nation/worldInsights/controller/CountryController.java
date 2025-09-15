package com.example.nation.worldInsights.controller;

import com.example.nation.worldInsights.model.Country;
import com.example.nation.worldInsights.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
  private final CountryService countryService;
  public CountryController(CountryService s){ this.countryService = s; }

  @GetMapping
  public List<Country> listAll(){ return countryService.getAllCountriesBasic(); }

  @GetMapping("/{id}/languages")
  public List<Language> getLanguages(@PathVariable Integer id){ return countryService.getLanguagesForCountry(id); }
}
