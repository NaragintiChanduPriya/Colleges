package com.colleges.coursedetails.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private Double fee;
private String duration;

@ManyToOne
@JoinColumn(name="college_id")
private College college;

@Override
public String toString() {
	return "Course [id=" + id + ", name=" + name + ", fee=" + fee + ", duration=" + duration + ", college=" + college
			+ "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getFee() {
	return fee;
}

public void setFee(Double fee) {
	this.fee = fee;
}

public String getDuration() {
	return duration;
}

public void setDuration(String duration) {
	this.duration = duration;
}

public College getCollege() {
	return college;
}

public void setCollege(College college) {
	this.college = college;
}

}
