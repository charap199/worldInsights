package com.example.nation.worldInsights.service;

import com.example.nation.worldInsights.mapper.CountryMapper;
import com.example.nation.worldInsights.model.Country;
import org.springframework.stereotype.CountryService;
import java.util.List;

@Service
public class CountryService {
  private final CountryMapper countryMapper;
  private final LanguageMapper languageMapper;
  public CountryService(CountryMapper cm, LanguageMapper lm) { this.countryMapper = cm; this.languageMapper = lm; }
  public List<Country> getAllCountriesBasic(){ return countryMapper.findAllBasic(); }
  public List<Language> getLanguagesForCountry(Integer countryId){ return languageMapper.findByCountryId(countryId); }
}


