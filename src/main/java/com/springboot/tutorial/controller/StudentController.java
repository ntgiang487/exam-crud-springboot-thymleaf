package com.springboot.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.tutorial.dto.StudentDTO;
import com.springboot.tutorial.service.IStudentService;

@Controller
@RequestMapping("/student/")
public class StudentController {

	@Autowired
	private IStudentService studentService;

//	@GetMapping("/")
//	public String indexControll()
//	@GetMapping("signup")
//	public String showSignUpForm(StudentDTO studentDTO) {
//		System.out.println("da chay vao day");
//		return "add-student";
//	}

	@GetMapping("list")
	public String showUpdateForm(Model model) {
		List<StudentDTO> studentDTOs = studentService.findAll();
		model.addAttribute("studentlist", studentDTOs);
		return "view";
	}

	/*
	 * Đánh dấu object với @Valid để validator tự động kiểm tra object đó có hợp lệ
	 * hay không: @NotBlank, @Size, @Email, v.v..
	 */
//	@PostMapping("add")
//	public String addStudent(@Valid StudentDTO studentDTO, BindingResult result, Model model) {
//		if (result.hasErrors()) {
//			return "add-student";
//		}
//		studentService.saveStudent(studentDTO);
//		return "redirect:list";
//	}
//
//	@PostMapping("update/{studentId}")
//	public String updateStudent(@PathVariable("studentId") Integer studentId, @Valid StudentDTO studentDTO,
//			BindingResult result, Model model) {
//		if (result.hasErrors()) {
//			studentDTO.setStudentId(studentId);
//			return "update-student";
//		}
//		studentService.saveStudent(studentDTO);
//		model.addAttribute("studentlist", studentService.findAll());
//		return "index";
//	}
//
//	@GetMapping("delete/{studentId}")
//	public String deleteStudent(@PathVariable("studentId") Integer studentId, Model model) {
//		StudentDTO studentDTO = studentService.findByStudentId(studentId);
////		StudentDTO student = studentService.findByStudentId(studentId)
////	            .orElseThrow(() - > new IllegalArgumentException("Invalid student Id:" + studentId));
//		studentService.deleteByStudentId(studentDTO);
//		model.addAttribute("studentlist", studentService.findAll());
//		return "index";
//	}

}
