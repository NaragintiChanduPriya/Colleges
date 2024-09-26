package com.colleges.coursedetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colleges.coursedetails.modal.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
