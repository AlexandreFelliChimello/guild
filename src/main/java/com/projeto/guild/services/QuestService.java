package com.projeto.guild.services;

import com.projeto.guild.entities.Quest;
import com.projeto.guild.repositories.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestService {

    @Autowired
    private QuestRepository repository;

    public List<Quest> findAll() {return repository.findAll();}

    public Quest findById(Long id) {
        Optional<Quest> obj = repository.findById(id);
        return obj.get();
    }
    
}
