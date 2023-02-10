package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.services.PersonneService;
import com.example.demo.model.entities.Personne;

@SpringBootApplication
public class BackendgestionApplication implements CommandLineRunner {

	@Autowired
	PersonneService ps;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendgestionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Personne personne=new Personne(1, "khalil lakhdhar", "test@gmail.com", 33, "enseignant","Gabés", "20999333");
		ps.createPersonne(personne);
	}

}
