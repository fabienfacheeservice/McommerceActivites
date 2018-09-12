package com.mexpedition.web.controller;

import com.mexpedition.dao.ExpeditionsDao;
import com.mexpedition.model.Expedition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ExpeditionController {

    @Autowired
    ExpeditionsDao expeditionsDao;

    @PostMapping("/expeditions")
    ResponseEntity<Expedition> createExpedition(@RequestBody Expedition expedition){
        Expedition expeditionSaved =  expeditionsDao.save(expedition);
        return ResponseEntity.ok(expeditionSaved);
    }

    @GetMapping("/expditions/{id}")
    ResponseEntity<Expedition> getOneExpedition(@PathVariable Integer id){
        Optional<Expedition> expedition = expeditionsDao.findById(id);
        return ResponseEntity.ok(expedition.get());
    }

    @PatchMapping("/expeditions")
    ResponseEntity<Expedition> updateExpedition(@RequestBody Expedition expedition){
        Expedition expeditionSaved =  expeditionsDao.save(expedition);
        return ResponseEntity.ok(expeditionSaved);
    }

}
