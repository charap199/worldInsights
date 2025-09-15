package com.example.nation.worldInsights.mapper;

import com.example.nation.worldInsights.model.Region;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface RegionMapper {
    List<Region> findAll();
}
