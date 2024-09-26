package com.colleges.dtos;

import java.util.List;

public class CollegeDTO {
	private String name;
    private String accommodation;
    private Double accommodationFee;
    private List<CourseDTO> courses;
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
	public List<CourseDTO> getCourses() {
		return courses;
	}
	public void setCourses(List<CourseDTO> courses) {
		this.courses = courses;
	}

}
