package ru.geekbrains.university.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.university.model.Student;
import ru.geekbrains.university.repositories.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id).get();
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        // student.setId(null);
        return studentRepository.save(student);
    }

//    @GetMapping("/search_by_name")
//    public Student searchByName(@RequestParam String name) {
//        return studentRepository.findByName(name).get();
//    }
//
//    @GetMapping("/test")
//    public Student testMethod() {
//        return studentRepository.customFinderById(2L, "Bob").get();
//    }
}
