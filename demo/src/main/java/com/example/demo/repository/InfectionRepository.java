package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Infection;

@Repository
public interface InfectionRepository extends JpaRepository<Infection, Integer>{

}
