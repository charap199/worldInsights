package com.example.nation.worldInsights.controller;

import com.example.nation.worldInsights.model.Continent;
import com.example.nation.worldInsights.service.ContinentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContinentController {
    private final ContinentService continentService;

    public ContinentController(ContinentService continentService) {
        this.continentService = continentService;
    }

    @GetMapping("/api/continents")
    public List<Continent> listContinents() {
        return continentService.getAllContinents();
    }
}
