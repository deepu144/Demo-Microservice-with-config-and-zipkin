package com.demo.micro.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepo schoolRepo;
    private final StudentClient studentClient;

    public List<School> getAllSchools() {
        return schoolRepo.findAll();
    }

    public School addSchool(School school) {
        school.setSchoolId(UUID.randomUUID().toString());
        return schoolRepo.save(school);
    }

    public School getSchoolById(String schoolId) {
        return schoolRepo.findBySchoolId(schoolId)
                .orElse(
                        School
                                .builder()
                                .name("NO_SCHOOL")
                                .build()
                );
    }

    public Response getAllStudentBySchoolId(String schoolId) {
        var school = schoolRepo.findBySchoolId(schoolId).get();
        var student= studentClient.getAllStudentsBySchoolId(schoolId);
        return Response.builder()
                .schoolId(schoolId)
                .schoolName(school.getName())
                .schoolEmail(school.getEmail())
                .students(student)
                .build();
    }
}
