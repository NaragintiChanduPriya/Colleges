package com.colleges.coursedetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.colleges.coursedetails.service.CollegeService;
import com.colleges.dtos.CollegeDTO;

import java.util.*;
@CrossOrigin
@RestController
@RequestMapping("/api/colleges")
public class CollegeController {
	@Autowired
	private CollegeService collegeservice;
    
	@GetMapping
	public List<CollegeDTO> getAllColleges(){
		System.out.print("Bleww it came");
		return collegeservice.getAllColleges();
	}
	@GetMapping("/{id}")
	public ResponseEntity<CollegeDTO> getCollegeById(@PathVariable Long id){
		return collegeservice.getCollegeById(id);
		
	}
}
