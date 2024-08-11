package com.demo.micro.school;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "Student",path = "/student")
public interface StudentClient {
    @GetMapping("/school/{school-id}")
    List<Student> getAllStudentsBySchoolId(@PathVariable("school-id") String schoolId);
}
