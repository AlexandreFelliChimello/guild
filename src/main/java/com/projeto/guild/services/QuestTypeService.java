package com.projeto.guild.services;

import com.projeto.guild.entities.QuestType;
import com.projeto.guild.repositories.QuestTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestTypeService {

    @Autowired
    private QuestTypeRepository repository;

    public List<QuestType> findAll() {return repository.findAll();}

    public QuestType findById(Long id) {
        Optional<QuestType> obj = repository.findById(id);
        return obj.get();
    }
    
}
