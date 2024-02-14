package com.emp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	 public long getId() {
	        return id;
	    }

	    // Setter for id
	    public void setId(long id) {
	        this.id = id;
	    }

	    // Getter for firstName
	    public String getFirstName() {
	        return firstName;
	    }

	    // Setter for firstName
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    // Getter for lastName
	    public String getLastName() {
	        return lastName;
	    }

	    // Setter for lastName
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    // Getter for email
	    public String getEmail() {
	        return email;
	    }

	    // Setter for email
	    public void setEmail(String email) {
	        this.email = email;
	    }
	}