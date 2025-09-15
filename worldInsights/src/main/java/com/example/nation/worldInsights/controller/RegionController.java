package com.example.nation.worldInsights.controller;

import com.example.nation.worldInsights.model.Region;
import com.example.nation.worldInsights.service.RegionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegionController {
    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping("/api/regions")
    public List<Region> listRegions() {
        return regionService.getAllRegions();
    }
}
