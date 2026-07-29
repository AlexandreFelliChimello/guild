package com.projeto.guild.repositories;

import com.projeto.guild.entities.Quest;
import com.projeto.guild.entities.QuestType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestTypeRepository extends JpaRepository<QuestType, Long> {}
