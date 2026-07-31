package com.projeto.guild.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
public class QuestType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "questTypes")
    private List<Loot> loots = new ArrayList<>();

    public QuestType() {
    }

    public QuestType(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public List<Loot> getLoots() {
        return loots;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QuestType questType = (QuestType) o;
        return Objects.equals(getId(), questType.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
