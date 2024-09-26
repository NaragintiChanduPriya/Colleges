package com.colleges.coursedetails.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.colleges.coursedetails.repository.CollegeRepository;
import com.colleges.dtos.CollegeDTO;
import com.colleges.dtos.CourseDTO;
import com.colleges.coursedetails.modal.*;

@Service
public class CollegeService {
	@Autowired
	private CollegeRepository collegeRepo;
	
	
	public List<CollegeDTO> getAllColleges(){
		List<College> colleges=collegeRepo.findAll();
		return colleges.stream().map(this::convertToDTO).collect(Collectors.toList());
		
	}
	public ResponseEntity<CollegeDTO> getCollegeById(Long id) {
		College college = collegeRepo.findById(id).orElse(null);
        if (college == null) {
            return ResponseEntity.notFound().build();
        }
        CollegeDTO collegeDTO = convertToDTO(college);
        return ResponseEntity.ok(collegeDTO);
		

	}
	 private CollegeDTO convertToDTO(College college) {
	        CollegeDTO collegeDTO = new CollegeDTO();
	        collegeDTO.setName(college.getName());
	        collegeDTO.setAccommodation(college.getAccommodation());
	        collegeDTO.setAccommodationFee(college.getAccommodationFee());

	        List<CourseDTO> courseDTOs = college.getCourses().stream()
	            .map(course -> {
	                CourseDTO courseDTO = new CourseDTO();
	                courseDTO.setName(course.getName());
	                courseDTO.setFee(course.getFee());
	                courseDTO.setDuration(course.getDuration());
	                return courseDTO;
	            }).collect(Collectors.toList());

	        collegeDTO.setCourses(courseDTOs);
	        return collegeDTO;
	    }


	
	

}
