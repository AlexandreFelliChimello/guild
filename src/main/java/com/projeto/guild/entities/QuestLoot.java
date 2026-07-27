package com.projeto.guild.entities;

import java.util.Objects;

public class QuestLoot {

    private QuestLootPK id;
    private Integer quantity;
    private Double goldValue;

    public QuestLoot() {}

    public QuestLoot(QuestLootPK id, Integer quantity, Double goldValue) {
        this.id = id;
        this.quantity = quantity;
        this.goldValue = goldValue;
    }

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
