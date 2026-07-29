package com.projeto.guild.repositories;

import com.projeto.guild.entities.Adventurer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdventurerRepository extends JpaRepository<Adventurer, Long> {}
