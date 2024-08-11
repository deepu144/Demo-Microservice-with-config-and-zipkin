package com.demo.micro.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {
    public final StudentRepo studentRepo;

    public Student addStudent(Student student) {
        student.setStudentId(UUID.randomUUID().toString());
        return studentRepo.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public Student getStudentById(String studentId) {
        return studentRepo.findByStudentId(studentId)
                .orElse(
                        Student.builder()
                                .name("NO_STUDENT")
                                .build()
                );
    }

    public List<Student> getAllStudentBySchoolId(String schoolId) {
        return studentRepo.findBySchoolId(schoolId);
    }
}
