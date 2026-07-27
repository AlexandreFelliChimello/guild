package com.projeto.guild.entities;

import java.time.Instant;
import java.util.Objects;

public class RewardPayout {

    private Long id;
    private Instant paidAt;

    public RewardPayout() {
    }

    public RewardPayout(Instant paidAt, Long id) {
        this.paidAt = paidAt;
        this.id = id;
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
