package com.example.nation.worldInsights.service;

import com.example.nation.worldInsights.mapper.RegionMapper;
import com.example.nation.worldInsights.model.Region;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    private final RegionMapper regionMapper;

    public RegionService(RegionMapper regionMapper) {
        this.regionMapper = regionMapper;
    }

    public List<Region> getAllRegions() {
        return regionMapper.findAll();
    }
}
