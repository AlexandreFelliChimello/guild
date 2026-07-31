package com.projeto.guild.resources;

import com.projeto.guild.entities.Adventurer;
import com.projeto.guild.services.AdventurerService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/adventurers")
public class AdventurerResource {

    @Autowired
    private AdventurerService service;

    @GetMapping
    public ResponseEntity<List<Adventurer>> findAll(){
        List<Adventurer> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping (value = "/{id}")
    public ResponseEntity<Adventurer> findById(@PathVariable Long id){
        Adventurer obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
