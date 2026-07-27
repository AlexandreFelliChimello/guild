package com.projeto.guild.entities;

import java.time.Instant;
import java.util.Objects;

public class Quest {
    private long id;
    private String title;
    private Instant createdAt;
    private Integer questStatus;

    public Quest() {}

    public Quest(long id, String title, Instant createdAt, Integer questStatus) {
        this.id = id;
        this.title = title;
        this.createdAt = createdAt;
        this.questStatus = questStatus;
    }

    public long getId() {
        return id;
    }

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

    public Integer getQuestStatus() {
        return questStatus;
    }

    public void setQuestStatus(Integer questStatus) {
        this.questStatus = questStatus;
    }
}
