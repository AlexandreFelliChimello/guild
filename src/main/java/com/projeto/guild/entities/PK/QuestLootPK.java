package com.projeto.guild.entities.PK;

import com.projeto.guild.entities.Loot;
import com.projeto.guild.entities.Quest;

import java.util.Objects;

public class QuestLootPK {

    private Quest quest;
    private Loot loot;

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public Loot getLoot() {
        return loot;
    }

    public void setLoot(Loot loot) {
        this.loot = loot;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QuestLootPK that = (QuestLootPK) o;
        return Objects.equals(getQuest(), that.getQuest()) && Objects.equals(getLoot(), that.getLoot());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuest(), getLoot());
    }
}
