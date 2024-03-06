package com.example.petmanagementsystemf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petmanagementsystemf.model.petAttribute;
import com.example.petmanagementsystemf.repository.Pets;

@Service
public class petService {

	@Autowired
	private Pets petRepository;

	public List<petAttribute> getAllPets() {
		return petRepository.findAll();
	}

	public petAttribute addPet(petAttribute pet) {
		petAttribute p = petRepository.save(pet);
		return p;
	}

	public petAttribute updatePet(petAttribute pet) {
		return petRepository.save(pet);
	}

	public String deletePets(long id) {
		petRepository.deleteById(id);

		return "Deletion Successful";

	}
}
