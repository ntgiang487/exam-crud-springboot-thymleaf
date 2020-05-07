package com.springboot.tutorial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.tutorial.dto.StudentDTO;

@Service
public interface IStudentService {

	List<StudentDTO> findAll();

}
