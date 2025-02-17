package com.lesleylu.LesleySpringBoot.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
            new Student(UUID.randomUUID(),"Lesley", "Lu", "lesleylu@email.com", Student.Gender.FEMALE),
            new Student(UUID.randomUUID(),"Abigail", "Lu", "abigaillu@email.com", Student.Gender.FEMALE)
        );
    }
}
