package br.casasbahia.index.demo.service;

import br.casasbahia.index.demo.model.Animal;
import br.casasbahia.index.demo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List; // Certifique-se de importar a classe List
import java.util.logging.Logger;

@Service
public class AnimalService {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    AnimalRepository animalRepository;

    public List<Animal> findAll() {
        log.info("Pesquisando todos os animais");
        return animalRepository.findAll();
    }
}
