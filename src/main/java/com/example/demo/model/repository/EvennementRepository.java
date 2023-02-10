package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entities.Evennement;

public interface EvennementRepository extends JpaRepository<Evennement, Long> {

}
