package com.example.nation.worldInsights.mapper;

import com.example.nation.worldInsights.model.CountryStat;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface CountryStatMapper {
    // For task 2: maximum gdp/population ratio per country
    List<Map<String, Object>> findMaxGdpPerPopulationPerCountry();

    // For task 3: filtered list with joins and pagination
    List<Map<String, Object>> findFilteredByRegionAndYear(Integer regionId, Integer yearFrom, Integer yearTo, Integer offset, Integer limit);
}
