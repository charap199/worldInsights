package com.example.nation.worldInsights.mapper;

import com.example.nation.worldInsights.model.Language;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface LanguageMapper {
    List<Language> findByCountryId(Integer countryId);
}
