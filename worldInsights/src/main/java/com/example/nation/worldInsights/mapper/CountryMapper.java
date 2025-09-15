package com.example.nation.worldInsights.mapper;

import com.example.nation.worldInsights.model.Country;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CountryMapper {
    List<Country> findAllBasic();   // for Task 1a
    Country findById(Integer id);
}
