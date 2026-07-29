package com.projeto.guild.repositories;

import com.projeto.guild.entities.Quest;
import com.projeto.guild.entities.QuestLoot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestLootRepository extends JpaRepository<QuestLoot, Long> {}
