package com.projeto.guild.services;

import com.projeto.guild.entities.Adventurer;
import com.projeto.guild.repositories.AdventurerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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

    public Adventurer insert(Adventurer obj) {
        return repository.save(obj);
    }

    public Adventurer Delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e){
            throw new EmptyResultDataAccessException;
        } catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }
    public Adventurer update(Adventurer obj, Long id) {
        try{
            Adventurer adv = repository.getReferenceById(id);
            updateData(adv, obj);
            repository.save(adv);
        }catch (EntityNotFoundException e){
            throw new EntityNotFoundException(e.getMessage());
        }
    }
    private void updateData(Adventurer entity, Adventurer obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setRoleClass(obj.getRoleClass());
    }

    
}
