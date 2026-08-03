package com.projeto.guild.resources;

import com.projeto.guild.entities.Adventurer;
import com.projeto.guild.services.AdventurerService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    @PostMapping
    public ResponseEntity<Adventurer> insert(@RequestBody Adventurer obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Adventurer> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Adventurer> update(@RequestBody Adventurer obj, @PathVariable Long id){
        obj = service.update(obj, id);
        return ResponseEntity.ok().body(obj);
    }
}
