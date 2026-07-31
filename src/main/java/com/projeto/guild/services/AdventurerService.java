package com.projeto.guild.services;

import com.projeto.guild.entities.Adventurer;
import com.projeto.guild.repositories.AdventurerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdventurerService {

    @Autowired
    private AdventurerRepository repository;

    public List<Adventurer> findAll() {return repository.findAll();}

    public Adventurer findById(Long id) {
        Optional<Adventurer> obj = repository.findById(id);
        return obj.get();
    }
    
}
