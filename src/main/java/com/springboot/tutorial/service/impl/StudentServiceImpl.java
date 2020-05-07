package com.springboot.tutorial.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.tutorial.dto.StudentDTO;
import com.springboot.tutorial.entity.Student;
import com.springboot.tutorial.repository.IStudentRepository;
import com.springboot.tutorial.service.IStudentService;

@Component
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository studentRepository;

	ModelMapper modelMapper= new ModelMapper();

	@Override
	public List<StudentDTO> findAll() {
		List<StudentDTO> studentDTOs=new ArrayList<StudentDTO>();
		List<Student> students=studentRepository.findAll();
		for (Student student : students) {
			studentDTOs.add(modelMapper.map(student, StudentDTO.class));
			
		}
		return studentDTOs;
	}

}
