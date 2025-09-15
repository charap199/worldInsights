package com.example.nation.worldInsights.service;

import com.example.nation.worldInsights.mapper.ContinentMapper;
import com.example.nation.worldInsights.model.Continent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService {
    private final ContinentMapper continentMapper;

    public ContinentService(ContinentMapper continentMapper) {
        this.continentMapper = continentMapper;
    }

    public List<Continent> getAllContinents() {
        return continentMapper.findAll();
    }
}
