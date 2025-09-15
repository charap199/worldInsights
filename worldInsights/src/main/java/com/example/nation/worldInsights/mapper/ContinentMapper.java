package com.example.nation.worldInsights.mapper;

import com.example.nation.worldInsights.model.Continent;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ContinentMapper {
    List<Continent> findAll();
}
