package com.colleges.coursedetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colleges.coursedetails.modal.College;

public interface CollegeRepository extends JpaRepository<College, Long>{

}
