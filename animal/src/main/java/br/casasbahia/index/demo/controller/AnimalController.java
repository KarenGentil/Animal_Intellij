package br.casasbahia.index.demo.controller;


import br.casasbahia.index.demo.model.Animal;
import br.casasbahia.index.demo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @GetMapping
    public List<Animal> findAll(){
        return animalService.findAll();
    }
}
