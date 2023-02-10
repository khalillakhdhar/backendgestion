package com.example.demo.controller.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.entities.Personne;
import com.example.demo.model.repository.PersonneRepository;

@Service
public class PersonneService implements PersonneInterface {
@Autowired
PersonneRepository personneRepository;
	
	@Override
	public Personne createPersonne(Personne p) {
		// TODO Auto-generated method stub
		return personneRepository.save(p);
	}

	@Override
	public Optional<Personne> GetPersonneById(long id) {
		// TODO Auto-generated method stub
		return personneRepository.findById(id);
	}

	@Override
	public List<Personne> GetAllPersonne() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

	@Override
	public void deletePersonne(long id) {
		// TODO Auto-generated method stub
		personneRepository.deleteById(id);
	}

}
