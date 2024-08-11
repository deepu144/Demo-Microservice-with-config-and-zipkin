package com.demo.micro.school;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SchoolRepo extends MongoRepository<School,String> {
    Optional<School> findBySchoolId(String schoolId);
}

