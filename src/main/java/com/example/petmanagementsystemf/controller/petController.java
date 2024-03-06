package com.example.petmanagementsystemf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.petmanagementsystemf.model.petAttribute;
import com.example.petmanagementsystemf.service.petService;


@RestController
public class petController {

	@Autowired
	private petService petServices;

	@GetMapping("/get")
	public List<petAttribute> Petss() {
		return petServices.getAllPets();
	}

	@PostMapping("/add")
	public petAttribute addPet(@RequestBody petAttribute pet) {
		petAttribute p = petServices.addPet(pet);
		System.out.println(p);
		return p;
	}

	@PutMapping("/update/{id}")
	public petAttribute updatePet(@RequestBody petAttribute pet) {
		petAttribute p1 = petServices.updatePet(pet);
		return p1;
	}

	@DeleteMapping("/delete/{id}")
	public String deletePet(@PathVariable long id) {
		return petServices.deletePets(id);

	}

}

