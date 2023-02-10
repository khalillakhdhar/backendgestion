package com.example.demo.controller.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.entities.Personne;



public interface PersonneInterface {
public Personne createPersonne(Personne p);
public Optional<Personne> GetPersonneById(long id);
public List<Personne> GetAllPersonne();
public void deletePersonne(long id);


}
