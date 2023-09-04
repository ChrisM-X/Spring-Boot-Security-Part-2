package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Admins {

	@Id
	@GeneratedValue
	@Min(0)
	private int id;
	
	// Use @JsonIgnore to prevent Mass Assignment or remove the field entirely.
	//@JsonIgnore
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Admins [id=" + id + ", name=" + name + "]";
	}
}
