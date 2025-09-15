package com.example.nation.worldInsights.model;

public class Continent {
    private Integer continentId;
    private String name;

    public Continent() {
    }

    public Continent(Integer continentId, String name) {
        this.continentId = continentId;
        this.name = name;
    }

    public Integer getContinentId() {
        return continentId;
    }

    public void setContinentId(Integer continentId) {
        this.continentId = continentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentId=" + continentId +
                ", name='" + name + '\'' +
                '}';
    }
}
