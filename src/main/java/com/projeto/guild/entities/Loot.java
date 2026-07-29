package com.projeto.guild.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Loot {

    private Long id;
    private String name;
    private String description;
    private Double goldValue;
    private String imUrl;

    private List<QuestType> questTypes = new ArrayList<>();

    public Loot() {}

    public Loot(Long id, String name, String description, Double goldValue, String imUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.goldValue = goldValue;
        this.imUrl = imUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getGoldValue() {
        return goldValue;
    }

    public void setGoldValue(Double goldValue) {
        this.goldValue = goldValue;
    }

    public String getImUrl() {
        return imUrl;
    }

    public void setImUrl(String imUrl) {
        this.imUrl = imUrl;
    }

    public List<QuestType> getQuestTypes() {
        return questTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Loot loot = (Loot) o;
        return Objects.equals(getId(), loot.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
