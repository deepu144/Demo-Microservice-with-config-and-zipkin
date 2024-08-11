package com.demo.micro.student;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("/{student-id}")
    public Student getStudentById(@PathVariable("student-id") String studentId){
        return studentService.getStudentById(studentId);
    }
    @GetMapping("/school/{school-id}")
    public List<Student> getAllStudentsBySchoolId(@PathVariable("school-id") String schoolId){
        return studentService.getAllStudentBySchoolId(schoolId);
    }
}
