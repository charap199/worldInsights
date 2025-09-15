package com.example.nation.worldInsights.service;

import com.example.nation.worldInsights.mapper.CountryStatMapper;
import com.example.nation.worldInsights.model.CountryStat;
import org.springframework.stereotype.CountryStatService;
import java.util.List;

@Service
public class CountryStatService {
  private final CountryStatMapper statMapper;
  public CountryStatService(CountryStatMapper m){ this.statMapper = m; }

  public List<Map<String,Object>> maxGdpPerPopulationPerCountry(){
    return statMapper.findMaxGdpPerPopulationPerCountry();
  }

  public List<Map<String,Object>> filtered(Integer regionId, Integer yearFrom, Integer yearTo, Integer page, Integer size){
    int limit = size == null ? 50 : size;
    int offset = page == null ? 0 : page * limit;
    return statMapper.findFilteredByRegionAndYear(regionId, yearFrom, yearTo, offset, limit);
  }
}
