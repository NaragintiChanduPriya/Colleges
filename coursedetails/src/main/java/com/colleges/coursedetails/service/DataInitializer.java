//package com.colleges.coursedetails.service;
//
//import java.util.Arrays;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.colleges.coursedetails.modal.College;
//import com.colleges.coursedetails.modal.Course;
//import com.colleges.coursedetails.repository.CollegeRepository;
//
//@Configuration
//public class DataInitializer {
//
//    @Autowired
//    private CollegeRepository collegeRepository;
//
//    @Bean
//    public CommandLineRunner loadData() {
//        return args -> {
//            College college1 = new College();
//            college1.setName("Adithya College");
//            college1.setAccommodation("AC");
//            college1.setAccommodationFee(5000.0);
//
//            Course course1 = new Course();
//            course1.setName("Computer Science");
//            course1.setFee(10000.0);
//            course1.setDuration("4 years");
//            course1.setCollege(college1);
//
//            Course course2 = new Course();
//            course2.setName("Mechanical Engineering");
//            course2.setFee(12000.0);
//            course2.setDuration("4 years");
//            course2.setCollege(college1);
//
//            college1.setCourses(Arrays.asList(course1, course2));
//
//            College college2 = new College();
//            college2.setName("Ambedhkar University");
//            college2.setAccommodation("Non-AC");
//            college2.setAccommodationFee(3000.0);
//
//            Course course3 = new Course();
//            course3.setName("Electrical Engineering");
//            course3.setFee(11000.0);
//            course3.setDuration("4 years");
//            course3.setCollege(college2);
//
//            Course course4 = new Course();
//            course4.setName("Civil Engineering");
//            course4.setFee(9000.0);
//            course4.setDuration("4 years");
//            course4.setCollege(college2);
//
//            college2.setCourses(Arrays.asList(course3, course4));
//
//            College college3 = new College();
//            college3.setName("Amirta Institute");
//            college3.setAccommodation("AC");
//            college3.setAccommodationFee(6000.0);
//
//            Course course5 = new Course();
//            course5.setName("Information Technology");
//            course5.setFee(10500.0);
//            course5.setDuration("4 years");
//            course5.setCollege(college3);
//
//            Course course6 = new Course();
//            course6.setName("Biotechnology");
//            course6.setFee(11500.0);
//            course6.setDuration("4 years");
//            course6.setCollege(college3);
//
//            college3.setCourses(Arrays.asList(course5, course6));
//
//            College college4 = new College();
//            college4.setName("Srinidhi College");
//            college4.setAccommodation("Non-AC");
//            college4.setAccommodationFee(4000.0);
//
//            Course course7 = new Course();
//            course7.setName("Chemical Engineering");
//            course7.setFee(9500.0);
//            course7.setDuration("4 years");
//            course7.setCollege(college4);
//
//            Course course8 = new Course();
//            course8.setName("Aerospace Engineering");
//            course8.setFee(13000.0);
//            course8.setDuration("4 years");
//            course8.setCollege(college4);
//
//            college4.setCourses(Arrays.asList(course7, course8));
//
//            College college5 = new College();
//            college5.setName("SRM University");
//            college5.setAccommodation("AC");
//            college5.setAccommodationFee(7000.0);
//
//            Course course9 = new Course();
//            course9.setName("Physics");
//            course9.setFee(8000.0);
//            course9.setDuration("3 years");
//            course9.setCollege(college5);
//
//            Course course10 = new Course();
//            course10.setName("Mathematics");
//            course10.setFee(8500.0);
//            course10.setDuration("3 years");
//            course10.setCollege(college5);
//
//            college5.setCourses(Arrays.asList(course9, course10));
//
//            collegeRepository.saveAll(Arrays.asList(college1, college2, college3, college4, college5));
//        };
//    }
//}
//
