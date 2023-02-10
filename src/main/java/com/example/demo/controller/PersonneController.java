package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.services.PersonneService;
import com.example.demo.model.entities.Personne;

import jakarta.validation.Valid;

@RestController
public class PersonneController {
@Autowired
PersonneService ps;
@PostMapping("Personne")
public Personne addPersonne(@RequestBody @Valid Personne p)
{
return ps.createPersonne(p);	
}
@GetMapping("Personne/{id}")
public Personne getOnePerson(@PathVariable long id)
{
return ps.GetPersonneById(id).get();	
}
@GetMapping("Personne")
public List<Personne> getPersons()
{
return ps.GetAllPersonne();	
}
@DeleteMapping("Personne/{id}")
public void deletePersonne(@PathVariable long id)
{
 ps.deletePersonne(id);	
}

}
