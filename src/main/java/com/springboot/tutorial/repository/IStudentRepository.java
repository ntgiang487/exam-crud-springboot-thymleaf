package com.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.tutorial.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Long>{

}
