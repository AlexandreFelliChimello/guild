package com.projeto.guild.services;

import com.projeto.guild.entities.Loot;
import com.projeto.guild.repositories.LootRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LootService {

    @Autowired
    private LootRepository repository;

    public List<Loot> findAll() {return repository.findAll();}

    public Loot findById(Long id) {
        Optional<Loot> obj = repository.findById(id);
        return obj.get();
    }

}
