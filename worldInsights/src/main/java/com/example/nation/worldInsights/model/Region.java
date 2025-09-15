package com.example.nation.worldInsights.model;

public class Region {
    private Integer regionId;
    private String name;
    private Integer continentId;

    public Region() {
    }

    public Region(Integer regionId, String name, Integer continentId) {
        this.regionId = regionId;
        this.name = name;
        this.continentId = continentId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getContinentId() {
        return continentId;
    }

    public void setContinentId(Integer continentId) {
        this.continentId = continentId;
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionId=" + regionId +
                ", name='" + name + '\'' +
                ", continentId=" + continentId +
                '}';
    }
}
