package com.sjprogramming.restapi.SpringBootRestAPIProject.controller;

import com.sjprogramming.restapi.SpringBootRestAPIProject.dto.StudentRequest;
import com.sjprogramming.restapi.SpringBootRestAPIProject.entity.Student;
import com.sjprogramming.restapi.SpringBootRestAPIProject.repository.StudentRepository;
import com.sjprogramming.restapi.SpringBootRestAPIProject.services.CrudService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class StudentController {
    private final CrudService crudService;

    @Autowired
    StudentRepository repo;
    //get all the students
    //localhost:8080/students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = repo.findAll();
        return students;
    }

    //localhost:8080/students/1
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        Student student = repo.findById(id).get();
        return student;
    }

    @PostMapping("/student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Map<String, Object> createStudent(@RequestBody Student student){
        repo.save(student);

        Map<String, Object> response = new HashMap<>();
        response.put("name", student.getName());
        response.put("percentage", student.getPercentage());

        return response;
    }

    @PutMapping("/student/ubdate/{id}")
    public Student updateStudents(@PathVariable int id,@RequestBody StudentRequest student) {
        return crudService.getStudent(id,student);
    }



    @DeleteMapping("/student/delete/{id}")
    public String removeStudent(@PathVariable int id) {
        Student student = repo.findById(id).get();
        repo.delete(student);
        return "Delete Success";
    }
}
