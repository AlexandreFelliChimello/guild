package com.projeto.guild.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projeto.guild.entities.PK.QuestLootPK;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_quest_Loot")
public class QuestLoot implements Serializable {

    @EmbeddedId
    private QuestLootPK id;

    private Integer quantity;
    private Double goldValue;

    public QuestLoot() {}

    public QuestLoot(Loot loot, Quest quest, Integer quantity, Double goldValue) {
        id.setLoot(loot);
        id.setQuest(quest);
        this.quantity = quantity;
        this.goldValue = goldValue;
    }
    @JsonIgnore
    public Loot getLoot() {return id.getLoot();}

    public void setLoot(Loot loot) {id.setLoot(loot);}

    public Quest getQuest() {return id.getQuest();}

    public void setQuest(Quest quest) {id.setQuest(quest);}

    public Double getGoldValue() {
        return goldValue;
    }

    public void setGoldValue(Double goldValue) {
        this.goldValue = goldValue;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QuestLoot questLoot = (QuestLoot) o;
        return Objects.equals(id, questLoot.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
    public Double subTotal(){
        return quantity*goldValue;
    }
}
