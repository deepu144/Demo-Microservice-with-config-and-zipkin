package com.demo.micro.school;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private String schoolId;
    private String schoolName;
    private String schoolEmail;
    private List<Student> students;
}
