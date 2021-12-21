package com.example.jpastudent.controller;

import com.example.jpastudent.model.Student;
import com.example.jpastudent.service.StudentRepository;
import com.example.jpastudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){
      return   studentService.getStudents();
    }

    @PostMapping("/create")
    public void create(@RequestBody Student student){
        studentService.create(student);
    }


}
