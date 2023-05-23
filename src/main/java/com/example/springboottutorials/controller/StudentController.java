package com.example.springboottutorials.controller;

import com.example.springboottutorials.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping()
public class StudentController {

    @GetMapping("students")
    public List<Student> showStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nazar", "Zhuhan"));
        students.add(new Student("Nazar2", "Zhuhan"));
        students.add(new Student("Nazar3", "Zhuhan"));
        return students;
    }

    @GetMapping("student")
    public Student showStudent(@RequestParam String firstName, @RequestParam String lastName) {
        return new Student(firstName, lastName);
    }

    @GetMapping("students/{id}")
    public int showID(@PathVariable(name = "id") int identification) {
        return identification;
    }
}
