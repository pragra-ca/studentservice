package com.example.studentservice.rest;

import com.example.studentservice.entity.Student;
import com.example.studentservice.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
public class Controller {
    private final StudentRepo repo;

    @GetMapping("/student")
    public List<?> getAllStudent(){
        return repo.findAll();
    }
    @GetMapping("/student/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id){
        return repo.findById(id);
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        return repo.save(student);
    }

}
