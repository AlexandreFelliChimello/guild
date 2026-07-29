package com.projeto.guild.entities;

import com.projeto.guild.entities.enums.QuestStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Quest {
    private Long id;
    private String title;
    private Instant createdAt;
    private Integer questStatus;

    private Adventurer client;

    private RewardPayout rewardPayout;

    private List<QuestLoot> questLoots = new ArrayList<>();

    public Quest() {}

    public Quest(Long id, String title, Instant createdAt, QuestStatus questStatus, Adventurer client) {
        this.id = id;
        this.title = title;
        this.createdAt = createdAt;
        setQuestStatus(questStatus);
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public QuestStatus getQuestStatus() {return QuestStatus.valueOf(questStatus);}

    public void setQuestStatus(QuestStatus questStatus) {
        if (questStatus != null) {
            this.questStatus = questStatus.getCode();
        }
    }

    public Adventurer getClient() {return client;}

    public void setClient(Adventurer client) {this.client = client;}

    public RewardPayout getRewardPayout() {return rewardPayout;}

    public void setRewardPayout(RewardPayout rewardPayout) {this.rewardPayout = rewardPayout;}

    public List<QuestLoot> getQuestLoots() {return questLoots;}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quest quest = (Quest) o;
        return getId() == quest.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
