package com.projeto.guild.repositories;

import com.projeto.guild.entities.Loot;
import com.projeto.guild.entities.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestRepository extends JpaRepository<Quest, Long> {}
