package com.demo.micro.school;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/school")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;

    @GetMapping("")
    public List<School> getAllSchool(){
        return schoolService.getAllSchools();
    }
    @PostMapping("/add")
    public School addSchool(@RequestBody School school){
        return schoolService.addSchool(school);
    }
    @GetMapping("/{school-id}")
    public School getSchoolById(@PathVariable("school-id") String schoolId){
        return schoolService.getSchoolById(schoolId);
    }
    @GetMapping("/student/{school-id}")
    public Response getAllStudentBySchoolId(@PathVariable("school-id") String schoolId){
        return schoolService.getAllStudentBySchoolId(schoolId);
    }
}
