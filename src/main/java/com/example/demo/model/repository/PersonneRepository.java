package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
