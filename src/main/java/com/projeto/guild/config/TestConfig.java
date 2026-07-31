package com.projeto.guild.config;

import com.projeto.guild.entities.Adventurer;
import com.projeto.guild.entities.Loot;
import com.projeto.guild.entities.QuestType;
import com.projeto.guild.repositories.*;
import com.projeto.guild.resources.*;
import com.projeto.guild.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private QuestLootRepository questLootRepository;

    @Autowired
    private QuestRepository questRepository;

    @Autowired
    private AdventurerRepository adventurerRepository;

    @Autowired
    private LootRepository lootRepository;

    @Autowired
    private QuestTypeRepository questTypeRepository;

    @Override
    public void run(String... args) throws Exception {

        QuestType cat1 = new QuestType(null, "Caça a Monstro");
        QuestType cat2 = new QuestType(null, "Escolta");
        QuestType cat3 = new QuestType(null, "Resgate de Artefato");

        Loot p1 = new Loot(null, "Espada Longa", "Lâmina de aço temperado", 150.0, "");
        Loot p2 = new Loot(null, "Poção de Cura", "Restaura 50 HP", 25.0, "");
        Loot p3 = new Loot(null, "Escudo Real", "Defesa aprimorada contra magia", 300.0, "");

        questTypeRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        lootRepository.saveAll(Arrays.asList(p1, p2, p3));

    }
}
