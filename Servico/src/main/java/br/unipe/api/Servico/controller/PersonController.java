package br.unipe.api.Servico.controller;

import br.unipe.api.Servico.model.Person;
import br.unipe.api.Servico.reporsitory.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1.0")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(value = "/persons", produces = "application/json")
    public List<Person> getAllPersons(){

        return personRepository.findAll();

    }

    @PostMapping("/persons")
    public Person createPerson(@Valid @RequestBody Person person) {
        return personRepository.save(person);
    }

}
