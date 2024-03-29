package com.ashutosh.learningspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "ashutosh"),
                new Course(2, "Learn Devops", "vinod"),
                new Course(3, "Learn azure", "pranjal"),
                new Course(4, "Learn azure", "prajal")
        );
    }

}
