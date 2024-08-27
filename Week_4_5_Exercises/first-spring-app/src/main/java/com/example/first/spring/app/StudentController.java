package com.example.first.spring.app;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/student")
	public Student student() {
		return new Student("Anandha","Ponni");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> arr=new ArrayList<>();
		arr.add(new Student("Anandha","Ponni"));
		arr.add(new Student("Anandha","Krishnan"));
		arr.add(new Student("Anandha","Geethan"));
		arr.add(new Student("Anandha","Lakshmi"));
		return arr;
	}
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
		return new Student(firstName,lastName);
	}

	@GetMapping("/student/query")
	public Student studentQueryParameter(@RequestParam(name="firstName") String firstName,@RequestParam(name="lastName") String lastName) {
		return new Student(firstName,lastName);
	}
}
  