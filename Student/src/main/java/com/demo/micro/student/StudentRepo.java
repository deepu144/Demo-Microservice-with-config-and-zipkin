package com.demo.micro.student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends MongoRepository<Student,String> {
    Optional<Student> findByStudentId(String studentId);
    List<Student> findBySchoolId(String schoolId);
}
