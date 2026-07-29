package com.projeto.guild.entities;

import com.projeto.guild.entities.PK.QuestLootPK;

import java.util.Objects;

public class QuestLoot {

    private QuestLootPK id;
    private Integer quantity;
    private Double goldValue;
    private Loot loot;
    private Quest quest;

    public QuestLoot() {}

    public QuestLoot(Loot loot, Quest quest, Integer quantity, Double goldValue) {
        id.setLoot(loot);
        id.setQuest(quest);
        this.quantity = quantity;
        this.goldValue = goldValue;
    }

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
}
