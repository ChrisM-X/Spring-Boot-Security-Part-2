package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import com.example.demo.model.Admins;

@Entity
public class School {
	
	/*
	 * The @Id annotation is used to define the primary key of the table.
	 * The @GeneratedValue means that Spring will auto increment this value whenever
	 * a new Student Object is created. 
	 */
	@Id
	@GeneratedValue
	@Min(0)
	private int id;
	
	private String name;
	
	private int rooms;
	
	private int students;

	@ManyToMany(cascade = {CascadeType.ALL})
	private List<Admins> admin;
	
	
	/*
	 * Get/Set methods for the 4 fields.
	 */
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRooms() {
		return rooms;
	}

	public int getStudents() {
		return students;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public void setStudents(int students) {
		this.students = students;
	}
	


	public List<Admins> getAdmin() {
		return admin;
	}

	public void setAdmin(List<Admins> admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", rooms=" + rooms + ", student=" + students + "]";
	}

}  // end class
