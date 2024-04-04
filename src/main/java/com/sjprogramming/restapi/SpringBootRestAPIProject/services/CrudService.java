package com.sjprogramming.restapi.SpringBootRestAPIProject.services;

import com.sjprogramming.restapi.SpringBootRestAPIProject.dto.StudentRequest;
import com.sjprogramming.restapi.SpringBootRestAPIProject.entity.Student;
import com.sjprogramming.restapi.SpringBootRestAPIProject.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CrudService {
    private final StudentRepository studentRepository;

    public CrudService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudent(int id, StudentRequest data) {
        Optional<Student> studentdata = studentRepository.findById(id);
        if (studentdata.isPresent()){
            Student student = studentdata.get();
            log.info(String.valueOf(student));
            student.setName(data.getName());
            student.setPercentage(data.getPercentage());
            studentRepository.save(student);
            return student;
        }
        return null ;

    }
}
