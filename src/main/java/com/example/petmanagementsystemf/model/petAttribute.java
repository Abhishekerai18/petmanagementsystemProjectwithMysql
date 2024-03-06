package com.example.petmanagementsystemf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
public class petAttribute {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	private String name;
	private String breed;
	private String age;
	private String description;

	public petAttribute() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", breed=" + breed + ", age=" + age + ", description=" + description
				+ "]";
	}

	public petAttribute(long id, String name, String breed, String age, String description) {
		super();
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
