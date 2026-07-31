package com.projeto.guild.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_rewardPayout")
public class RewardPayout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant paidAt;
    
    @OneToOne(mappedBy = "rewardPayout")
    private Quest quest;

    public RewardPayout() {
    }

    public RewardPayout(Instant paidAt, Long id, Quest quest) {
        this.paidAt = paidAt;
        this.id = id;
        this.quest = quest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(Instant paidAt) {
        this.paidAt = paidAt;
    }

    public Quest getQuest() {return quest;}

    public void setQuest(Quest quest) {this.quest = quest;}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RewardPayout that = (RewardPayout) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
