package com.projeto.guild.repositories;

import com.projeto.guild.entities.Adventurer;
import com.projeto.guild.entities.Loot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LootRepository extends JpaRepository<Loot, Long> {}
