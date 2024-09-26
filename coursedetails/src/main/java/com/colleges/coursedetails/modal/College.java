package com.colleges.coursedetails.modal;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", accommodation=" + accommodation + ", accommodationFee="
				+ accommodationFee + ", courses=" + courses + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String accommodation;
	private Double accommodationFee;
	
	@OneToMany(mappedBy="college",cascade=CascadeType.ALL)
	private List<Course> courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccommodation() {
		return accommodation;
	}

	public void setAccommodation(String accommodation) {
		this.accommodation = accommodation;
	}

	public Double getAccommodationFee() {
		return accommodationFee;
	}

	public void setAccommodationFee(Double accommodationFee) {
		this.accommodationFee = accommodationFee;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	

}
