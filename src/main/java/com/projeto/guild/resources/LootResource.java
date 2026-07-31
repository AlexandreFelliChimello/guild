package com.projeto.guild.resources;

import com.projeto.guild.entities.Loot;
import com.projeto.guild.services.LootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Loots")
public class LootResource {

    @Autowired
    private LootService service;

    @GetMapping
    public ResponseEntity<List<Loot>> findAll(){
        List<Loot> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping (value = "/{id}")
    public ResponseEntity<Loot> findById(@PathVariable Long id){
        Loot obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
