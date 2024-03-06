package com.example.petmanagementsystemf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petmanagementsystemf.model.petAttribute;

public interface Pets extends JpaRepository<petAttribute, Long>{

}
