package com.projeto.guild.resources;

import com.projeto.guild.entities.Quest;
import com.projeto.guild.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Quests")
public class QuestResource {

    @Autowired
    private QuestService service;

    @GetMapping
    public ResponseEntity<List<Quest>> findAll(){
        List<Quest> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping (value = "/{id}")
    public ResponseEntity<Quest> findById(@PathVariable Long id){
        Quest obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
