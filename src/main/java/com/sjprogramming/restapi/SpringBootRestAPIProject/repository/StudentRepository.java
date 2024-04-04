package com.sjprogramming.restapi.SpringBootRestAPIProject.repository;

import com.sjprogramming.restapi.SpringBootRestAPIProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
