package com.studentmanagementapp.studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studentmanagementapp.DAO.StudentDAO;
import com.studentmanagementapp.api.Student;
import com.studentmanagementapp.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String home() {
		return "Home";
	}
	@GetMapping("/showstudent")
	public String showStudentList(Model model) {
		
		List<Student> studentlist = studentService.loadStudents();
//		for(Student tempstudent: studentlist) {
//			System.out.println(tempstudent);
//		}
		model.addAttribute("students", studentlist);
		return "student-list";
	}

	@GetMapping("/showaddstudent")
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "add-student";
	}
	
	
	@PostMapping("/save-student")
	public String saveStudent(Student student) {
		if(student.getId()==0) {
			studentService.saveStudent(student);
		}
		else {
			studentService.update(student);
		}
//		studentService.saveStudent(studentDTO);
//		System.out.println(studentDTO);
		return "redirect:/showstudent";
	}
	@GetMapping("/updatestudent")
	public String updateStudent(@RequestParam("userId") int id,Model model) {
		System.out.println("ID : "+id);
		Student theStudent = studentService.getStudent(id);
		model.addAttribute("student",theStudent); 
		System.out.println(theStudent);
		return "add-student";
	}
	@GetMapping("/deletestudent")
	public String deleteStudent(@RequestParam("userId") int id) {
		System.out.println("ID : "+id);
		studentService.deleteStudent(id);
		return "redirect:/showstudent";
	}
	
	@RequestMapping("/conatctus")
	public String contactUs() {
		return "contact-us";
	}
}
