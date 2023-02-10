package com.example.demo.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// crée une clé primaire auto increment
	private long id;
	@Column(nullable = false)
	private String nomcomplet;
	@Email
	private String email;
	@Min(value = 10)
	@Max(value = 90)
	private int age;
	@NotBlank
	private String profession;
	private String adresse,telephone;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomcomplet() {
		return nomcomplet;
	}
	public void setNomcomplet(String nomcomplet) {
		this.nomcomplet = nomcomplet;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(long id, String nomcomplet, @Email String email, @Min(10) @Max(90) int age,
			@NotBlank String profession, String adresse, String telephone) {
		super();
		this.id = id;
		this.nomcomplet = nomcomplet;
		this.email = email;
		this.age = age;
		this.profession = profession;
		this.adresse = adresse;
		this.telephone = telephone;
	}
	

}
