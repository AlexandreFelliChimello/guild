package com.projeto.guild.entities.PK;

import com.projeto.guild.entities.Loot;
import com.projeto.guild.entities.Quest;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class QuestLootPK {

    @ManyToOne
    @JoinColumn(name = "quest_id")
    private Quest quest;
    @ManyToOne
    @JoinColumn(name = "loot_id")
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
